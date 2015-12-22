import sbt._

organization := "io.otrl.library"

name := "otrl-lib-repository-mongo"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.7"

lazy val otrlLibraryRepositoryMongo = project.in(file("."))

libraryDependencies ++= Seq(
  // scala
  "org.scala-lang" % "scala-library" % "2.11.7",
  // logging
  "ch.qos.logback" % "logback-classic" % "1.1.3",
  "com.typesafe.scala-logging" % "scala-logging_2.11" % "3.1.0",
  // otrl
  "io.otrl.library" % "otrl-lib-repository_2.11" % "0.5.0-SNAPSHOT",
  // database
  "org.mongodb" % "casbah-core_2.11" % "2.8.2",
  "org.mongodb" % "casbah-commons_2.11" % "2.8.2",
  "org.mongodb" % "casbah-query_2.11" % "2.8.2",
  // test
  "org.specs2" % "specs2-core_2.11" % "3.6.6" % "test",
  "org.specs2" % "specs2-junit_2.11" % "3.6.6" % "test",
  "org.specs2" % "specs2-mock_2.11" % "3.6.6" % "test"
)
