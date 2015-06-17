package scalatest.selenium.amazon_wishlist

import org.openqa.selenium.WebDriver
import org.scalatest.concurrent.Eventually
import org.scalatest.selenium.WebBrowser
import org.scalatest.time.{Millis, Seconds, Span}

trait PageTitle extends Eventually{
  this: WebBrowser =>

  def isAvailable(title: String, webDriver: WebDriver) =
    eventually(timeout(Span(3, Seconds)), interval(Span(5, Millis))){
      webDriver.getTitle.equals(title)
    }

}
