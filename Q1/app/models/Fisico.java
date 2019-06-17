package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Fisico extends Cliente {

  @Column(length=11,nullable=false)
  private String cpf;

  @OneToMany(mappedBy="fisico")
  private List<Compra> compras;


  public Fisico() {}

  public Fisico(String endereco, String telefone, String cpf){
      super(endereco,telefone);
      this.cpf = cpf;
      this.compras = new ArrayList<Compra>();
  }

  public String getCpf(){
    return this.cpf;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }

  public static final Finder<Integer, Fisico> find = new Finder<>(Fisico.class);

}