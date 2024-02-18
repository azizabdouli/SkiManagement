package tn.esprit.spring.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="SkieurT")
public class Skieur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long  numSkieur;
    private String nomS;
    private String prenomS;
     private LocalDate dateNaissance;


    private String ville;
    @OneToMany (mappedBy = "skieurs")
    private Set<Inscription> Inscriptions;
    @ManyToMany (mappedBy = "skieurs")
    private Set<Piste> pistes;
    @OneToOne
    private Abonnement abonnement;



}
