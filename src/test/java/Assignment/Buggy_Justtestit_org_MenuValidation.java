package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Buggy_Justtestit_org_MenuValidation extends BaseClass{

  @Test
    public void test_01() throws InterruptedException {




        driver.get("https://buggy.justtestit.org/");
          Thread.sleep(2000);
        List<WebElement> menu = driver.findElements(By.xpath("//h2"));

        System.out.println("Menus: "+ menu.size());
        for(WebElement element : menu){
          System.out.println(element.getText());
        }




    }
}
