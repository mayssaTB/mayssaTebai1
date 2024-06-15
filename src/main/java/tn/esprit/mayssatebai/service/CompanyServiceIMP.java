package tn.esprit.mayssatebai.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mayssatebai.entity.Company;
import tn.esprit.mayssatebai.repository.CompanyRepository;


@AllArgsConstructor
@Service
public class CompanyServiceIMP implements ICompany{

    private CompanyRepository companyRepository;
    @Override
    public Company addCompany(Company company) {
        if(company.getCompanyName()==null) {
            throw new IllegalArgumentException("Company name cannot be null");
        }
        return companyRepository.save(company);
    }
}
