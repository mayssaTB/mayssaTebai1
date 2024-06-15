package tn.esprit.mayssatebai.restcontroller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.mayssatebai.entity.Company;
import tn.esprit.mayssatebai.service.ICompany;

@RestController
@AllArgsConstructor
public class CompanyRestController {
    private ICompany iCompany;

@PostMapping("/addCompany")
    public Company addComapny(@RequestBody  Company company){
    if(company.getCompanyName()==null) {
        throw new IllegalArgumentException("Company name cannot be null");
    }
        return iCompany.addCompany(company) ;
    }
}
