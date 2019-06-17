package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class AlaHospital extends Model {

    @Id
    private Long codigo;


    public static final Finder<Long, AlaHospital> find = new Finder<>(AlaHospital.class);
}