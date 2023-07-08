ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

libraryDependencies += "com.h2database" % "h2" % "1.4.195"

lazy val root = (project in file("."))
  .settings(
    name := "ScalaDatabase"

)
