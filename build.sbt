lazy val commonSettings = Seq(
  scalaVersion := "3.0.0",
  libraryDependencies += "co.fs2" %% "fs2-core" % "3.0.6",
  libraryDependencies += "co.fs2" %% "fs2-io" % "3.0.6",
  fork := true
)

// IO puzzlers
lazy val ioeval = (project in file("ioeval"))
  .settings(commonSettings)

// Functional streams with fs2. Needs cleaning up
lazy val streamEval = (project in file("stream-eval"))
  .settings(commonSettings)

lazy val backpressure1 = (project in file("backpressure-1"))
  .settings(commonSettings)

lazy val backpressure2 = (project in file("backpressure-2"))
  .settings(commonSettings)

lazy val concurrency = (project in file("concurrency"))
  .settings(commonSettings)

lazy val supermarket = (project in file("supermarket"))
  .settings(commonSettings)
