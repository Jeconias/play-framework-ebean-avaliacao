package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class PlanoSaude extends Model {

    @Id
    private Long codigo;
    
    @Column(length=50)
    private String nome;

    @Column(length=15)
    private String fone;

    @OneToMany
    private List<Paciente> paciente;

    @ManyToOne
    private Hospital hospital;


    public static final Finder<Long, PlanoSaude> find = new Finder<>(PlanoSaude.class);
}