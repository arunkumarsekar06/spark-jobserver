import sbt._
import Process._

name := "spark-jobserver"

version := "master"

scalaVersion := "2.11.7"

organization := "Megam Systems"

enablePlugins(SbtNativePackager)

scalacOptions ++= Seq(
  "-deprecation",
  "-feature")	

resolvers += "Job Server Bintray" at "https://dl.bintray.com/spark-jobserver/maven"

libraryDependencies += "spark.jobserver" %% "job-server-api" % "0.6.1" % "provided"

//libraryDependencies += "spark.jobserver" %% "job-server-extras" % "0.6.1" % "provided"

