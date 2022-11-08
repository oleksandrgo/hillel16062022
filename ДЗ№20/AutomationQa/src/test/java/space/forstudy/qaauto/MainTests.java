package space.forstudy.qaauto;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.random.RandomGenerator;


public class MainTests {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public static void configuration() {
        final String path = String.format("%s/bin/chromedriver.exe", System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", path);
    }

    @Before
    public void precondition() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,2);
    }

    public String createMail() {

        return "mail" + RandomGenerator.getDefault().nextInt() + "@gmail.com";
    }

    String name = "Dima";
    String lastName = "Migalin";
    String fullName = name + " " + lastName;
    String mileageOne = "1";
    String mileageTwo = mileageOne + "0";

    @Test
    public void test() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.findElement(By.cssSelector(".btn-primary")).click();
        driver.findElement(By.id("signupName")).sendKeys(name, Keys.TAB);
        driver.findElement(By.id("signupLastName")).sendKeys(lastName, Keys.TAB);
        driver.findElement(By.id("signupEmail")).sendKeys(createMail(), Keys.TAB);
        driver.findElement(By.id("signupPassword")).sendKeys("Mdv30081983", Keys.TAB);
        driver.findElement(By.id("signupRepeatPassword")).sendKeys("Mdv30081983");
        driver.findElement(By.xpath("//button[text()=\"Register\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=\"btn btn-white btn-sidebar sidebar_btn -profile\"]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("profile_name")));

        WebElement CheckFullName = driver.findElement(By.className("profile_name"));

        String TestCheckFullName = (CheckFullName.getText());
        final String ExpectedCheckFullName= fullName;
        Assert.assertEquals("Error", ExpectedCheckFullName, TestCheckFullName);

        driver.findElement(By.xpath("//a[text()=\"Garage\"]")).click();
        driver.findElement(By.xpath("//button[text()=\"Add car\"]")).click();
        driver.findElement(By.id("addCarMileage")).sendKeys(mileageOne, Keys.TAB);
        driver.findElement(By.xpath("//button[text()=\"Add\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".car_add-expense.btn"))).click();
        driver.findElement(By.name("mileage")).sendKeys(mileageTwo, Keys.TAB);
        driver.findElement(By.name("liters")).sendKeys("100", Keys.TAB);
        driver.findElement(By.name("totalCost")).sendKeys("1000", Keys.TAB);
        driver.findElement(By.xpath("//button[text()=\"Add\"]")).click();
        driver.findElement(By.xpath("//a[text()=\" Settings \"]")).click();
        driver.findElement(By.xpath("//button[text()=\"Remove my account\"]")).click();
        driver.findElement(By.xpath("//button[text()=\"Remove\"]")).click();
    }
        @After
        public void postCondition() {
            driver.quit();
        }
    }


