package tn.esprit.mayssatebai.service;

import tn.esprit.mayssatebai.entity.Employe;

public interface IEmploye {

    public Employe addEmployeAndAssignToCompany(Employe employe, String
            campanyName);
}
