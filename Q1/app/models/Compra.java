package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Compra extends Model {

  @Id
  private Integer codigo;

  @ManyToOne
  public Livro livro;

  @ManyToOne(optional=true, targetEntity=Fisico.class)
  public Fisico fisico;

  @ManyToOne(optional=true, targetEntity=Juridico.class)
  public Juridico juridico;


  public Compra () { }

  public Compra (Fisico fisico, Livro livro) {
    this.fisico = fisico;
    this.livro = livro;
  }

  public Compra (Juridico juridico, Livro livro) {
    this.juridico = juridico;
    this.livro = livro;
  }


  public void setCodigo(Integer codigo){
    this.codigo = codigo;
  }

  public void setLivro(Livro livro){
    this.livro = livro;
  }

  public void setFisico(Fisico fisico){
    this.fisico = fisico;
  }

  public void setJuridico(Juridico juridico){
    this.juridico = juridico;
  }


  public Integer getCodigo(){
    return this.codigo;
  }

  public Livro getLivro(){
    return this.livro;
  }

  public Fisico getFisico(){
    return this.fisico;
  }

  public Juridico getJuridico(){
    return this.juridico;
  }

  public static final Finder<Integer, Compra> find = new Finder<>(Compra.class);

}
