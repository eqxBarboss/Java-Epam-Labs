package by.bsuir.devteam.service;

import by.bsuir.devteam.dao.TeamLeadDAO;
import by.bsuir.devteam.dao.factory.DAOFactory;
import by.bsuir.devteam.entity.Team;
import by.bsuir.devteam.entity.employee.TeamLead;
import by.bsuir.devteam.singleton.SingletonTeam;

public class TeamLeadService {
    private TeamLeadDAO teamLeadDAO = DAOFactory.getInstance().getTeamLeadDAO();

    public boolean hireTeamLead(TeamLead teamLead) {
        if (teamLeadDAO.get() == null) {
            teamLeadDAO.set(teamLead);
            return true;
        }
        return false;
    }

    public boolean fireTeamLead(){
        if (teamLeadDAO.get() == null){
            return false;
        }
        teamLeadDAO.delete();
        return true;
    }

    public TeamLead getTeamLead(){
        return teamLeadDAO.get();
    }

    public void updateTeamLead(TeamLead teamLead){
        TeamLead tl = teamLeadDAO.get();

        if (tl != null && tl.getId() == teamLead.getId())
            teamLeadDAO.set(teamLead);
    }
}
