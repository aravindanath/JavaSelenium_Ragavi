package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Buggy_Justtestit_org_login extends BaseClass{

  @Test
    public void test_01(){


        driver.get("https://buggy.justtestit.org/");

        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("Ragavi");

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ragavi123%");

        driver.findElement(By.xpath("//button[text()='Login']")).click();


    }
}
