// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def insertjson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.insertjson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "insertjson"})
        }
      """
    )
  
    // @LINE:13
    def insert: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.insert",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "insert"})
        }
      """
    )
  
    // @LINE:19
    def retrivebyid: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.retrivebyid",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "retrivebyid" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:20
    def retrive: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.retrive",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "retrive"})
        }
      """
    )
  
    // @LINE:17
    def insertdata: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.insertdata",
      """
        function(id0,s11,s22,s33,s44) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "insertdata/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("s1", s11)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("s2", s22)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("s3", s33)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("s4", s44))})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:24
    def retrivejson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.retrivejson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "retrivejson"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
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
