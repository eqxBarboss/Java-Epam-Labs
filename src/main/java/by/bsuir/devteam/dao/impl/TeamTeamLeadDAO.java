package by.bsuir.devteam.dao.impl;

import by.bsuir.devteam.dao.TeamLeadDAO;
import by.bsuir.devteam.entity.employee.TeamLead;
import by.bsuir.devteam.singleton.SingletonTeam;

public class TeamTeamLeadDAO implements TeamLeadDAO {
    @Override
    public void set(TeamLead teamLead) {
        SingletonTeam.getInstance().setTeamLead(teamLead);
    }

    @Override
    public TeamLead get() {
        return SingletonTeam.getInstance().getTeamLead();
    }

    @Override
    public void update(TeamLead teamLead) {
        SingletonTeam.getInstance().setTeamLead(teamLead);
    }

    @Override
    public void delete() {
        SingletonTeam.getInstance().setTeamLead(null);
    }
}
