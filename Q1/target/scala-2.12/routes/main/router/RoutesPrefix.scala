// @GENERATOR:play-routes-compiler
// @SOURCE:/home/developer/play-framework-ebean-avaliacao/Q1/conf/routes
// @DATE:Sun Jun 16 23:53:25 BRT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
