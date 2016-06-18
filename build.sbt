import sbt._

organization := "io.kyriakos.library"

name := "kyriakos-lib-repository-mongo"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.7"

lazy val kyriakosLibRepoMongo = project.in(file("."))

libraryDependencies ++= Seq(
  // scala
  "org.scala-lang" % "scala-library" % "2.11.7",
  // logging
  "ch.qos.logback" % "logback-classic" % "1.1.3",
  "com.typesafe.scala-logging" % "scala-logging_2.11" % "3.1.0",
  // kyriakos
  "io.kyriakos.library" % "kyriakos-lib-crud_2.11" % "0.1.0-SNAPSHOT",
  "io.kyriakos.library" % "kyriakos-lib-utils_2.11" % "0.1.0-SNAPSHOT",
  // database
  "org.mongodb" % "casbah-core_2.11" % "2.8.2",
  "org.mongodb" % "casbah-commons_2.11" % "2.8.2",
  "org.mongodb" % "casbah-query_2.11" % "2.8.2",
  // test
  "org.specs2" % "specs2-core_2.11" % "3.6.6" % "test",
  "org.specs2" % "specs2-junit_2.11" % "3.6.6" % "test",
  "org.specs2" % "specs2-mock_2.11" % "3.6.6" % "test"
)

ivyScala := ivyScala.value map {
  _.copy(overrideScalaVersion = true)
}

scalacOptions ++= Seq("-deprecation", "-feature")
