package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Atende extends Model {

    @Id
    private Long codigo;
    
    @Constraints.Required
    private Calendar dataHora;

    @ManyToOne
    private Medico medico;

    @ManyToOne
    private Paciente paciente;

    public static final Finder<Long, Atende> find = new Finder<>(Atende.class);
}