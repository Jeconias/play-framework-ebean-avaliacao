
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[Livro],List[Editora],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(livros:List[Livro], editoras : List[Editora]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Q1")/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""
"""),format.raw/*4.1*/("""<div>
  <a href="popular">Popular Banco</a>
</div>
<div>
  <h3>Listar todos os livros de um Determinado Autor</h3>
   <form action="/livros/autor" method="post">
      <select name="autor">
        """),_display_(/*11.10*/for(livro <- livros) yield /*11.30*/{_display_(Seq[Any](format.raw/*11.31*/("""
          """),format.raw/*12.11*/("""<option value=""""),_display_(/*12.27*/livro/*12.32*/.getAutor()),format.raw/*12.43*/("""">"""),_display_(/*12.46*/livro/*12.51*/.getAutor()),format.raw/*12.62*/("""</option>
        """)))}),format.raw/*13.10*/("""
      """),format.raw/*14.7*/("""</select>
      <input type="submit" value="Exibir Livros do Autor">
   </form>
</div>

<div>
  <h3>Listar todos os clientes (físico) que compraram determinado livro</h3>
  <form action="/livros/compradores" method="post">
      <select name="isbn">
        """),_display_(/*23.10*/for(livro <- livros) yield /*23.30*/{_display_(Seq[Any](format.raw/*23.31*/("""
          """),format.raw/*24.11*/("""<option value=""""),_display_(/*24.27*/livro/*24.32*/.getIsbn()),format.raw/*24.42*/("""">"""),_display_(/*24.45*/livro/*24.50*/.getAssunto()),format.raw/*24.63*/("""</option>
        """)))}),format.raw/*25.10*/("""
      """),format.raw/*26.7*/("""</select>
      <input type="submit" value="Exibir todos os compradores">
  </form>
</div>

<div>
    <h3>Listar todos livros de uma determinada Editora</h3>
    <form action="/livros/editora" method="post">
        <select name="editora">
          """),_display_(/*35.12*/for(editora <- editoras) yield /*35.36*/{_display_(Seq[Any](format.raw/*35.37*/("""
            """),format.raw/*36.13*/("""<option value=""""),_display_(/*36.29*/editora/*36.36*/.getCodigo()),format.raw/*36.48*/("""">"""),_display_(/*36.51*/editora/*36.58*/.getCodigo()),format.raw/*36.70*/("""</option>
          """)))}),format.raw/*37.12*/("""
        """),format.raw/*38.9*/("""</select>
        <input type="submit" value="Exibir todos os livros de uma Editora">
    </form>
  </div>
  
""")))}),format.raw/*43.2*/("""
"""))
      }
    }
  }

  def render(livros:List[Livro],editoras:List[Editora]): play.twirl.api.HtmlFormat.Appendable = apply(livros,editoras)

  def f:((List[Livro],List[Editora]) => play.twirl.api.HtmlFormat.Appendable) = (livros,editoras) => apply(livros,editoras)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jun 16 23:56:03 BRT 2019
                  SOURCE: /home/developer/play-framework-ebean-avaliacao/Q1/app/views/index.scala.html
                  HASH: cbc0ae8d0f115be6de9bf84bd0b6dfbbf5e83114
                  MATRIX: 967->1|1107->48|1134->50|1152->60|1191->62|1218->63|1444->262|1480->282|1519->283|1558->294|1601->310|1615->315|1647->326|1677->329|1691->334|1723->345|1773->364|1807->371|2093->630|2129->650|2168->651|2207->662|2250->678|2264->683|2295->693|2325->696|2339->701|2373->714|2423->733|2457->740|2735->991|2775->1015|2814->1016|2855->1029|2898->1045|2914->1052|2947->1064|2977->1067|2993->1074|3026->1086|3078->1107|3114->1116|3255->1227
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|43->12|44->13|45->14|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|55->24|56->25|57->26|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|67->36|68->37|69->38|74->43
                  -- GENERATED --
              */
          