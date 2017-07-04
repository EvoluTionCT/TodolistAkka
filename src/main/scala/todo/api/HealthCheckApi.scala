package todo.api


import akka.http.scaladsl.server.Directives._

class HealthCheckApi() {

  val routes = {

    get {
      (path("ping") & pathEndOrSingleSlash) {
        complete("Success")
      }
    }
  }

}

object HealthCheckApi {
  def apply(): HealthCheckApi = new HealthCheckApi()
}