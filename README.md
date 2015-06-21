### for running you have to create next configuration:

Test class:

    scalatest.selenium.amazon_wishlist.AmazonCoUkScenario
    
VM parameter (for Linux):
        
    -Dwebdriver.chrome.driver=/home/nazar/Projects/IdeaProjects/SCALA/scalatest-selenium/lib/chromedriver.exe
    
for Windows:
    
    -Dwebdriver.chrome.driver=c:\dev\chrome\chromedriver.exe
        
Test option:
        
    -g