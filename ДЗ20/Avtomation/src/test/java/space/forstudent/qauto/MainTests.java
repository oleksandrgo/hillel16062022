package space.forstudent.qauto;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainTests {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public static void configuration (){
        final String path = String.format("%s/bin/chromedriver.exe",
                System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver",path);
    }

    @Before
    public void precondition(){
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, 5);
    }

    @Test
    public void test() throws InterruptedException {

    //Создать пользователя
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.findElement(By.cssSelector(".btn-primary")).click();
        driver.findElement(By.id("signupName")).sendKeys("Erica");
        driver.findElement(By.id("signupLastName")).sendKeys("Smith");
        driver.findElement(By.id("signupEmail")).sendKeys("registeredEmail", Math.floor(Math.random()*100000) + "@gmail.com");
        driver.findElement(By.id("signupPassword")).sendKeys("Qwerty12");
        driver.findElement(By.id("signupRepeatPassword")).sendKeys("Qwerty12");
        driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();

        wait.until
        (ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=\"btn btn-white btn-sidebar sidebar_btn -profile\"]"))).
        click(); //нажать кнопку Профиля слева

    //Проверка name и lastName
        wait.until
                (ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".display-4")));

        String actualData = new String();
        actualData = ("Erica")+" "+("Smith");
        String profileName = driver.findElement(By.cssSelector(".display-4")).getText();
        Assert.assertEquals("Имя/фамилия не совпадают",actualData,profileName);

    //Добавить авто

       /* //Навигация

       String currentUrl = driver.getCurrentUrl();
        System.out.println("Current url " + currentUrl);
        String navigateToUserData = "https://qauto.forstudy.space/panel/garage";
        driver.navigate().to(navigateToUserData); */

        driver.findElement(By.xpath("//a[@routerlink=\"garage\"]")).click();

        driver.findElement(By.className("btn-primary")).click();
        driver.findElement(By.id("addCarMileage")).sendKeys("50");
        wait.until
               (ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"Add\"]"))).
                click();

    //Добавить expenses этому авто

        wait.until
               (ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".car_add-expense.btn"))).
                click();
        driver.findElement(By.id("addExpenseMileage")).clear();
        driver.findElement(By.id("addExpenseMileage")).sendKeys("100");
        driver.findElement(By.id("addExpenseLiters")).sendKeys("60");
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("300");
        driver.findElement(By.xpath("//button[text()=\"Add\"]")).click();

    //Удалить акаунт
        Thread.sleep(2000);
        wait.until
               (ExpectedConditions.visibilityOfElementLocated(By.id("userNavDropdown"))).
                click();
        wait.until
               (ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Settings\"]"))).
                click();
        wait.until
               (ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-danger-bg"))).
                click();
        driver.findElement(By.xpath("//button[text()=\"Remove\"]")).click();
    }
    @After
     public void postCondition(){
        driver.close();}
}