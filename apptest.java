import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
public class App
{
 @Test

 public static void main(String[] args) {


 System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
 ChromeOptions chromeOptions = new ChromeOptions();
 WebDriver driver = new ChromeDriver(chromeOptions);

 System.out.println("Hi, Welcome to Edureka's YouTube Live session on Selenium WebDriver");


 driver.get("http://192.168.64.149:8080/addressbook");

 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
 driver.findElement(By.className("v-button")).click();
 driver.findElement(By.id("gwt-uid-5")).sendKeys("Edureka");
 driver.findElement(By.id("gwt-uid-7")).sendKeys("DevOps");
 driver.findElement(By.id("gwt-uid-9")).sendKeys("9834562709");
 driver.findElement(By.id("gwt-uid-11")).sendKeys("Devops@edureka.co");
 driver.findElement(By.id("gwt-uid-13")).sendKeys("01/01/2015");
 driver.findElement(By.className("v-button-primary")).click();
 //Thread.sleep(5000);
 driver.quit();
 }

}
