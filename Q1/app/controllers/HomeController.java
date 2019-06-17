package controllers;

import play.mvc.*;
import models.*;
import java.util.*;

public class HomeController extends Controller {

  public Result index() {
    List<Livro> livros = Livro.find.query().select("autor").findList();
    List<Editora> editoras = Editora.find.query().select("*").findList();
    return ok(views.html.index.render(livros, editoras));
  }

  public Result listarLivrosEditora(){
    Map<String, String[]> dataForm = request().body().asFormUrlEncoded();
		String codigoEditora = String.valueOf(dataForm.get("editora")[0]);

    List<Livro> livros = Livro.find.query().select("*").where().eq("editora_codigo", codigoEditora).findList();
    int qtd = livros.size();
    String livrosStr = "";

    for(int i = 0; i < qtd; i++){
      livrosStr += livros.get(i).getAssunto() + "\n";
    }

    return ok(livrosStr);
  }

  public Result listarLivrosComprador(){
    Map<String, String[]> dataForm = request().body().asFormUrlEncoded();
		String isbn = String.valueOf(dataForm.get("isbn")[0]);

    List<Compra> compradores = Compra.find.query().select("*").where().eq("livro_isbn", isbn).findList();
    int qtd = compradores.size();
    String nomesCompradores = "";

    for(int i = 0; i < qtd; i++){
      nomesCompradores += compradores.get(i).getFisico().getCpf() + "\n";
    }

    return ok(nomesCompradores);
  }

  public Result listarLivrosAutor(){
    Map<String, String[]> dataForm = request().body().asFormUrlEncoded();
		String autorName = String.valueOf(dataForm.get("autor")[0]);

    List<Livro> livrosAutor = Livro.find.query().select("assunto").where().eq("autor", autorName).findList();
    String livros = "";
    int livrosQtd = livrosAutor.size();

    for(int i = 0; i < livrosQtd; i++){
      livros += livrosAutor.get(i).getAssunto() + "\n";
    }

    return ok(livros);
  }


  public Result popular(){

    Editora ed1 = new Editora("Rua Editora 1","Maria Editora 1","(00) 00000-0000");
    ed1.save();

    Editora ed2 = new Editora("Rua Editora 2","Maria Editora 2","(00) 00000-1111");
    ed2.save();



    Livro l1 = new Livro(10,"Livro Bonito de Ler","João Silva","0001");
    l1.setEditora(ed1);
    l1.save();

    Livro l2 = new Livro(20,"Livro - O bom e o ruim","Marcos Oliveira","0002");
    l2.setEditora(ed1);
    l2.save();

    Livro l3 = new Livro(4,"Livro - O último ato","João Silva","0005");
    l3.setEditora(ed2);
    l3.save();


    Fisico n1 = new Fisico("Jeconias Santos F1","(00) 0000-0001","CPF1");
    n1.save();

    Fisico n2 = new Fisico("Jeconias Santos F2","(00) 0000-0002","CPF2");
    n2.save();

    Fisico n3 = new Fisico("José Jeconias F3","(00) 0000-0003","CPF3");
    n3.save();

    Juridico n4 = new Juridico("José Jeconias J2","(00) 0000-0005","CNPJ2");
    n4.save();


    Compra c1 = new Compra(n1,l1);
    c1.save();

    Compra c2 = new Compra(n2,l1);
    c2.save();

    Compra c3 = new Compra(n3,l2);
    c3.save();

    Compra c4 = new Compra(n1,l2);
    c4.save();

    return ok("Banco Populado.");
  }
}
