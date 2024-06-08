ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.3"
//val scalatestVersion = "3.2.7"
val swingVersion="2.10.7"
lazy val root = (project in file("."))
  .settings(
    name := "summer_practice"
  )

libraryDependencies ++=Seq(
  "org.scalatest" %% "scalatest" % "3.2.10" % "test",
  "org.scala-lang" % "scala-swing" % swingVersion,
  "org.openjfx" % "javafx" % "17.0.10"

)

//summer_practice / libraryDependencies ++= Seq(
//  "org.scalatest" %% "scalatest" % "latest.integration" % Test
//)
