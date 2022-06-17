package Assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Buggy_Justtestit_org_login_neg extends BaseClass{

  @Test
    public void test_01(){


        driver.get("https://buggy.justtestit.org/");

        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("Ragavi");

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ragavi123%");

        driver.findElement(By.xpath("//button[text()='Login']")).click();


    }
}
