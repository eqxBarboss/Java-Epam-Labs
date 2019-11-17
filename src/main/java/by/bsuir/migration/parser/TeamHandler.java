package by.bsuir.migration.parser;

import by.bsuir.devteam.entity.Entity;
import by.bsuir.devteam.entity.SoftwareProduct;
import by.bsuir.devteam.entity.employee.*;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class TeamHandler extends DefaultHandler {

    private TeamLead teamLead;
    private SoftwareProduct softwareProduct;
    private StringBuilder data = new StringBuilder();

    private List<Developer> developerList = new ArrayList<>();
    private List<Tester> testerList = new ArrayList<>();
    private List<BusinessAnalyst> businessAnalystList = new ArrayList<>();

    private Entity entity;

    public SoftwareProduct getSoftwareProduct() {
        return softwareProduct;
    }

    public TeamLead getTeamLead() {
        return teamLead;
    }

    public List<Developer> getDeveloperList() {
        return developerList;
    }

    public List<Tester> getTesterList() {
        return testerList;
    }

    public List<BusinessAnalyst> getBusinessAnalystList() {
        return businessAnalystList;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        data.setLength(0);
        if (qName.equals("softwareProduct"))
        {
            entity = new SoftwareProduct();
        }
        else if (qName.equals("teamLead"))
        {
            entity = new TeamLead();
        }
        else if (qName.equals("developer"))
        {
            entity = new Developer();
        }
        else if (qName.equals("tester"))
        {
            entity = new Tester();
        }
        else if (qName.equals("businessAnalyst"))
        {
            entity = new BusinessAnalyst();
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (entity instanceof TeamLead || entity instanceof Developer ||
                entity instanceof Tester || entity instanceof BusinessAnalyst)
        {
            Employee employee = (Employee)entity;
            if (qName.equals("name")) {
                employee.setName(data.toString());
                return;
            }
            if (qName.equals("surname")) {
                employee.setSurname(data.toString());
                return;
            }
            if (qName.equals("phoneNumber")) {
                employee.setPhoneNumber(data.toString());
                return;
            }
        }

        if (entity instanceof SoftwareProduct)
        {
            if (qName.equals("customer")) {
                ((SoftwareProduct) entity).setCustomer(data.toString());
            }
            else if (qName.equals("title")) {
                ((SoftwareProduct) entity).setTitle(data.toString());
            }
            else {
                softwareProduct = (SoftwareProduct) entity;
                entity = null;
                return;
            }
        }
        else if (entity instanceof TeamLead)
        {
            if (qName.equals("favoriteGame")) {
                ((TeamLead) entity).setFavoriteGame(data.toString());
            }
            else if (qName.equals("motto")) {
                ((TeamLead) entity).setMotto(data.toString());
            }
            else {
                teamLead = (TeamLead) entity;
                entity = null;
                return;
            }
        }
        else if (entity instanceof Developer)
        {
            if (qName.equals("favoriteGame")) {
                ((Developer) entity).setFavoriteGame(data.toString());
            }
            else {
                developerList.add((Developer)entity);
                entity = null;
                return;
            }
        }
        else if (entity instanceof Tester)
        {
            if (qName.equals("testsWritten")) {
                ((Tester) entity).setTestWritten(Integer.parseInt(data.toString()));
            }
            else {
                testerList.add((Tester) entity);
                entity = null;
                return;
            }
        }
        else if (entity instanceof BusinessAnalyst)
        {
            if (qName.equals("nickName")) {
                ((BusinessAnalyst) entity).setNickName(data.toString());
            }
            else {
                businessAnalystList.add((BusinessAnalyst) entity);
                entity = null;
                return;
            }
        }
    }

    @Override
    public void characters(char[] ch, int start, int length){
        data.append(ch, start, length);
    }
}
