ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.8"

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies += "ch.epfl.data" %% "squid" % "0.4.0-SNAPSHOT"

val paradiseVersion = "2.1.0"

autoCompilerPlugins := true

addCompilerPlugin("org.scalamacros" % "paradise" % paradiseVersion cross CrossVersion.full)

lazy val root = (project in file("."))
  .settings(
    name := "squid_testing",
    scalacOptions ++= Seq (
    "-deprecation"
    )
  )
