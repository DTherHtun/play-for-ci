name := """play-for-ci"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

enablePlugins(RpmPlugin)
maintainer := "D Ther Htun <dther@opslab.space>"
packageSummary := "My custom package"
packageDescription := "Package"
