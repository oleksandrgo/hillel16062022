package space.forstudent.qauto;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainTests {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public static void configuration(){
        final String path = String.format("%s/bin/chromedriver.exe",System.getProperty("user.dir"));
    System.setProperty("webdriver.chrome.driver",path);
    }

    @Before
    public void precondition(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.findElement(By.cssSelector(".btn-primary")).click();
        driver.findElement(By.id("signupName")).sendKeys("Marina");
        driver.findElement(By.id("signupLastName")).sendKeys("Marina");
        driver.findElement(By.id("signupEmail")).sendKeys("249ricky",Math.floor(Math.random() * 10000000) + "@gmail.com");
        driver.findElement(By.id("signupPassword")).sendKeys("Marina1234");
        driver.findElement(By.id("signupRepeatPassword")).sendKeys("Marina1234");
        driver.findElement(By.xpath("//button[text()=\"Register\"]")).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-primary"))).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".btn-primary")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("addCarMileage")).sendKeys("2");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"Add\"]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".car_add-expense.btn"))).click();
        driver.findElement(By.id("addExpenseMileage")).sendKeys("3");
        driver.findElement(By.id("addExpenseLiters")).sendKeys("20");
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("700");
        driver.findElement(By.xpath("//button[text()=\"Add\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".dropdown-toggle"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Settings\"]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-danger-bg"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"Remove\"]"))).click();

        }
    @After
    public void postCondition(){
        driver.quit();
    }
}
