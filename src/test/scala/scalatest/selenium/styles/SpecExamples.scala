package scalatest.selenium.styles

import org.scalatest.Spec
import org.scalatest.selenium.HtmlUnit
import scalatest.selenium.setup.NoMatchersHeadlessBrowserExamples

class SpecExamples extends Spec with NoMatchersHeadlessBrowserExamples {

  object `Home page` {

    object `when avaialble` {
      def `should have title Google`() {
        assert(HtmlUnit.pageTitle == expectedPageTitle())
      }
    }

  }

}
