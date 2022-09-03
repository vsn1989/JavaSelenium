import Selenium.LauchChromeBrowser;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Test1 {
    @Test
    public  void TC01() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\New\\OneDrive\\Desktop\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        LauchChromeBrowser obj=new LauchChromeBrowser(driver);
        obj.launchBrowser("https://www.opencart.com/");
        boolean flag=obj.verifyWebElement(By.xpath("//a[@class='btn btn-link navbar-btn']"));
        org.testng.Assert.assertTrue(flag,"Homepage not displayed");
        obj.closeDriver();

        /*obj.click(By.xpath("//a[text()='Register' and @class='btn btn-black navbar-btn']"));
        obj.enterText(By.xpath("//input[@id='input-username']"),"Baru");
        obj.enterText(By.xpath("//input[@id='input-firstname']"),"Baru");
        obj.enterText(By.xpath("//input[@id='input-lastname']"),"Ramarao");
        obj.selectItemFromDropdown(By.xpath("//select[@name='country_id']"),"China");
        //obj.closeDriver();*/
    }

  @Test
    public void TC02(){
      System.setProperty("webdriver.chrome.driver","C:\\Users\\New\\OneDrive\\Desktop\\chromedriver.exe");
      ChromeDriver driver=new ChromeDriver();
      LauchChromeBrowser obj=new LauchChromeBrowser(driver);
      obj.launchBrowser("https://www.opencart.com/");
      boolean flag=obj.verifyWebElement(By.xpath("//a[@class='btn btn-link navbar-btn']"));
      org.testng.Assert.assertTrue(flag,"Homepage not displayed");
      obj.click(By.xpath("//a[text()='Register' and @class='btn btn-black navbar-btn']"));
      obj.verifyWebElement(By.xpath("//input[@id='input-username']"));
      obj.enterText(By.xpath("//input[@id='input-username']"),"Baru");
      obj.enterText(By.xpath("//input[@id='input-firstname']"),"Baru");
      obj.enterText(By.xpath("//input[@id='input-lastname']"),"Ramarao");
      obj.selectItemFromDropdown(By.xpath("//select[@name='country_id']"),"China");
      //obj.closeDriver();
  }
     @Test
    public void TC03(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\New\\OneDrive\\Desktop\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        LauchChromeBrowser obj=new LauchChromeBrowser(driver);
        obj.launchBrowser("https://www.opencart.com/");
        boolean flag=obj.verifyWebElement(By.xpath("//a[@class='btn btn-link navbar-btn']"));
        org.testng.Assert.assertTrue(flag,"Homepage not displayed");
         obj.click(By.xpath("//a[@class='btn btn-link navbar-btn']"));
         obj.enterText(By.xpath("//input[@id='input-email']"),"Baruramarao@gmail.com");
         obj.enterText(By.xpath("//input[@id='input-password']"),"Ramarao");
         obj.click(By.xpath("//button[@class='btn btn-primary btn-lg hidden-xs']"));
         boolean flag1=obj.verifyWebElement(By.xpath("//a[@class='btn btn-link navbar-btn']"));
         org.testng.Assert.assertTrue(flag1,"Account not displayed");
         System.out.println("test case passed");

         System.out.println("test case passed");
         System.out.println("test case passed");
    }

}
