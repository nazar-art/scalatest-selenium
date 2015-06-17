package scalatest.selenium.setup

import org.scalatest.BeforeAndAfterEach
import org.scalatest.selenium.HtmlUnit
import org.scalatest.Suite

trait ScalatestSeleniumHeadlessBrowserExamples extends Suite with HtmlUnit with BeforeAndAfterEach {

  def webPageUrl(): String = "https://www.google.com/ncr"

  def expectedPageTitle(): String = "Google"

  override def beforeEach() {
    go to (webPageUrl())
  }

}
