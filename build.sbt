import play.core.PlayVersion.akkaVersion
import com.typesafe.config._

lazy val a = (project in file("a")).settings(
  scalaVersion := "2.13.3",
  organization := "org.example",
  version := "dummy",
  parallelExecution in Test := false,
  resolvers += Resolver.sonatypeRepo("snapshots"),
  resolvers += Resolver.sonatypeRepo("releases"),
).enablePlugins(PlayScala)

onLoad in Global := (onLoad in Global).value andThen { s: State => "project a" :: s }
