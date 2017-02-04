
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/oushindou/Documents/workspace/tmerge/conf/routes
// @DATE:Sat Feb 04 23:47:10 JST 2017


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
