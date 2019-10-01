package by.bsuir.devteam.entity;

import by.bsuir.devteam.entity.crud.BusinessAnalysts;
import by.bsuir.devteam.entity.crud.Developers;
import by.bsuir.devteam.entity.crud.Testers;
import by.bsuir.devteam.entity.employee.TeamLead;

import java.util.Objects;
import java.util.stream.IntStream;

public class Team implements java.io.Serializable{

    private TeamLead teamLead;
    private SoftwareProduct softwareProduct;
    private Testers testers;
    private Developers developers;
    private BusinessAnalysts businessAnalysts;
    private int maxId;

    public Team(){

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

    public Testers getTesters() {
        return testers;
    }

    public void setTesters(Testers testers) {
        this.testers = testers;
    }

    public Developers getDevelopers() {
        return developers;
    }

    public void setDevelopers(Developers developers) {
        this.developers = developers;
    }

    public BusinessAnalysts getBusinessAnalysts() {
        return businessAnalysts;
    }

    public void setBusinessAnalysts(BusinessAnalysts businessAnalysts) {
        this.businessAnalysts = businessAnalysts;
    }

    public int getMaxId(){
        return this.maxId;
    }

    public void updateMaxId(){
        int max = 0;

        developers.updateMaxId();
        testers.updateMaxId();
        businessAnalysts.updateMaxId();

        if (teamLead != null)
            max = teamLead.getId();
        if (softwareProduct != null && softwareProduct.getId() > max)
            max = softwareProduct.getId();

        this.maxId = IntStream.of(developers.getMaxId(), testers.getMaxId(), businessAnalysts.getMaxId(), max)
                .max()
                .getAsInt();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(teamLead, team.teamLead) &&
                Objects.equals(softwareProduct, team.softwareProduct) &&
                Objects.equals(testers, team.testers) &&
                Objects.equals(developers, team.developers) &&
                Objects.equals(businessAnalysts, team.businessAnalysts);
    }

    @Override
    public int hashCode() {

        return Objects.hash(teamLead, softwareProduct, testers, developers, businessAnalysts);
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamLead=" + teamLead +
                ", softwareProduct=" + softwareProduct +
                ", testers=" + testers +
                ", developers=" + developers +
                ", businessAnalysts=" + businessAnalysts +
                '}';
    }
}