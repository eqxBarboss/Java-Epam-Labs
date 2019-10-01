package by.bsuir.devteam.service;

import by.bsuir.devteam.entity.crud.BusinessAnalysts;
import by.bsuir.devteam.entity.employee.BusinessAnalyst;
import by.bsuir.devteam.singleton.SingletonTeam;

import java.util.Optional;

public class BusinessAnalystService {

    private BusinessAnalysts businessAnalysts = SingletonTeam.getInstance().getBusinessAnalysts();

    public void hireBusinessAnalyst(BusinessAnalyst businessAnalyst){
        businessAnalysts.add(businessAnalyst);
    }

    public void fireBusinessAnalystById(int id){
        businessAnalysts.deleteById(id);
    }

    public Optional<BusinessAnalyst> getBusinessAnalystById(int id){
        return businessAnalysts.getById(id);
    }

    public void updateBusinessAnalystDataById(int id, BusinessAnalyst businessAnalyst){
        businessAnalysts.update(id, businessAnalyst);
    }

    public String getAllBusinessAnalysts(){
        return businessAnalysts.toString();
    }
}
