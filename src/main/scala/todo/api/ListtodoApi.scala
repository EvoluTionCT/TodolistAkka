package todo.api

import akka.http.javadsl.server.Route
import akka.http.scaladsl.server.Directives._
import org.json4s.{DefaultFormats, Serialization, jackson}
import todo.api.services.ToDoListService
import todo.interfaces.ServiceInterface.todotask

/**
  * Created by ratapong on 3/7/2560.
  */
class ListtodoApi {

  implicit val serialization: Serialization = jackson.Serialization
  implicit val formats: DefaultFormats = DefaultFormats

  val todolistService = ToDoListService()

  val routes: Route  =

    get { (path("tasks") & pathEnd) {
        todolistService.getAllTask()
    }} ~
    get { (path("task"/ Segment) & pathEnd) {

    }} ~
    post { (path("task") & pathEnd & entity(as[todotask])) { task =>

    }} ~
    put { (path("task"/ Segment) & pathEnd) { task =>

    }} ~
    delete { (path("task"/ Segment) & pathEnd) { task =>

    }}


}
