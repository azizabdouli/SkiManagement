package tn.esprit.spring.entity;

import jakarta.persistence.*;

@Entity
@Table(name="InscriptionT")
public class Inscription {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long  numInscription;
    private int numSeamine;
    @ManyToOne
    Cours cours;
    @ManyToOne
    Skieur skieurs;


}
