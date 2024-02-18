package tn.esprit.spring.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="MoniteurT")
public class Moniteur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long numMoniteur;
    private  String nomM;

    private String prenomM;

    private LocalDate dateRecru;
    @OneToMany
    private Set<Cours> Cours;






}
