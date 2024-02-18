package tn.esprit.spring.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="AbonnementT")
public class Abonnement {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long numAbon;
    private LocalDate datedebut;
    private LocalDate datefin;

    private float prixAbon;
    @Enumerated(EnumType.STRING)
    private  TypeAbonnement typeAbonnement;

}
