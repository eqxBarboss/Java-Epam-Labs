package by.bsuir.devteam.dao.impl;

import by.bsuir.devteam.dao.SoftwareProductDAO;
import by.bsuir.devteam.entity.SoftwareProduct;
import by.bsuir.devteam.singleton.SingletonTeam;

public class TeamSoftwareProductDAO implements SoftwareProductDAO{

    @Override
    public void set(SoftwareProduct softwareProduct) {
        SingletonTeam.getInstance().setSoftwareProduct(softwareProduct);
    }

    @Override
    public SoftwareProduct get() {
        return SingletonTeam.getInstance().getSoftwareProduct();
    }

    @Override
    public void update(SoftwareProduct softwareProduct) {
        SingletonTeam.getInstance().setSoftwareProduct(softwareProduct);
    }

    @Override
    public void delete() {
        SingletonTeam.getInstance().setSoftwareProduct(null);
    }
}
