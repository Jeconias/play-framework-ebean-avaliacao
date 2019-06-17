// @GENERATOR:play-routes-compiler
// @SOURCE:/home/developer/play-framework-ebean-avaliacao/Q1/conf/routes
// @DATE:Sun Jun 16 23:53:25 BRT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def listarLivrosAutor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.listarLivrosAutor",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "livros/autor"})
        }
      """
    )
  
    // @LINE:9
    def listarLivrosComprador: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.listarLivrosComprador",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "livros/compradores"})
        }
      """
    )
  
    // @LINE:7
    def popular: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.popular",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "popular"})
        }
      """
    )
  
    // @LINE:10
    def listarLivrosEditora: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.listarLivrosEditora",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "livros/editora"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
