package tn.esprit.spring.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="CourT")
public class Cours {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long  numCours;
    private int niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours  typeCours;
    @Enumerated(EnumType.STRING)
    private Support  support;
    private float prix;

    private int creneau;
@OneToMany (mappedBy = "cours")
    private Set<Inscription> Inscriptions;




}
