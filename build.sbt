
name := "todolistakka"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka"           %% "akka-http"                % "10.0.6",
  "com.typesafe.akka"           %% "akka-http-testkit"        % "10.0.6",
  "org.json4s"                  %% "json4s-jackson"           % "3.5.2",
  "de.heikoseeberger"           %% "akka-http-json4s"         % "1.17.0",
  "io.igl"                      %% "jwt"                      % "1.2.0",
  "org.scalatest"               %% "scalatest"                % "3.0.1" % "test",
  "com.github.tomakehurst"      % "wiremock"                  % "2.6.0" % "test",
  "net.liftweb"                 %% "lift-mongodb"             % "2.6.3",
  "net.liftweb"                 %% "lift-mongodb-record"      % "2.6.3",
  "org.mongodb"                 %% "casbah"                   % "3.1.1",
  "com.github.fakemongo"        % "fongo"                     % "2.1.0" % "test",
  "org.scalamock"               %% "scalamock-scalatest-support" % "3.5.0" % Test,
  "org.mongodb"                 %% "casbah"                   % "3.1.1"
)

libraryDependencies += "org.typelevel" %% "cats" % "0.9.0"

scalacOptions ++= Seq("-feature")

testOptions in Test ++= Seq(
  Tests.Argument(TestFrameworks.ScalaTest, "-o")
)

parallelExecution in Test := false

// For stable releases
resolvers += "Sonatype releases" at "https://oss.sonatype.org/content/repositories/releases"
// For SNAPSHOT releases
resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"