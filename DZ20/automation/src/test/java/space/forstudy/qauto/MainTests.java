package space.forstudy.qauto;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class MainTests {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public static void configuration(){
        final String path = String.format("%s/bin/chromedriver.exe",System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver",path);
    }
    @Before
    public void  precondition(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        wait = new WebDriverWait(driver, 3);
    }

    // используемые переменные
    String name = "Sergey";                                     // объявляем переменную имя
    String lastname = "Socolov";                                // объявляем переменную фамилия
    String nameLastname = name + " " + lastname;                // объявляем переменную имя + фамилия
    String email = System.currentTimeMillis() + "@gmail.com";   // объявляем переменную email. Уникальность пользователя обеспечивается за счет конкатенации текущего системного времени и почтового домена
    String password = "As123456";                               // объявляем переменную пароль
    String firstMileage = "2";                                  // объявляем переменную начальный пробег авто
    String secondMileage = firstMileage + "0";                  // объявляем переменную для добавления expense
    String numbOfLiters = "10";                                 // объявляем переменную количество заправленных литров
    String cost = "450";                                        // объявляем переменную стоимость заправки

    @Test
    public void  test() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");                  // вход на сайт с логином и паролем
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-primary"))).click();
        driver.findElement(By.id("signupName")).sendKeys(name, Keys.TAB);                 // вводим Name
        driver.findElement(By.id("signupLastName")).sendKeys(lastname, Keys.TAB);         // вводим Last name
        driver.findElement(By.id("signupEmail")).sendKeys(email, Keys.TAB);               // вводим Email
        driver.findElement(By.id("signupPassword")).sendKeys(password, Keys.TAB);         // вводим password
        driver.findElement(By.id("signupRepeatPassword")).sendKeys(password);  // повторяем password и нажимаем Register
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("Register")));
        driver.findElement(By.xpath("//button[text()=\"Register\"]")).click();
        driver.findElement(By.className("dropdown-toggle")).click();                      // нажимаем My profile
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("Profile")));
        driver.findElement(By.xpath("//a[text()=\"Profile\"]")).click();     // нажимаем Profile в дропдауне
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("profile_name")));
        WebElement UserData = driver.findElement(By.className("profile_name"));           // находим элемент содержащий данные пользователя

        String TestUserData = (UserData.getText());                                       // получаем данные пользователя и помещаем в переменную
        final String EXPECTED_USER_DATA = nameLastname;
        Assert.assertEquals("Тест не пройден", EXPECTED_USER_DATA, TestUserData);

        driver.findElement(By.className("dropdown-toggle")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("Garage")));
        driver.findElement(By.xpath("//a[text()=\"Garage\"]")).click();      // нажимаем кнопку Garage
        driver.findElement(By.className("btn-primary")).click();                          // жмем Add Car
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("addCarMileage")));
        driver.findElement(By.id("addCarMileage")).sendKeys(firstMileage, Keys.TAB);      // добавляем пробег
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("Add")));
        driver.findElement(By.xpath("//button[text()=\"Add\"]")).click();    // нажимаем Add(создаётся авто)
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("Add fuel expense")));
        driver.findElement(By.xpath("//button[text()=\"Add fuel expense\"]")).click();    // нажимаем добавить Expense
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("Add an expense")));
        driver.findElement(By.name("mileage")).sendKeys(secondMileage, Keys.TAB);       // вводим пробег
        driver.findElement(By.name("liters")).sendKeys(numbOfLiters, Keys.TAB);         // вводим количетво литров
        driver.findElement(By.name("totalCost")).sendKeys(cost, Keys.TAB);              // вводим количество денег
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=\"Add\"]")));
        driver.findElement(By.xpath("//button[text()=\"Add\"]")).click();  // нажимаем Add
        driver.findElement(By.className("dropdown-toggle")).click();                    // нажимаем на дропдаун My profile
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("Settings")));
        driver.findElement(By.xpath("//a[text()=\"Settings\"]")).click();  // нажимаем Settings
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("Remove my account")));
        driver.findElement(By.xpath("//button[text()=\"Remove my account\"]")).click(); // нажимаем Remove my account
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("Remove")));
        driver.findElement(By.xpath("//button[text()=\"Remove\"]")).click();            // нажимаем Remove(удаляем аккаунт)
        }
    @After
    public void  postCondition(){                       // завершение тестирования
        driver.quit();
    }
}
