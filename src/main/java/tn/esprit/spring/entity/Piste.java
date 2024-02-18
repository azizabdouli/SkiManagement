package tn.esprit.spring.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="PisteT")
public class Piste implements Serializable {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  Long numPiste ;

    @Enumerated(EnumType.STRING)
    private Couleur couleur ;

    private  String nomPiste;
    @ManyToMany
    private Set<Skieur> skieurs;


}
