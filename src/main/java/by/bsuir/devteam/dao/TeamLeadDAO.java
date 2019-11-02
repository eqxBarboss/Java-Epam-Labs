package by.bsuir.devteam.dao;

import by.bsuir.devteam.entity.employee.TeamLead;

public interface TeamLeadDAO {
    void set(TeamLead teamLead);
    TeamLead get();
    void update(TeamLead teamLead);
    void delete();
}