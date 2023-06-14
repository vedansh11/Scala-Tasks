// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_0: controllers.HomeController,
  // @LINE:26
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_0: controllers.HomeController,
    // @LINE:26
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """insert""", """controllers.HomeController.insert()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """insertdata/""" + "$" + """id<[^/]+>/""" + "$" + """s1<[^/]+>/""" + "$" + """s2<[^/]+>/""" + "$" + """s3<[^/]+>/""" + "$" + """s4<[^/]+>""", """controllers.HomeController.insertdata(id:Int, s1:String, s2:String, s3:String, s4:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """retrivebyid""", """controllers.HomeController.retrivebyid(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """retrive""", """controllers.HomeController.retrive()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """insertjson""", """controllers.HomeController.insertjson()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """retrivejson""", """controllers.HomeController.retrivejson()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(),
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

  // @LINE:13
  private[this] lazy val controllers_HomeController_insert1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("insert")))
  )
  private[this] lazy val controllers_HomeController_insert1_invoker = createInvoker(
    HomeController_0.insert(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "insert",
      Nil,
      "GET",
      this.prefix + """insert""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_insertdata2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("insertdata/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("s1", """[^/]+""",true), StaticPart("/"), DynamicPart("s2", """[^/]+""",true), StaticPart("/"), DynamicPart("s3", """[^/]+""",true), StaticPart("/"), DynamicPart("s4", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_insertdata2_invoker = createInvoker(
    HomeController_0.insertdata(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "insertdata",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """insertdata/""" + "$" + """id<[^/]+>/""" + "$" + """s1<[^/]+>/""" + "$" + """s2<[^/]+>/""" + "$" + """s3<[^/]+>/""" + "$" + """s4<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_retrivebyid3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("retrivebyid")))
  )
  private[this] lazy val controllers_HomeController_retrivebyid3_invoker = createInvoker(
    HomeController_0.retrivebyid(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "retrivebyid",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """retrivebyid""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_retrive4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("retrive")))
  )
  private[this] lazy val controllers_HomeController_retrive4_invoker = createInvoker(
    HomeController_0.retrive(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "retrive",
      Nil,
      "GET",
      this.prefix + """retrive""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_insertjson5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("insertjson")))
  )
  private[this] lazy val controllers_HomeController_insertjson5_invoker = createInvoker(
    HomeController_0.insertjson(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "insertjson",
      Nil,
      "GET",
      this.prefix + """insertjson""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_retrivejson6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("retrivejson")))
  )
  private[this] lazy val controllers_HomeController_retrivejson6_invoker = createInvoker(
    HomeController_0.retrivejson(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "retrivejson",
      Nil,
      "GET",
      this.prefix + """retrivejson""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
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
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index())
      }
  
    // @LINE:13
    case controllers_HomeController_insert1_route(params@_) =>
      call { 
        controllers_HomeController_insert1_invoker.call(HomeController_0.insert())
      }
  
    // @LINE:17
    case controllers_HomeController_insertdata2_route(params@_) =>
      call(params.fromPath[Int]("id", None), params.fromPath[String]("s1", None), params.fromPath[String]("s2", None), params.fromPath[String]("s3", None), params.fromPath[String]("s4", None)) { (id, s1, s2, s3, s4) =>
        controllers_HomeController_insertdata2_invoker.call(HomeController_0.insertdata(id, s1, s2, s3, s4))
      }
  
    // @LINE:19
    case controllers_HomeController_retrivebyid3_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_HomeController_retrivebyid3_invoker.call(HomeController_0.retrivebyid(id))
      }
  
    // @LINE:20
    case controllers_HomeController_retrive4_route(params@_) =>
      call { 
        controllers_HomeController_retrive4_invoker.call(HomeController_0.retrive())
      }
  
    // @LINE:22
    case controllers_HomeController_insertjson5_route(params@_) =>
      call { 
        controllers_HomeController_insertjson5_invoker.call(HomeController_0.insertjson())
      }
  
    // @LINE:24
    case controllers_HomeController_retrivejson6_route(params@_) =>
      call { 
        controllers_HomeController_retrivejson6_invoker.call(HomeController_0.retrivejson())
      }
  
    // @LINE:26
    case controllers_Assets_versioned7_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
