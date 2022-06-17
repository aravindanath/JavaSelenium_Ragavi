package Assignment;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Buggy_Justtestit_org_reg_neg extends BaseClass{

  @Test
    public void test_01() throws InterruptedException {

      String fn = generateFirstName(), ln= generateLastName(), pw = fn+"@1234", cpw = fn+"@123", un = fn;


        driver.get("https://buggy.justtestit.org/");

        driver.findElement(By.xpath("//a[text()='Register']")).click();

        driver.findElement(By.id("username")).sendKeys(un);

      driver.findElement(By.id("firstName")).sendKeys(fn);


      driver.findElement(By.id("lastName")).sendKeys(ln);

      driver.findElement(By.id("password")).sendKeys(pw);
      driver.findElement(By.id("confirmPassword")).sendKeys(cpw);


        driver.findElement(By.xpath("//button[text()='Register']")).click();

        Thread.sleep(3000);

        String smg = driver.findElement(By.xpath("//div[contains(text(),'Passwords do not match')]")).getText();

        Assert.assertEquals(smg.trim(),"Passwords do not match");


    }
}
