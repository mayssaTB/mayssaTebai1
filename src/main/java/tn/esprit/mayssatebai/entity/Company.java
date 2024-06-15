package tn.esprit.mayssatebai.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
public class Company {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long companyId;
    private String companyName;
    private String adress;

    @OneToMany(mappedBy ="company")
    @JsonIgnore
    private List<Employe> employeList;

}
