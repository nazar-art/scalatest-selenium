package scalatest.selenium.styles

import org.scalatest.FunSpec
import scalatest.selenium.setup.MustMatcherHeadlessBrowserExamples

class FunSpecExample extends FunSpec with MustMatcherHeadlessBrowserExamples {

  describe("Home page title") {
    describe("when available") {
      it("should be Google") {
        pageTitle must equal (expectedPageTitle())
      }
    }
  }

}
