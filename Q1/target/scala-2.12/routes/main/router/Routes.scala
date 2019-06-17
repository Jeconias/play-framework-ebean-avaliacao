// @GENERATOR:play-routes-compiler
// @SOURCE:/home/developer/play-framework-ebean-avaliacao/Q1/conf/routes
// @DATE:Sun Jun 16 23:53:25 BRT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:13
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:13
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """popular""", """controllers.HomeController.popular"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """livros/autor""", """controllers.HomeController.listarLivrosAutor"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """livros/compradores""", """controllers.HomeController.listarLivrosComprador"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """livros/editora""", """controllers.HomeController.listarLivrosEditora"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_popular1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("popular")))
  )
  private[this] lazy val controllers_HomeController_popular1_invoker = createInvoker(
    HomeController_1.popular,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "popular",
      Nil,
      "GET",
      this.prefix + """popular""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_listarLivrosAutor2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("livros/autor")))
  )
  private[this] lazy val controllers_HomeController_listarLivrosAutor2_invoker = createInvoker(
    HomeController_1.listarLivrosAutor,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "listarLivrosAutor",
      Nil,
      "POST",
      this.prefix + """livros/autor""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_listarLivrosComprador3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("livros/compradores")))
  )
  private[this] lazy val controllers_HomeController_listarLivrosComprador3_invoker = createInvoker(
    HomeController_1.listarLivrosComprador,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "listarLivrosComprador",
      Nil,
      "POST",
      this.prefix + """livros/compradores""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_listarLivrosEditora4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("livros/editora")))
  )
  private[this] lazy val controllers_HomeController_listarLivrosEditora4_invoker = createInvoker(
    HomeController_1.listarLivrosEditora,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "listarLivrosEditora",
      Nil,
      "POST",
      this.prefix + """livros/editora""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:7
    case controllers_HomeController_popular1_route(params@_) =>
      call { 
        controllers_HomeController_popular1_invoker.call(HomeController_1.popular)
      }
  
    // @LINE:8
    case controllers_HomeController_listarLivrosAutor2_route(params@_) =>
      call { 
        controllers_HomeController_listarLivrosAutor2_invoker.call(HomeController_1.listarLivrosAutor)
      }
  
    // @LINE:9
    case controllers_HomeController_listarLivrosComprador3_route(params@_) =>
      call { 
        controllers_HomeController_listarLivrosComprador3_invoker.call(HomeController_1.listarLivrosComprador)
      }
  
    // @LINE:10
    case controllers_HomeController_listarLivrosEditora4_route(params@_) =>
      call { 
        controllers_HomeController_listarLivrosEditora4_invoker.call(HomeController_1.listarLivrosEditora)
      }
  
    // @LINE:13
    case controllers_Assets_versioned5_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
