
name := "squants-dep-demo"

version := "0.1"

scalaVersion := "2.13.6"

enablePlugins(JavaAppPackaging)

libraryDependencies ++= List(
  "org.typelevel" %% "squants" % "1.6.0"
)
