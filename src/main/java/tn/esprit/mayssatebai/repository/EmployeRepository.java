package tn.esprit.mayssatebai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mayssatebai.entity.Employe;

public interface EmployeRepository extends JpaRepository<Employe,Long> {
}
