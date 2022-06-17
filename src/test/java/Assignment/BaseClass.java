package Assignment;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.Locale;

public class BaseClass {

    protected  WebDriver driver;


    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


  //  @AfterClass
    public void teardown() throws InterruptedException {
        Thread.sleep(7000);
       driver.quit();
    }


    public static String generateFirstName(){
        Faker faker = new Faker(new Locale("en-NZ"));
        String fn = faker.name().firstName();
        System.out.println("First Name: "+ fn);
        return fn ;

    }


    public static String generateLastName(){
        Faker faker = new Faker(new Locale("en-NZ"));
        String fn = faker.name().lastName();
        System.out.println("Last Name: "+ fn);
        return fn ;

    }







}
