package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Medico extends Model {

    @Id
    private Long codigo;
    
    @Column(length=50)
    private String nome;

    @Column(length=35)
    private String especialidade;

    @Column(length=15)
    private String crm;

    @OneToMany
    private List<Atende> atendimentos;


    public static final Finder<Long, Medico> find = new Finder<>(Medico.class);
}