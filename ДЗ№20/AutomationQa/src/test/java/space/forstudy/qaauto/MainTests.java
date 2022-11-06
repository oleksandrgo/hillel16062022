package space.forstudy.qaauto;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;
import java.util.random.RandomGenerator;


public class MainTests {

    WebDriver driver;

    @BeforeClass
    public static void configuration() {
        final String path = String.format("%s/bin/chromedriver.exe", System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", path);
    }

    @Before
    public void precondition() {
        driver = new ChromeDriver();
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
    public void test() throws Exception {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".btn-primary")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("signupName")).sendKeys(name, Keys.TAB);
        Thread.sleep(1000);
        driver.findElement(By.id("signupLastName")).sendKeys(lastName, Keys.TAB);
        Thread.sleep(1000);
        driver.findElement(By.id("signupEmail")).sendKeys(createMail(), Keys.TAB);
        Thread.sleep(1000);
        driver.findElement(By.id("signupPassword")).sendKeys("Mdv30081983", Keys.TAB);
        Thread.sleep(1000);
        driver.findElement(By.id("signupRepeatPassword")).sendKeys("Mdv30081983");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()=\"Register\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()=\" Profile \"]")).click();
        Thread.sleep(1000);

        String checkFullName = (driver.findElement(By.className("profile_name")).getText());
        if (!checkFullName.equals(fullName)) throw new Exception("Incorect Full Name");

        driver.findElement(By.xpath("//a[text()=\"Garage\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()=\"Add car\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("addCarMileage")).sendKeys(mileageOne, Keys.TAB);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()=\"Add\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()=\"Add fuel expense\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("mileage")).sendKeys(mileageTwo, Keys.TAB);
        Thread.sleep(1000);
        driver.findElement(By.name("liters")).sendKeys("100", Keys.TAB);
        Thread.sleep(1000);
        driver.findElement(By.name("totalCost")).sendKeys("1000", Keys.TAB);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()=\"Add\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()=\" Settings \"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()=\"Remove my account\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()=\"Remove\"]")).click();
    }
        @After
        public void postCondition() {
            driver.quit();
        }
    }


