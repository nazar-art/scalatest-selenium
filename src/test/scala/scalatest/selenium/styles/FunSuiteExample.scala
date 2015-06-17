package scalatest.selenium.styles

import org.scalatest.FunSuite
import scalatest.selenium.setup.ShouldMatcherHeadlessBrowserExamples


class FunSuiteExample extends FunSuite with ShouldMatcherHeadlessBrowserExamples {

  test("Home page when available should be Google") {
    assert (pageTitle === expectedPageTitle())
  }
}
