package by.bsuir.devteam.dao.factory;

import by.bsuir.devteam.dao.*;
import by.bsuir.devteam.dao.impl.*;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();
    private final BusinessAnalystDAO teamBusinessAnalystDAO = new TeamBusinessAnalystDAO();
    private final DeveloperDAO teamDeveloperDAO = new TeamDeveloperDAO();
    private final TesterDAO teamTesterDAO = new TeamTesterDAO();
    private final TeamLeadDAO teamTeamLeadDAO = new TeamTeamLeadDAO();
    private final SoftwareProductDAO teamSoftwareProductDAO = new TeamSoftwareProductDAO();

    private DAOFactory() {}

    public static DAOFactory getInstance() {
        return instance;
    }

    public BusinessAnalystDAO getBusinessAnalystDAO() {
        return teamBusinessAnalystDAO;
    }

    public DeveloperDAO getDeveloperDAO(){
        return teamDeveloperDAO;
    }

    public TesterDAO getTesterDAO() {
        return teamTesterDAO;
    }

    public TeamLeadDAO getTeamLeadDAO() {
        return teamTeamLeadDAO;
    }

    public SoftwareProductDAO getSoftWareProductDAO(){
        return teamSoftwareProductDAO;
    }
}
