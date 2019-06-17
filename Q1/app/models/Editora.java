package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Editora extends Model {

  @Id
  private Integer codigo;

  @Column(length=35,nullable=false)
  private String endereco;

  @Column(length=25,nullable=false)
  private String gerente;

  @Column(length=15,nullable=false)
  private String telefone;


  public Editora() { }

  public Editora(String endereco, String gerente, String telefone) {
      this.endereco = endereco;
      this.gerente = gerente;
      this.telefone = telefone;
  }

  public void setCodigo(Integer codigo){
    this.codigo = codigo;
  }

  public void setEndereco(String endereco){
    this.endereco = endereco;
  }

  public void setGerente(String gerente){
    this.gerente = gerente;
  }

  public void setTelefone(String telefone){
    this.telefone = telefone;
  }


  public Integer getCodigo(){
    return this.codigo;
  }

  public String getEndereco(){
    return this.endereco;
  }

  public String getGerente(){
    return this.gerente;
  }

  public String getTelefone(){
    return this.telefone;
  }

  public static final Finder<Integer, Editora> find = new Finder<>(Editora.class);

}
