package scalatest.selenium.first.glance

import org.scalatest.{BeforeAndAfterAll, MustMatchers, FlatSpec}
import org.scalatest.selenium.Chrome

class CoolExample extends FlatSpec with Chrome with MustMatchers with BeforeAndAfterAll {
  behavior of "Page"
  go to ("https://www.google.com/ncr")
  it should "have title Google" in {
    pageTitle must be("Google")
  }

  it should "accept search string" in {
    click on "q"
    textField("q").value = "boo"
    assertResult("boo") {
      textField("q").value
    }
  }

  override protected def afterAll() {
    quit
  }

}
