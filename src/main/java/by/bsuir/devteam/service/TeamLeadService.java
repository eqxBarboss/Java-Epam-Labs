package by.bsuir.devteam.service;

import by.bsuir.devteam.entity.Team;
import by.bsuir.devteam.entity.employee.TeamLead;
import by.bsuir.devteam.singleton.SingletonTeam;

public class TeamLeadService {

    private Team team = SingletonTeam.getInstance();

    public boolean hireTeamLead(TeamLead teamLead) {
        if (team.getTeamLead() == null) {
            team.setTeamLead(teamLead);
            return true;
        }
        return false;
    }

    public boolean fireTeamLead(){
        if (team.getTeamLead() == null){
            return false;
        }
        team.setTeamLead(null);
        return true;
    }

    public TeamLead getTeamLead(){
        return team.getTeamLead();
    }

    public void updateTeamLead(TeamLead teamLead){
        TeamLead tl = team.getTeamLead();

        if (tl != null && tl.getId() == teamLead.getId())
            team.setTeamLead(teamLead);
    }
}
