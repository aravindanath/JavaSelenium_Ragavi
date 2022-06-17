package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Buggy_Justtestit_org_reg extends BaseClass{

  @Test
    public void test_01() throws InterruptedException {

      String fn = generateFirstName(), ln= generateLastName(), pw = fn+"@1234", cpw = fn+"@1234", un = fn;


        driver.get("https://buggy.justtestit.org/");

        driver.findElement(By.xpath("//a[text()='Register']")).click();

        driver.findElement(By.cssSelector("#username")).sendKeys(un);

      driver.findElement(By.cssSelector("#firstName")).sendKeys(fn);


      driver.findElement(By.cssSelector("#lastName")).sendKeys(ln);

      driver.findElement(By.cssSelector("#password")).sendKeys(pw);
      driver.findElement(By.cssSelector("#confirmPassword")).sendKeys(cpw);


        driver.findElement(By.xpath("//button[text()='Register']")).click();

        Thread.sleep(3000);

        String smg = driver.findElement(By.xpath("//div[contains(text(),'Registration is successful')]")).getText();

        Assert.assertEquals(smg.trim(),"Registration is successful");


    }
}
