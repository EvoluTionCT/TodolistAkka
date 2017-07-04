package todo.api.services

import akka.http.scaladsl.model.HttpHeader
import org.json4s.{DefaultFormats, Serialization, jackson}
import todo.interfaces.ServiceInterface.AllTaskResponse

import scala.concurrent.Future

/**
  * Created by ratapong on 3/7/2560.
  */
class ToDoListService {
  implicit val serialization: Serialization = jackson.Serialization
  implicit val formats: DefaultFormats = DefaultFormats

  def getAllTask(): Future[AllTaskResponse] = {


  }
}

object ToDoListService {
  def apply(): ToDoListService = new ToDoListService()
}