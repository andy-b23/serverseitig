
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/andi/Desktop/relationManyToMany-2/conf/routes
// @DATE:Tue May 30 23:10:32 CEST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  LoginController_6: controllers.LoginController,
  // @LINE:8
  HomeController_1: controllers.HomeController,
  // @LINE:12
  UserController_2: controllers.UserController,
  // @LINE:24
  ProjektController_3: controllers.ProjektController,
  // @LINE:34
  CustomerController_7: controllers.CustomerController,
  // @LINE:47
  TaskController_5: controllers.TaskController,
  // @LINE:63
  SearchController_0: controllers.SearchController,
  // @LINE:67
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    LoginController_6: controllers.LoginController,
    // @LINE:8
    HomeController_1: controllers.HomeController,
    // @LINE:12
    UserController_2: controllers.UserController,
    // @LINE:24
    ProjektController_3: controllers.ProjektController,
    // @LINE:34
    CustomerController_7: controllers.CustomerController,
    // @LINE:47
    TaskController_5: controllers.TaskController,
    // @LINE:63
    SearchController_0: controllers.SearchController,
    // @LINE:67
    Assets_4: controllers.Assets
  ) = this(errorHandler, LoginController_6, HomeController_1, UserController_2, ProjektController_3, CustomerController_7, TaskController_5, SearchController_0, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, LoginController_6, HomeController_1, UserController_2, ProjektController_3, CustomerController_7, TaskController_5, SearchController_0, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.LoginController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """main""", """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.UserController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """id<[^/]+>""", """controllers.UserController.show(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.UserController.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateuser/""" + "$" + """id<[^/]+>""", """controllers.UserController.update(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """id<[^/]+>""", """controllers.UserController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduser""", """controllers.UserController.newUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteuser/""" + "$" + """id<[^/]+>""", """controllers.UserController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """edituser/""" + "$" + """id<[^/]+>""", """controllers.UserController.editUser(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projekt""", """controllers.ProjektController.list()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projekt""", """controllers.ProjektController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projekt/""" + "$" + """id<[^/]+>""", """controllers.ProjektController.show(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addprojekt""", """controllers.ProjektController.newProjekt()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteprojekt/""" + "$" + """id<[^/]+>""", """controllers.ProjektController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editprojekt/""" + "$" + """id<[^/]+>""", """controllers.ProjektController.editProjekt(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateprojekt/""" + "$" + """id<[^/]+>""", """controllers.ProjektController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customer""", """controllers.CustomerController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customer/""" + "$" + """id<[^/]+>""", """controllers.CustomerController.show(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customer""", """controllers.CustomerController.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatecustomer/""" + "$" + """id<[^/]+>""", """controllers.CustomerController.update(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customer/""" + "$" + """id<[^/]+>""", """controllers.CustomerController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcustomer""", """controllers.CustomerController.newCustomer()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletecustomer/""" + "$" + """id<[^/]+>""", """controllers.CustomerController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editcustomer/""" + "$" + """id<[^/]+>""", """controllers.CustomerController.editCustomer(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """task""", """controllers.TaskController.list()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """task""", """controllers.TaskController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addtask""", """controllers.TaskController.newTask()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """task/""" + "$" + """id<[^/]+>""", """controllers.TaskController.show(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletetask/""" + "$" + """id<[^/]+>""", """controllers.TaskController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """edittask/""" + "$" + """id<[^/]+>""", """controllers.TaskController.editTask(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatetask/""" + "$" + """id<[^/]+>""", """controllers.TaskController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.authenticate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.SearchController.showSearch()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.SearchController.search()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_LoginController_login0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_LoginController_login0_invoker = createInvoker(
    LoginController_6.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("main")))
  )
  private[this] lazy val controllers_HomeController_index1_invoker = createInvoker(
    HomeController_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """main"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UserController_list2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UserController_list2_invoker = createInvoker(
    UserController_2.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """user"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UserController_show3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_show3_invoker = createInvoker(
    UserController_2.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "show",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """user/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_UserController_create4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UserController_create4_invoker = createInvoker(
    UserController_2.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """user"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UserController_update5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateuser/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_update5_invoker = createInvoker(
    UserController_2.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """updateuser/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_delete6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_delete6_invoker = createInvoker(
    UserController_2.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """user/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UserController_newUser7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduser")))
  )
  private[this] lazy val controllers_UserController_newUser7_invoker = createInvoker(
    UserController_2.newUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "newUser",
      Nil,
      "GET",
      """""",
      this.prefix + """adduser"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_UserController_delete8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteuser/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_delete8_invoker = createInvoker(
    UserController_2.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """deleteuser/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_UserController_editUser9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("edituser/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_editUser9_invoker = createInvoker(
    UserController_2.editUser(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "editUser",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """edituser/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ProjektController_list10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projekt")))
  )
  private[this] lazy val controllers_ProjektController_list10_invoker = createInvoker(
    ProjektController_3.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjektController",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """projekt"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ProjektController_create11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projekt")))
  )
  private[this] lazy val controllers_ProjektController_create11_invoker = createInvoker(
    ProjektController_3.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjektController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """projekt"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ProjektController_show12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projekt/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjektController_show12_invoker = createInvoker(
    ProjektController_3.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjektController",
      "show",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """projekt/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ProjektController_newProjekt13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addprojekt")))
  )
  private[this] lazy val controllers_ProjektController_newProjekt13_invoker = createInvoker(
    ProjektController_3.newProjekt(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjektController",
      "newProjekt",
      Nil,
      "GET",
      """""",
      this.prefix + """addprojekt"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ProjektController_delete14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteprojekt/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjektController_delete14_invoker = createInvoker(
    ProjektController_3.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjektController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """deleteprojekt/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_ProjektController_editProjekt15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editprojekt/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjektController_editProjekt15_invoker = createInvoker(
    ProjektController_3.editProjekt(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjektController",
      "editProjekt",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """editprojekt/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_ProjektController_update16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateprojekt/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjektController_update16_invoker = createInvoker(
    ProjektController_3.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjektController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """updateprojekt/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_CustomerController_list17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customer")))
  )
  private[this] lazy val controllers_CustomerController_list17_invoker = createInvoker(
    CustomerController_7.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """customer"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_CustomerController_show18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerController_show18_invoker = createInvoker(
    CustomerController_7.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "show",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """customer/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_CustomerController_create19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customer")))
  )
  private[this] lazy val controllers_CustomerController_create19_invoker = createInvoker(
    CustomerController_7.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """customer"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_CustomerController_update20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecustomer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerController_update20_invoker = createInvoker(
    CustomerController_7.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """updatecustomer/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_CustomerController_delete21_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerController_delete21_invoker = createInvoker(
    CustomerController_7.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """customer/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_CustomerController_newCustomer22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcustomer")))
  )
  private[this] lazy val controllers_CustomerController_newCustomer22_invoker = createInvoker(
    CustomerController_7.newCustomer(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "newCustomer",
      Nil,
      "GET",
      """""",
      this.prefix + """addcustomer"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_CustomerController_delete23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletecustomer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerController_delete23_invoker = createInvoker(
    CustomerController_7.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """deletecustomer/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_CustomerController_editCustomer24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editcustomer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerController_editCustomer24_invoker = createInvoker(
    CustomerController_7.editCustomer(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "editCustomer",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """editcustomer/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_TaskController_list25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("task")))
  )
  private[this] lazy val controllers_TaskController_list25_invoker = createInvoker(
    TaskController_5.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """task"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_TaskController_create26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("task")))
  )
  private[this] lazy val controllers_TaskController_create26_invoker = createInvoker(
    TaskController_5.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """task"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_TaskController_newTask27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addtask")))
  )
  private[this] lazy val controllers_TaskController_newTask27_invoker = createInvoker(
    TaskController_5.newTask(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "newTask",
      Nil,
      "GET",
      """""",
      this.prefix + """addtask"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_TaskController_show28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("task/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TaskController_show28_invoker = createInvoker(
    TaskController_5.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "show",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """task/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_TaskController_delete29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletetask/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TaskController_delete29_invoker = createInvoker(
    TaskController_5.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """deletetask/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_TaskController_editTask30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("edittask/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TaskController_editTask30_invoker = createInvoker(
    TaskController_5.editTask(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "editTask",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """edittask/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_TaskController_update31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatetask/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TaskController_update31_invoker = createInvoker(
    TaskController_5.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TaskController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """updatetask/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_LoginController_login32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login32_invoker = createInvoker(
    LoginController_6.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_LoginController_authenticate33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_authenticate33_invoker = createInvoker(
    LoginController_6.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_SearchController_showSearch34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_SearchController_showSearch34_invoker = createInvoker(
    SearchController_0.showSearch(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchController",
      "showSearch",
      Nil,
      "GET",
      """""",
      this.prefix + """search"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_SearchController_search35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_SearchController_search35_invoker = createInvoker(
    SearchController_0.search(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchController",
      "search",
      Nil,
      "POST",
      """""",
      this.prefix + """search"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_Assets_versioned36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned36_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_LoginController_login0_route(params) =>
      call { 
        controllers_LoginController_login0_invoker.call(LoginController_6.login())
      }
  
    // @LINE:8
    case controllers_HomeController_index1_route(params) =>
      call { 
        controllers_HomeController_index1_invoker.call(HomeController_1.index())
      }
  
    // @LINE:12
    case controllers_UserController_list2_route(params) =>
      call { 
        controllers_UserController_list2_invoker.call(UserController_2.list())
      }
  
    // @LINE:13
    case controllers_UserController_show3_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_show3_invoker.call(UserController_2.show(id))
      }
  
    // @LINE:14
    case controllers_UserController_create4_route(params) =>
      call { 
        controllers_UserController_create4_invoker.call(UserController_2.create())
      }
  
    // @LINE:15
    case controllers_UserController_update5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_update5_invoker.call(UserController_2.update(id))
      }
  
    // @LINE:16
    case controllers_UserController_delete6_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_delete6_invoker.call(UserController_2.delete(id))
      }
  
    // @LINE:18
    case controllers_UserController_newUser7_route(params) =>
      call { 
        controllers_UserController_newUser7_invoker.call(UserController_2.newUser())
      }
  
    // @LINE:19
    case controllers_UserController_delete8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_delete8_invoker.call(UserController_2.delete(id))
      }
  
    // @LINE:20
    case controllers_UserController_editUser9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_editUser9_invoker.call(UserController_2.editUser(id))
      }
  
    // @LINE:24
    case controllers_ProjektController_list10_route(params) =>
      call { 
        controllers_ProjektController_list10_invoker.call(ProjektController_3.list())
      }
  
    // @LINE:25
    case controllers_ProjektController_create11_route(params) =>
      call { 
        controllers_ProjektController_create11_invoker.call(ProjektController_3.create())
      }
  
    // @LINE:26
    case controllers_ProjektController_show12_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProjektController_show12_invoker.call(ProjektController_3.show(id))
      }
  
    // @LINE:27
    case controllers_ProjektController_newProjekt13_route(params) =>
      call { 
        controllers_ProjektController_newProjekt13_invoker.call(ProjektController_3.newProjekt())
      }
  
    // @LINE:28
    case controllers_ProjektController_delete14_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProjektController_delete14_invoker.call(ProjektController_3.delete(id))
      }
  
    // @LINE:30
    case controllers_ProjektController_editProjekt15_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProjektController_editProjekt15_invoker.call(ProjektController_3.editProjekt(id))
      }
  
    // @LINE:31
    case controllers_ProjektController_update16_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProjektController_update16_invoker.call(ProjektController_3.update(id))
      }
  
    // @LINE:34
    case controllers_CustomerController_list17_route(params) =>
      call { 
        controllers_CustomerController_list17_invoker.call(CustomerController_7.list())
      }
  
    // @LINE:36
    case controllers_CustomerController_show18_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CustomerController_show18_invoker.call(CustomerController_7.show(id))
      }
  
    // @LINE:37
    case controllers_CustomerController_create19_route(params) =>
      call { 
        controllers_CustomerController_create19_invoker.call(CustomerController_7.create())
      }
  
    // @LINE:38
    case controllers_CustomerController_update20_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CustomerController_update20_invoker.call(CustomerController_7.update(id))
      }
  
    // @LINE:39
    case controllers_CustomerController_delete21_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CustomerController_delete21_invoker.call(CustomerController_7.delete(id))
      }
  
    // @LINE:41
    case controllers_CustomerController_newCustomer22_route(params) =>
      call { 
        controllers_CustomerController_newCustomer22_invoker.call(CustomerController_7.newCustomer())
      }
  
    // @LINE:42
    case controllers_CustomerController_delete23_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CustomerController_delete23_invoker.call(CustomerController_7.delete(id))
      }
  
    // @LINE:43
    case controllers_CustomerController_editCustomer24_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CustomerController_editCustomer24_invoker.call(CustomerController_7.editCustomer(id))
      }
  
    // @LINE:47
    case controllers_TaskController_list25_route(params) =>
      call { 
        controllers_TaskController_list25_invoker.call(TaskController_5.list())
      }
  
    // @LINE:48
    case controllers_TaskController_create26_route(params) =>
      call { 
        controllers_TaskController_create26_invoker.call(TaskController_5.create())
      }
  
    // @LINE:49
    case controllers_TaskController_newTask27_route(params) =>
      call { 
        controllers_TaskController_newTask27_invoker.call(TaskController_5.newTask())
      }
  
    // @LINE:50
    case controllers_TaskController_show28_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TaskController_show28_invoker.call(TaskController_5.show(id))
      }
  
    // @LINE:51
    case controllers_TaskController_delete29_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TaskController_delete29_invoker.call(TaskController_5.delete(id))
      }
  
    // @LINE:53
    case controllers_TaskController_editTask30_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TaskController_editTask30_invoker.call(TaskController_5.editTask(id))
      }
  
    // @LINE:54
    case controllers_TaskController_update31_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TaskController_update31_invoker.call(TaskController_5.update(id))
      }
  
    // @LINE:58
    case controllers_LoginController_login32_route(params) =>
      call { 
        controllers_LoginController_login32_invoker.call(LoginController_6.login())
      }
  
    // @LINE:59
    case controllers_LoginController_authenticate33_route(params) =>
      call { 
        controllers_LoginController_authenticate33_invoker.call(LoginController_6.authenticate())
      }
  
    // @LINE:63
    case controllers_SearchController_showSearch34_route(params) =>
      call { 
        controllers_SearchController_showSearch34_invoker.call(SearchController_0.showSearch())
      }
  
    // @LINE:64
    case controllers_SearchController_search35_route(params) =>
      call { 
        controllers_SearchController_search35_invoker.call(SearchController_0.search())
      }
  
    // @LINE:67
    case controllers_Assets_versioned36_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned36_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
