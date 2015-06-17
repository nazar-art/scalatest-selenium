package scalatest.selenium.styles

import org.scalatest.{FlatSpecLike, FlatSpec}
import scalatest.selenium.setup.ShouldMatcherHeadlessBrowserExamples

class FlatSpecExample extends FlatSpec with ShouldMatcherHeadlessBrowserExamples with FlatSpecLike {
  behavior of "Home page"
  it should "have title Google" in {
    pageTitle should be(expectedPageTitle())
    cancel()
  }

}