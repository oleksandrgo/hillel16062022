package space.forstudent.qauto;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainTests {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public static void configuration() {
        final String path =
                String.format("%s/bin/chromedriver",
                        System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", path);

    }

    @Before
    public void precondition() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
    }


    @Test
    public void test() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.findElement(By.cssSelector(".btn-primary")).click();
        driver.findElement(By.id("signupName")).sendKeys("Vlad");
        driver.findElement(By.id("signupLastName")).sendKeys("Drakula");
        driver.findElement(By.id("signupEmail")).sendKeys("registeredEmail",
                Math.floor(Math.random()*666)+"@gmail.com");
        driver.findElement(By.id("signupPassword")).sendKeys("VC14561476d");
        driver.findElement(By.id("signupRepeatPassword")).sendKeys("VC14561476d");
        driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
wait.until (ExpectedConditions.visibilityOfElementLocated
        (By.xpath("//a[@class=\"btn btn-white btn-sidebar sidebar_btn -profile\"]"))).click();

//Пройти в профайл и проверить, что там такие же name и lastName как при регистрации

        Thread.sleep(2000);
        WebElement profileName = driver.findElement(By.className("display-4"));
        System.out.println(profileName.getText());

//Добавить авто

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-white")))
                        .click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-primary")))
                        .click();
        driver.findElement(By.id("addCarMileage")).sendKeys("666");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"Add\"]")))
                        .click();
//Добавить expenses

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".car_add-expense.btn")))
                        .click();
        driver.findElement(By.id("addExpenseMileage")).clear();
        driver.findElement(By.id("addExpenseMileage")).sendKeys("888");
        driver.findElement(By.id("addExpenseLiters")).sendKeys("22");
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("999");
        driver.findElement(By.xpath("//button[text()=\"Add\"]")).click();

        // Удалить Аккаунт

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".dropdown-toggle")))
                        .click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Settings\"]")))
                        .click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-danger-bg")))
                        .click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"Remove\"]")))
                        .click();
    }
    @After
    public void postCondition(){
        driver.close();}
}


