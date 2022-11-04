package space.forstudy.qauto;

import net.bytebuddy.utility.RandomString;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main_Tests {

    WebDriver driver;

    @BeforeClass
    public static void configuration(){
        final String path = String.format("%s/bin/chromedriver.exe",System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver",path);
    }

    @Before
    public void precondition(){
        driver = new ChromeDriver();
    }

    @Test
    public void test(){
       driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
       WebElement buttonSingUp = driver.findElement(By.className("btn-primary"));
        buttonSingUp.click();

       RandomString randomString = new RandomString(19);
       String randomName = randomString.nextString();
       randomName = randomName.replaceAll("[^a-zA-Z]","");

       driver.findElement(By.id("signupName")).sendKeys(randomName);

       String randomLastName = randomString.nextString();
        randomLastName = randomLastName.replaceAll("[^a-zA-Z]","");

        driver.findElement(By.id("signupLastName")).sendKeys(randomLastName);

        String randomEmail = "qwerty"+Math.floor(Math.random()*10000)+"@gmail.com";

        driver.findElement(By.id("signupEmail")).sendKeys(randomEmail);

        RandomString randomString1 = new RandomString(8);
        String randomPassword1 = randomString1.nextString();
        randomPassword1 = randomPassword1+"aA1";

        driver.findElement(By.id("signupPassword")).sendKeys(randomPassword1);

        driver.findElement(By.id("signupRepeatPassword")).sendKeys(randomPassword1);

        driver.findElement(By.cssSelector(".modal-footer>*")).click();

        //driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);


        driver.findElement(By.id("userNavDropdown")).click();













    }

    /*@After
    public void postCondition(){
        driver.quit();
    }*/
}
