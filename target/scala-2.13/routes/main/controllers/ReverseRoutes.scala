// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def insertjson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "insertjson")
    }
  
    // @LINE:13
    def insert(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "insert")
    }
  
    // @LINE:19
    def retrivebyid(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "retrivebyid" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("id", id)))))
    }
  
    // @LINE:20
    def retrive(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "retrive")
    }
  
    // @LINE:17
    def insertdata(id:Int, s1:String, s2:String, s3:String, s4:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "insertdata/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("s1", s1)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("s2", s2)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("s3", s3)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("s4", s4)))
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:24
    def retrivejson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "retrivejson")
    }
  
  }

  // @LINE:26
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
