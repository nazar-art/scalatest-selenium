package scalatest.selenium.amazon_wishlist

import org.openqa.selenium.support.ui.{ExpectedConditions, Select, WebDriverWait}
import org.openqa.selenium.{By, WebElement}
import org.scalatest._
import org.scalatest.concurrent.Eventually
import org.scalatest.selenium.Chrome
import org.scalatest.time.{Millis, Seconds, Span}

class AmazonCoUkScenario extends FeatureSpec with GivenWhenThen with Matchers with Eventually with BeforeAndAfterAll
  with Chrome {

  var homePage: AmazonCoUkHomePage = _
  var signInPage: AmazonCoUkSignInPage = _
  var searchResultPage: AmazonCoUkSearchResultPage = _
  var itemPage: AmazonCoUkItemPage = _
  var testingWishlistPage: AmazonCoUkTestingWishlistPage = _
  var wishlistItemPage: AmazonCoUkWishlistItemPage = _
  var itemsInTestingWishListInitially = 50
  var numberOfLeftItemsInWishlistElement: WebElement = _

  implicit override val patienceConfig =
    PatienceConfig(timeout = scaled(Span(2, Seconds)), interval = scaled(Span(5, Millis)))

  override protected def beforeAll {
    System.setProperty("webdriver.chrome.driver", "c:\\dev\\chrome\\chromedriver.exe")
    homePage = new AmazonCoUkHomePage
    signInPage = new AmazonCoUkSignInPage
    searchResultPage = new AmazonCoUkSearchResultPage
    itemPage = new AmazonCoUkItemPage
    testingWishlistPage = new AmazonCoUkTestingWishlistPage
    wishlistItemPage = new AmazonCoUkWishlistItemPage
  }

  feature("The user can add a book to a specific wishlist") {

    info("As a user")
    info("I want to be able to add a found book at amazon.co.uk to a specific wishlist")
    info("So that I can have books in a spcified wishlist")

    scenario("Sign In first") {
      Given("I navigate to amazon.co.uk web page")
        go to homePage
        homePage.isAvailable(homePage.title, webDriver)

      When("I am not signed in")
        click on id("nav-your-account")

      Then("Navigate ot Sign In page")
        signInPage.isAvailable(signInPage.title, webDriver)

      And("I provide credentials")
        emailField("email").value = "andrii.kohan@gmail.com"
        webDriver.findElement(By.name("password")).sendKeys("")
        //passwordField("password").value = ""
        submit

      And("find myself at my amazon home page")
      eventually {
        pageTitle should be(homePage.accountPageTitle)
      }
    }

    scenario("Search for a particular book") {
      Given("I am at my amazon account page")
        pageTitle should be(homePage.accountPageTitle)

      When("I select 'Search Books'")
        click on id("searchDropdownBox")
        implicitlyWait(Span(2, Seconds))
        //        singleSel("searchDropdownBox").value = "Books"
        def select = new Select(webDriver.findElement(By.id("searchDropdownBox")))
        select.selectByVisibleText("Books")

      And("input 'model based testing tools'")
        textField("twotabsearchtextbox").value = "model based testing tools"
        submit
      Then("I've been navigated to search result page")
       pageTitle should be(searchResultPage.title)
    }

    scenario("Select first result link in search result page") {
      Given("I am at search result page")
        pageTitle should be(searchResultPage.title)
      When("I click top result link with correct name book")
        click on linkText("Practical Model-Based Testing: A Tools Approach")
      Then("I am navigated to item page")
        eventually {
          pageTitle should be(itemPage.title)
        }
    }

    scenario("Add found item to a specified Wish List") {

      Given("I am at item page")
        pageTitle should be(itemPage.title)
      When("I add the item to the specified wish list")

        //def element: Select = webDriver.findElement(By.id("reglist|a|asin")).asInstanceOf[Select]
        //element.selectByVisibleText("Testing")
        val wishListCombo: WebElement = (new WebDriverWait(webDriver, 1)).until(
          ExpectedConditions.elementToBeClickable(webDriver.findElement(By.name("reglist|a|asin"))))
        wishListCombo.click

        val testingWishlistItem: WebElement = webDriver.findElement(By.xpath("//*[@id=\"wl-list-name-2\"]"))

        (new WebDriverWait(webDriver, 10)).until(ExpectedConditions.elementToBeClickable(testingWishlistItem))

      Then("I select specified wish list")
        testingWishlistItem.click()
    }

    scenario("View specified wishlist") {

      Given("I am at newly added wishlist item view")
        val ele: WebElement = webDriver.findElementByClassName("w-success-msg")
        assertResult(true) {
          ele.getText.contains("added to")
        }
      When("Click view wishlist button")
        eventually(timeout(Span(3, Seconds)), interval(Span(5, Millis))) {
          click on "WLHUC_viewlist"
        }
      Then("I can see newly added item at specified wishlist page")
        eventually {
          pageTitle should be(testingWishlistPage.title)
        }

    }

    scenario("Remove specific book from wishlist") {
      Given("Number of total wishlist items increases")
        eventually(timeout(Span(3, Seconds)), interval(Span(5, Millis))) {
            numberOfLeftItemsInWishlistElement = webDriver.findElementByXPath(
              "/html/body/div/div/div[2]/div/div/div/div[2]/div/div[6]/span/span")
            numberOfLeftItemsInWishlistElement.getText should equal(String.valueOf(itemsInTestingWishListInitially + 1))
        }

      When("Click Remove button")
        eventually(timeout(Span(2, Seconds)), interval(Span(5, Millis))) {
          click on xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/div/div/div[2]/div[3]/div/div[2]/div/div/div[2]/span/span/a")
          pageTitle should be(testingWishlistPage.title)
        }

      Then("Number of items in wishlist decreases by one")
        eventually(timeout(Span(2, Seconds)), interval(Span(5, Millis))) {
          numberOfLeftItemsInWishlistElement.getText should equal(String.valueOf(itemsInTestingWishListInitially))
        }

      And("I sign out")
        testingWishlistPage.focusOn("nav-your-account", webDriver)
        testingWishlistPage.elementIsClicked("nav-item-signout", webDriver)

      And("Navigate to Sign In page")
        signInPage.isAvailable(signInPage.title, webDriver)
    }

  }

  override protected def afterAll {
    close
    quit
  }
}
