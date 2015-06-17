package scalatest.selenium.amazon_wishlist

import org.openqa.selenium.{By, WebElement, WebDriver}
import org.scalatest.concurrent.Eventually
import org.scalatest.selenium.WebBrowser
import org.scalatest.time.{Millis, Seconds, Span}

trait SignOutItem extends Eventually {
  this: WebBrowser =>

  def elementIsClicked(signOutItem: String, webDriver: WebDriver) =
    eventually(timeout(Span(3, Seconds)), interval(Span(5, Millis))) {
      val myAccountElement: WebElement = webDriver.findElement(By.id(signOutItem))
      myAccountElement.isDisplayed
      myAccountElement.click()
    }
}
