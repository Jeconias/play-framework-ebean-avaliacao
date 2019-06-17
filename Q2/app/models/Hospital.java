package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Hospital extends Model {

    @Id
    private Long codigo;
    
    @Column(length=50)
    private String nome;

    @OneToMany
    private List<PlanoSaude> planos;


    public static final Finder<Long, Hospital> find = new Finder<>(Hospital.class);
}