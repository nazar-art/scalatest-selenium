name := "scalatest-selenium"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "net.sourceforge.htmlunit" % "htmlunit" % "2.14",
  "org.seleniumhq.selenium" % "selenium-java" % "2.42.2",
  "org.scalacheck" % "scalacheck_2.10" % "1.11.4" % "test",
  "org.scalatest" % "scalatest_2.11" % "2.2.0" % "test"
)

testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-u", "target/test-reports")
