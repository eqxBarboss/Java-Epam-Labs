package by.bsuir.devteam.entity;

import by.bsuir.devteam.entity.crud.BusinessAnalysts;
import by.bsuir.devteam.entity.crud.Developers;
import by.bsuir.devteam.entity.crud.Testers;
import by.bsuir.devteam.entity.employee.TeamLead;

public class Team implements java.io.Serializable{

    private TeamLead teamLead;
    private SoftwareProduct softwareProduct;
    private Testers testers;
    private Developers developers;
    private BusinessAnalysts businessAnalysts;

    public Team() {

    }

    public Team(Testers testers, Developers developers, BusinessAnalysts businessAnalysts,
                TeamLead teamLead, SoftwareProduct softwareProduct) {
        this.testers = testers;
        this.developers = developers;
        this.businessAnalysts = businessAnalysts;
        this.teamLead = teamLead;
        this.softwareProduct = softwareProduct;
    }

    public TeamLead getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(TeamLead teamLead) {
        this.teamLead = teamLead;
    }

    public SoftwareProduct getSoftwareProduct() {
        return softwareProduct;
    }

    public void setSoftwareProduct(SoftwareProduct softwareProduct) {
        this.softwareProduct = softwareProduct;
    }
}
