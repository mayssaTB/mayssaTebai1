package tn.esprit.mayssatebai.restcontroller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.mayssatebai.entity.Employe;
import tn.esprit.mayssatebai.service.IEmploye;


@RestController
@AllArgsConstructor
public class EmployeRestController {

    private IEmploye iEmploye;


    @PostMapping("/addEmployeAndAssignToCompany/{companyName}")
    public Employe addEmployeAndAssignToCompany(@RequestBody Employe employe, @PathVariable String companyName){
       return iEmploye.addEmployeAndAssignToCompany(employe,companyName);
    }
}
