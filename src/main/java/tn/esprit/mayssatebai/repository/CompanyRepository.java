package tn.esprit.mayssatebai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mayssatebai.entity.Company;

public interface CompanyRepository extends JpaRepository<Company,Long> {
public Company findByCompanyName(String CompanyName);
}
