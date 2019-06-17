name := """lista01"""
organization := "olamundoweb.com.br"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.8"

libraryDependencies += guice
libraryDependencies += "com.h2database" % "h2" % "1.4.192"
libraryDependencies ++= Seq(evolutions, jdbc)

libraryDependencies += "javax.xml.bind" % "jaxb-api" % "2.3.1"
libraryDependencies += "javax.activation" % "activation" % "1.1.1"
libraryDependencies += "org.glassfish.jaxb" % "jaxb-runtime" % "2.3.2"

