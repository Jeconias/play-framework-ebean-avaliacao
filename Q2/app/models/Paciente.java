package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Paciente extends Model {

    @Id
    private Long codigo;
    
    @Column(length=50)
    private String nome;

    @Column(length=50)
    private String cpf;

    @OneToMany
    private List<Atende> atendimentos;

    @Column(nullable=true)
    @OneToOne
    private PlanoSaude planosaude;


    public static final Finder<Long, Paciente> find = new Finder<>(Paciente.class);
}