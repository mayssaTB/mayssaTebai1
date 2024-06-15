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
public class Employe {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long employeId;
    private String lastName;
    private String firstName;
    private String postion;

    @ManyToOne
    private Company company;

    @OneToMany(mappedBy = "employe")
    @JsonIgnore
    private List<Donation> donationList;
}
