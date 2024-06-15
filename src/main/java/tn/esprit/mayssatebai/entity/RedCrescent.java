package tn.esprit.mayssatebai.entity;

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
public class RedCrescent {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private long redCId;
    private String area;

    @OneToMany(mappedBy = "red")
private List<Donation> donationList;


}
