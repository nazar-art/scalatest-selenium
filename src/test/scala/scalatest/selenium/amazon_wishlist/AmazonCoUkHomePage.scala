package scalatest.selenium.amazon_wishlist

import org.scalatest.selenium.WebBrowser

class AmazonCoUkHomePage extends AmazonCoUkPage with WebBrowser with NavigateYourAccountElement with PageTitle {

  val url = "https://www.amazon.co.uk/"
  val accountPageTitle = "Amazon.co.uk - Your Account"
  val title = "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more"
}
