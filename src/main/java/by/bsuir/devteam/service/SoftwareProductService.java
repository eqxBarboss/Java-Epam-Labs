package by.bsuir.devteam.service;

import by.bsuir.devteam.entity.SoftwareProduct;
import by.bsuir.devteam.entity.Team;
import by.bsuir.devteam.singleton.SingletonTeam;

public class SoftwareProductService {

    private Team team = SingletonTeam.getInstance();

    public boolean addSoftwareProduct(SoftwareProduct softwareProduct) {
        if (team.getSoftwareProduct() == null) {
            team.setSoftwareProduct(softwareProduct);
            return true;
        }
        return false;
    }

    public boolean deleteSoftwareProduct(){
        if (team.getSoftwareProduct() == null){
            return false;
        }
        team.setSoftwareProduct(null);
        return true;
    }

    public SoftwareProduct getSoftwareProduct(){
        return team.getSoftwareProduct();
    }

    public void updateSoftwareProduct(SoftwareProduct softwareProduct){
        SoftwareProduct sp = team.getSoftwareProduct();

        if (sp != null && sp.getId() == softwareProduct.getId())
            team.setSoftwareProduct(softwareProduct);
    }
}
