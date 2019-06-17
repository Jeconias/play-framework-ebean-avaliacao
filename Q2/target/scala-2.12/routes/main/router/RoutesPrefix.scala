// @GENERATOR:play-routes-compiler
// @SOURCE:/home/developer/Q2/conf/routes
// @DATE:Sun Jun 16 22:15:21 BRT 2019


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
