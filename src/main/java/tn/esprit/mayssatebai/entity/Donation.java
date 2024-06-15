package tn.esprit.mayssatebai.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
public class Donation {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long donId;
    private float amount;
    private LocalDate date;
    private DonationType type;
@ManyToOne
private Employe employe;
    @ManyToOne
    private RedCrescent red;
}
