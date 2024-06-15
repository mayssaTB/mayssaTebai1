package tn.esprit.mayssatebai.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mayssatebai.entity.Company;
import tn.esprit.mayssatebai.entity.Employe;
import tn.esprit.mayssatebai.repository.CompanyRepository;
import tn.esprit.mayssatebai.repository.EmployeRepository;


@AllArgsConstructor
@Service
public class EmployeServiceIMP implements IEmploye{

    private EmployeRepository employeRepository;
    private CompanyRepository companyRepository;
    @Override
    public Employe addEmployeAndAssignToCompany(Employe employe, String companyName) {
        Company company =companyRepository.findByCompanyName(companyName);
        if(company!=null){
            employe.setCompany(company);
            return employeRepository.save(employe);
        }
        else{
            throw new IllegalArgumentException("Company with name " + companyName + " does not exist");
        }

    }
}
