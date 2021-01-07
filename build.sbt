val commonSettings = Seq(
  scalaVersion := "2.13.4"
)

lazy val root = (project in file("."))
  .aggregate(exercises, answers)
  .settings(commonSettings)
  .settings(
    name := "fpinscala",
    scalacOptions += "-deprecation"
  )

lazy val exercises = (project in file("exercises"))
  .settings(commonSettings)
  .settings(
    name := "exercises",
    scalacOptions += "-deprecation"
  )

lazy val answers = (project in file("answers"))
  .settings(commonSettings)
  .settings(
    name := "answers",
    scalacOptions += "-deprecation"
  )
