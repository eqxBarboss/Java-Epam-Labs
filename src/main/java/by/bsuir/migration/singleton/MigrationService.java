package by.bsuir.migration.singleton;

import by.bsuir.devteam.entity.SoftwareProduct;
import by.bsuir.devteam.entity.employee.BusinessAnalyst;
import by.bsuir.devteam.entity.employee.Developer;
import by.bsuir.devteam.entity.employee.TeamLead;
import by.bsuir.devteam.entity.employee.Tester;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MigrationService {

    private static MigrationService migrationService;

    private MigrationService() {
    }

    public static MigrationService getInstance() {
        if (migrationService == null) {
            migrationService = new MigrationService();
        }
        return migrationService;
    }

    public void migrateSoftwareProduct(Connection connection, SoftwareProduct softwareProduct) throws SQLException {
        PreparedStatement statement =
                connection.prepareStatement("INSERT INTO softwareProducts (customer, title) VALUES (?,?);");
        statement.setString(1, softwareProduct.getCustomer());
        statement.setString(2, softwareProduct.getTitle());
        statement.executeUpdate();
        statement.close();
    }

    public void migrateTeamLead(Connection connection, TeamLead teamLead) throws SQLException {
        PreparedStatement statement =
                connection.prepareStatement("INSERT INTO teamLeads (name, surname, phoneNumber, favoriteGame, motto) VALUES (?,?,?,?,?);");
        statement.setString(1, teamLead.getName());
        statement.setString(2, teamLead.getSurname());
        statement.setString(3, teamLead.getPhoneNumber());
        statement.setString(4, teamLead.getFavoriteGame());
        statement.setString(5, teamLead.getMotto());
        statement.executeUpdate();
        statement.close();
    }

    public void migrateDevelopers(Connection connection, List<Developer> developerList) throws SQLException {
        PreparedStatement statement = null;
        for (Developer developer : developerList) {
            statement = connection.prepareStatement("INSERT INTO developers (name, surname, phoneNumber, favoriteGame) VALUES (?,?,?,?);");
            statement.setString(1, developer.getName());
            statement.setString(2, developer.getSurname());
            statement.setString(3, developer.getPhoneNumber());
            statement.setString(4, developer.getFavoriteGame());
            statement.executeUpdate();
            statement.close();
        }
    }

    public void migrateTesters(Connection connection, List<Tester> testerList) throws SQLException {
        PreparedStatement statement = null;
        for (Tester tester : testerList) {
            statement = connection.prepareStatement("INSERT INTO testers (name, surname, phoneNumber, testsWritten) VALUES (?,?,?,?);");
            statement.setString(1, tester.getName());
            statement.setString(2, tester.getSurname());
            statement.setString(3, tester.getPhoneNumber());
            statement.setInt(4, tester.getTestWritten());
            statement.executeUpdate();
            statement.close();
        }
    }

    public void migrateBusinessAnalysts(Connection connection, List<BusinessAnalyst> businessAnalystList) throws SQLException {
        PreparedStatement statement = null;
        for (BusinessAnalyst businessAnalyst : businessAnalystList) {
            statement = connection.prepareStatement("INSERT INTO businessAnalysts (name, surname, phoneNumber, nickName) VALUES (?,?,?,?);");
            statement.setString(1, businessAnalyst.getName());
            statement.setString(2, businessAnalyst.getSurname());
            statement.setString(3, businessAnalyst.getPhoneNumber());
            statement.setString(4, businessAnalyst.getNickName());
            statement.executeUpdate();
            statement.close();
        }
    }
}
