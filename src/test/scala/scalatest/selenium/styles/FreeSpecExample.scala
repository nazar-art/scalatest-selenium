package scalatest.selenium.styles

import org.scalatest.FreeSpec
import scalatest.selenium.setup.NoMatchersHeadlessBrowserExamples
import org.scalatest.selenium.HtmlUnit
class FreeSpecExample extends FreeSpec with NoMatchersHeadlessBrowserExamples {

  "Home page" - {
    "when available" - {
      "should have title Google" in {
        assert(!HtmlUnit.pageTitle.contains(expectedPageTitle()), "Home page when available should have title Google")
      }
    }
  }
}
