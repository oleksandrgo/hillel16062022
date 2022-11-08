package space.forstudy.qauto;

import net.bytebuddy.utility.RandomString;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.util.Elements;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
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

        driver.manage().window().maximize();

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

        WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.urlContains("garage"));

        driver.findElement(By.xpath("//a[@class='btn btn-white btn-sidebar sidebar_btn -profile']")).click();

        wait.until(ExpectedConditions.urlContains("profile"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".display-4")));

        String expectedNameLastName = new String();
        expectedNameLastName = randomName+" "+randomLastName;
        String nameLastName = driver.findElement(By.cssSelector(".display-4")).getText();
        Assert.assertEquals("Name and Last Name are not equals",nameLastName,expectedNameLastName);

        driver.findElement(By.xpath("//a[@routerlink='garage']")).click();

        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

        driver.findElement(By.xpath("//input")).sendKeys("5");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='modal-footer d-flex justify-content-end']/button[2]")));

        driver.findElement(By.xpath("//div[@class='modal-footer d-flex justify-content-end']/button[2]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='car_add-expense btn btn-success']")));

        driver.findElement(By.xpath("//button[@class='car_add-expense btn btn-success']")).click();

        driver.findElement(By.xpath("//input[@name='mileage']")).sendKeys(Keys.CLEAR,"10");

        driver.findElement(By.xpath("//input[@name='liters']")).sendKeys("55");
        driver.findElement(By.xpath("//input[@name='totalCost']")).sendKeys("55");

        driver.findElement(By.xpath("//button[2][@class='btn btn-primary']")).click();

        driver.findElement(By.xpath("//a[@routerlink='settings']")).click();

        driver.findElement(By.xpath("//button[@class='btn btn-danger-bg']")).click();

        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();














    }

    /*@After
    public void postCondition(){
        driver.quit();
    }*/
}
