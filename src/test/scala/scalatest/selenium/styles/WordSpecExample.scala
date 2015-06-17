package scalatest.selenium.styles

import scalatest.selenium.setup.NoMatchersHeadlessBrowserExamples
import org.scalatest.WordSpec
import org.scalatest.selenium.HtmlUnit

class WordSpecExample extends WordSpec with NoMatchersHeadlessBrowserExamples {

  "Home page" when {
    "available" should {
      "have title Google" in {
        assume (!HtmlUnit.isScreenshotSupported)
        assertResult("Google") {
          HtmlUnit.pageTitle
        }
      }
    }
  }
}
