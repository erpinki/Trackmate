
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/bharatvision/newproject/conf/routes
// @DATE:Sun Jul 23 14:37:12 IST 2017


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
