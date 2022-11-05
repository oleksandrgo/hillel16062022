package spase.forstudy.qauto;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainTests {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public static void configuration(){
        final String path =
                String.format("%s/bin/chromedriver",
                        System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver",path);
    }
    @Before
    public void precondition(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 3);
    }
    @Test
    public void test() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.findElement(By.cssSelector(".btn-primary")).click();
        driver.findElement(By.id("signupName")).sendKeys("Fedotivna");
        driver.findElement(By.id("signupLastName")).sendKeys("Lyta");
        driver.findElement(By.id("signupEmail")).sendKeys("registeredEmail", Math.floor(Math.random() * 10000000) + "@test.com");
        driver.findElement(By.id("signupPassword")).sendKeys("Fqwertyy5");
        driver.findElement(By.id("signupRepeatPassword")).sendKeys("Fqwertyy5");
        driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
        wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=\"btn btn-white btn-sidebar sidebar_btn -profile\"]"))).
                click(); //кликаем Profile
        wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=\"btn btn-white btn-sidebar sidebar_btn\"]"))).
                click();//кликаем Garage
        wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=\"btn btn-primary\"]"))).
                click();//кликаем Add car
        driver.findElement(By.id("addCarMileage")).sendKeys("1");     //находим Mileage и вносим 1
        wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"Add\"]"))).
                click();
        wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=\"car_add-expense btn btn-success\"]"))).
                click();// кликаем Add fuel expense
        driver.findElement(By.id("addExpenseMileage")).sendKeys("5");     //находим Mileage
        driver.findElement(By.id("addExpenseLiters")).sendKeys("10");     //находим Liters
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("20");  //находим totalCost
        driver.findElement(By.xpath("//button[text()=\"Add\"]")).click();
        wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=\"dropdown-toggle user-nav_toggle\"]"))).
                click(); //кликаем дропдаун My Profile
        wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Settings\"]"))).
                click();// кликаем Settings
        wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=\"btn btn-danger-bg\"]"))).
                click();//кликаем Remove my account
        wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"Remove\"]"))).
                click();// кликаем Remove на поп-апе :)
        }
        @After
        public void postCondition(){
        driver.quit();
        }
    }

