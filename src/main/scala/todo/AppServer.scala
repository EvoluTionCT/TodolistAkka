package todo

import java.util

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import todo.api.{HealthCheckApi, ListtodoApi}

object AppServer extends App{

  implicit val system = ActorSystem("Todolist")
  implicit val materializer = ActorMaterializer()

  val routes = new ListtodoApi().routes ~ new HealthCheckApi().routes ~


  Http().bindAndHandle(routes, "0.0.0.0", 8080)
}
