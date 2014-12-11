name := "akka-remote-scala-seed"

version := "1.0"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.7",
  "com.typesafe.akka" %% "akka-remote" % "2.3.7",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.7" % "test",
  "org.scalatest" %% "scalatest" % "2.1.6" % "test")
  