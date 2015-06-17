package scalatest.selenium.amazon_wishlist

import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.{By, WebDriver, WebElement}
import org.scalatest.concurrent.Eventually
import org.scalatest.selenium.WebBrowser
import org.scalatest.time.{Millis, Seconds, Span}

trait NavigateYourAccountElement extends Eventually {
  this: WebBrowser =>

  def focusOn(element: String, webDriver: WebDriver) = eventually(timeout(Span(3, Seconds)), interval(Span(5, Millis))){
    val myAccountElement: WebElement = webDriver.findElement(By.id(element))
    val builder: Actions = new Actions(webDriver)
    val hoverOverRegistrar: Actions = builder.moveToElement(myAccountElement)
    hoverOverRegistrar.perform()
  }

}
