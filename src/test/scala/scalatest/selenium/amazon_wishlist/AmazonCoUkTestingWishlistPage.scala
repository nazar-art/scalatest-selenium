package scalatest.selenium.amazon_wishlist

import org.scalatest.selenium.WebBrowser

class AmazonCoUkTestingWishlistPage extends AmazonCoUkPage with WebBrowser with SignOutItem
                                    with NavigateYourAccountElement with PageTitle {
  val title = "Amazon.co.uk: : Testing"
  override val url: String = "http://www.amazon.co.uk/gp/registry/wishlist/3A82R2P733YAI/ref=cm_wl_huc_view"
}
