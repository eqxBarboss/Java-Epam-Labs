package by.bsuir.migration;

import by.bsuir.migration.exception.DataBaseException;
import by.bsuir.migration.exception.ValidationException;
import by.bsuir.migration.parser.TeamHandler;
import by.bsuir.migration.singleton.MigrationService;
import by.bsuir.migration.validator.XSDValidator;
import by.bsuir.migration.singleton.DataBase;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class MigrationMain {

    public static void main(String[] args) {

        try {
            XSDValidator.validate(new File("src/main/java/team.xml"), new File("src/main/java/teamSchema.xsd"));
        } catch (ValidationException e) {
            return;
        }

        TeamHandler handler = new TeamHandler();
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse("src/main/java/team.xml", handler);
        }
        catch (ParserConfigurationException | SAXException | IOException e){
            return;
        }

        DataBase dataBase = DataBase.getInstance();
        try {
            Connection connection = dataBase.getConnection();
            MigrationService migrationService = MigrationService.getInstance();
            try {
                migrationService.migrateSoftwareProduct(connection, handler.getSoftwareProduct());
                migrationService.migrateTeamLead(connection, handler.getTeamLead());
                migrationService.migrateDevelopers(connection, handler.getDeveloperList());
                migrationService.migrateTesters(connection, handler.getTesterList());
                migrationService.migrateBusinessAnalysts(connection, handler.getBusinessAnalystList());
            }
            catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
        catch (DataBaseException e)
        {

        }
    }
}