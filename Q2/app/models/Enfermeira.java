package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Enfermeira extends Model {

    public Enfermeira(String nome, String cre) {
        this.nome = nome;
        this.cre = cre;
        this.enfermeiras = new ArrayList<Enfermeira>();
    }

    @Id
    private Long codigo;

    @Column(length=50)
    private String nome;

    @Column(length=50)
    private String cre;
   
    @OneToOne
    private AlaHospital alaHospital;

    @Column(nullable=true)
    @OneToMany(mappedBy="enfermeiraChefe", cascade=CascadeType.PERSIST)
    private List<Enfermeira> enfermeiras;

    @Column(nullable=true)
    @ManyToOne
    private Enfermeira enfermeiraChefe;


    public void setAlah(AlaHospital alah){
        this.alaHospital = alah;
    }

    public AlaHospital getAlah(){
        return this.alaHospital;
    }

    public void setChefia(Enfermeira enf){
        this.enfermeiras.add( enf.setChefe(this) );
    }

    public Enfermeira setChefe(Enfermeira enf){
        this.enfermeiraChefe = enf;
        return this;
    }

    public static final Finder<Long, Enfermeira> find = new Finder<>(Enfermeira.class);
}