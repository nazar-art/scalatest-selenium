package scalatest.selenium.first.glance

import org.scalatest.selenium.Chrome
import org.scalatest.{BeforeAndAfterAll, FlatSpec, Matchers}

class ScalaTestSeleniumFirstGlanceExample extends FlatSpec
with Matchers with BeforeAndAfterAll with Chrome {

  val homepage = "https://www.google.com/ncr"

  behavior of "Scalatest and selenium at first glance"

  it should "show page title" in {
    go to (homepage)
    pageTitle should be("Am I at Google page?")
  }

  override protected def afterAll() {
    quit
  }
}