name := """play-for-ci"""

version := "1.3.SNAPSHOT"

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

rpmRelease := "1"

rpmVendor := "typesafe"

rpmUrl := Some("https://github.com/DTherHtun/play-for-ci")

rpmLicense := Some("BSD")
