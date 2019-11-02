package by.bsuir.devteam.dao;

import by.bsuir.devteam.entity.SoftwareProduct;

public interface SoftwareProductDAO {
    void set(SoftwareProduct softwareProduct);
    SoftwareProduct get();
    void update(SoftwareProduct softwareProduct);
    void delete();
}