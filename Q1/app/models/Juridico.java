package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Juridico extends Cliente {

  @Column(length=14,nullable=false)
  private String cnpj;

  @OneToMany(mappedBy="juridico")
  private List<Compra> compras;

  public Juridico() {}

  public Juridico(String endereco, String telefone, String cnpj){
      super(endereco,telefone);
      this.cnpj = cnpj;
      this.compras = new ArrayList<Compra>();
  }

  public String getCnpj(){
    return this.cnpj;
  }

  public void setCnpj(String cnpj){
    this.cnpj = cnpj;
  }

  public static final Finder<Integer, Juridico> find = new Finder<>(Juridico.class);

}