package by.bsuir.devteam.service;

import by.bsuir.devteam.dao.SoftwareProductDAO;
import by.bsuir.devteam.dao.factory.DAOFactory;
import by.bsuir.devteam.entity.SoftwareProduct;
import by.bsuir.devteam.entity.Team;
import by.bsuir.devteam.singleton.SingletonTeam;

public class SoftwareProductService {
    private SoftwareProductDAO softwareProductDAO = DAOFactory.getInstance().getSoftWareProductDAO();

    public boolean addSoftwareProduct(SoftwareProduct softwareProduct) {
        if (softwareProductDAO.get() == null) {
            softwareProductDAO.set(softwareProduct);
            return true;
        }
        return false;
    }

    public boolean deleteSoftwareProduct(){
        if (softwareProductDAO.get() == null){
            return false;
        }
        softwareProductDAO.set(null);
        return true;
    }

    public SoftwareProduct getSoftwareProduct(){
        return softwareProductDAO.get();
    }

    public void updateSoftwareProduct(SoftwareProduct softwareProduct){
        SoftwareProduct sp = softwareProductDAO.get();

        if (sp != null && sp.getId() == softwareProduct.getId())
            softwareProductDAO.set(softwareProduct);
    }
}
