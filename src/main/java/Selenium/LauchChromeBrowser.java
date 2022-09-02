package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class  LauchChromeBrowser {
    public  ChromeDriver driver;
    public  LauchChromeBrowser(ChromeDriver driver)
    {
        this.driver=driver;
    }
   public void
   launchBrowser(String url){

        driver.get(url);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
       // driver.findElement(By.xpath("//a[text()='Register' and @class='btn btn-black navbar-btn']")).click();
   }

   public boolean verifyWebElement(By locator){
        boolean flag=driver.findElement(locator).isDisplayed();
        return flag;
   }

   public void click(By locator){

        driver.findElement(locator).click();
   }

   public void enterText(By locator,String text){

        driver.findElement(locator).sendKeys(text);
   }

   public  void closeDriver(){

        driver.close();
   }

   public void selectItemFromDropdown(By locator,String text){
        WebElement ele=driver.findElement(locator);
       Select obj=new Select(ele);
       obj.selectByVisibleText(text);
   }
}
