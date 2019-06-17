// @GENERATOR:play-routes-compiler
// @SOURCE:/home/developer/play-framework-ebean-avaliacao/Q1/conf/routes
// @DATE:Sun Jun 16 23:53:25 BRT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def listarLivrosAutor(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "livros/autor")
    }
  
    // @LINE:9
    def listarLivrosComprador(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "livros/compradores")
    }
  
    // @LINE:7
    def popular(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "popular")
    }
  
    // @LINE:10
    def listarLivrosEditora(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "livros/editora")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
