package space.forstudent.qauto;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.color.ProfileDataException;
import java.util.concurrent.TimeUnit;

public class MainTests {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public static void configuration() {
        final String path =
                String.format("%s/bin/chromedriver.exe",
                        System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", path);
    }

    @Before
    public void precondition() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MICROSECONDS);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.findElement(By.cssSelector(".btn-primary")).click();
        driver.findElement(By.id("signupName")).sendKeys("Aleksandra", Keys.TAB);
        driver.findElement(By.id("signupLastName")).sendKeys("Kravchuk", Keys.TAB);
        driver.findElement(By.id("signupEmail")).sendKeys("12345" + Math.floor(Math.random() * 100000) + "@gmail.com", Keys.TAB);
        driver.findElement(By.id("signupPassword")).sendKeys("Qaz1234567", Keys.TAB);
        driver.findElement(By.id("signupRepeatPassword")).sendKeys("Qaz1234567", Keys.TAB);

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn-primary")));
        driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();

        WebElement name = driver.findElement(By.id("signupName"));
        final String EXPECTED_NAME = name.getText();
        Assert.assertEquals("Текст не соответствует", EXPECTED_NAME, name.getText());

        WebElement lastName = driver.findElement(By.id("signupLastName"));
        final String EXPECTED_LASTNAME = lastName.getText();
        Assert.assertEquals("Текст не соответствует", EXPECTED_LASTNAME, lastName.getText());

        wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=\"btn btn-white btn-sidebar sidebar_btn -profile\"]"))).
                click();                                                                                                //Profile

        //Assert.assertTrue(driver.findElement(By.className("profile_name")).getText().contains("Aleksandra Kravchuk"));

                wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class = \"btn btn-white btn-sidebar sidebar_btn\"]"))).
                click();                                                                                                 //Garage

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-primary"))).click();               //Car
        driver.findElement(By.id("addCarBrand")).sendKeys("BMW", Keys.TAB);
        driver.findElement(By.id("addCarModel")).sendKeys("X5", Keys.TAB);
        driver.findElement(By.id("addCarMileage")).sendKeys("1", Keys.TAB);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=\"Add\"]")));
        driver.findElement(By.xpath("//button[text()=\"Add\"]")).click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".car_add-expense.btn"))).click();      //Add fuel expense
        driver.findElement(By.id("addExpenseMileage")).sendKeys("1", Keys.TAB);
        driver.findElement(By.id("addExpenseLiters")).sendKeys("20", Keys.TAB);
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("500", Keys.TAB);
        driver.findElement(By.xpath("//button[text()=\"Add\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".dropdown-toggle"))).click();                // Settings
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Settings\"]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-danger-bg"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-danger"))).click();




    }


    @After
    public void postCondition() {
        driver.quit();
    }
}
