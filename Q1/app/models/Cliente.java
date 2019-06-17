package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@MappedSuperclass
public class Cliente extends Model {

   @Id
  private Integer codigo;

  @Column(length=25,nullable=false)
  private String endereco;

  @Column(length=15,nullable=false)
  private String telefone;
  

  public Cliente () { }

  public Cliente (String endereco, String telefone) {
    this.endereco = endereco;
    this.telefone = telefone;
  }

  public void setCodigo(){
    this.codigo = codigo;
  }

  public void setEndereco(){
    this.endereco = endereco;
  }

  public void setTelefone(){
    this.telefone = telefone;
  }


  public Integer getCodigo(){
    return this.codigo;
  }

  public String getEndereco(){
    return this.endereco;
  }

  public String getTelefone(){
    return this.telefone;
  }

}
