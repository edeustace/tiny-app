import sbt._
import sbt.Keys._

object TinyBuild extends Build {

  lazy val tiny = Project(
    id = "tiny",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "tiny",
      organization := "com.tiny",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.1"
      // add other settings here
    )
  )
}
