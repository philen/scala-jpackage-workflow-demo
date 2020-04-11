name := "swingtest"
organization := "example"
version := "1.0"
scalaVersion := "2.13.1"

lazy val app = (project in file("."))
  .settings(
    test in assembly := {},
    mainClass in assembly := Some("example.Main"),
    assemblyMergeStrategy in assembly := {
      case PathList("META-INF", xs @ _*) =>
        MergeStrategy.discard
      case other =>
        MergeStrategy.defaultMergeStrategy(other)
    }
  )
