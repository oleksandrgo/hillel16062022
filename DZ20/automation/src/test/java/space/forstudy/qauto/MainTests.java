package space.forstudy.qauto;

import jdk.jfr.Timestamp;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Date;
import java.util.Objects;

public class MainTests {
    WebDriver driver;
    @BeforeClass
    public static void configuration(){
        final String path = String.format("%s/bin/chromedriver.exe",System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver",path);
    }
    @Before
    public void  precondition(){
        driver = new ChromeDriver();
    }

    // используемые переменные
    String name = "Sergey";                                     // объявляем переменную имя
    String lastname = "Socolov";                                // объявляем переменную фамилия
    String nameLastname = name + " " + lastname;                // объявляем переменную имя + фамилия
    String email = System.currentTimeMillis() + "@gmail.com";   // объявляем переменную email. Уникальность пользователя обеспечивается за счет конкатенации текущего системного времени и почтового домена
    String password = "As123456";                               // объявляем переменную пароль
    String firstMileage = "2";                                  // объявляем переменную начальный пробег авто
    String secondMileage = firstMileage + "1";                  // объявляем переменную для добавления expense
    String numbOfLiters = "10";                                 // объявляем переменную количество заправленных литров
    String cost = "450";                                        // объявляем переменную стоимость заправки

    @Test
    public void  test() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");                  // вход на сайт с логином и паролем
        driver.findElement(By.cssSelector(".btn-primary")).click();                       // нажимаем SignUp
        driver.findElement(By.id("signupName")).sendKeys(name, Keys.TAB);                 // вводим Name
        driver.findElement(By.id("signupLastName")).sendKeys(lastname, Keys.TAB);         // вводим Last name
        driver.findElement(By.id("signupEmail")).sendKeys(email, Keys.TAB);               // вводим Email
        driver.findElement(By.id("signupPassword")).sendKeys(password, Keys.TAB);         // вводим password
        driver.findElement(By.id("signupRepeatPassword")).sendKeys(password, Keys.TAB, Keys.ENTER);  // повторяем password и нажимаем Register
        Thread.sleep(3000);                                                         // делаем паузу на загрузку страницы
        driver.findElement(By.className("dropdown-toggle")).click();                      // нажимаем My profile
        Thread.sleep(1000);                                                         // пауза
        driver.findElement(By.xpath("//a[text()=\"Profile\"]")).click();     // нажимаем Profile в дропдауне
        Thread.sleep(3000);                                                         // пауза
        WebElement UserData = driver.findElement(By.className("profile_name"));           // находим элемент содержащий данные пользователя
        String TestUserData = (UserData.getText());                                       // получаем данные пользователя и помещаем в переменную
        if (nameLastname.equals(TestUserData)){                                           // сравниваем введенное имя пользователя с фактическим
            driver.findElement(By.className("dropdown-toggle")).click();                  // продолжаем работу(жмем дропдаун My profile) если совпадает
            }
        else {
            System.out.println("Тест не пройден");                                        // выводим сообщение, если не совпадает
        }
        driver.findElement(By.xpath("//a[text()=\"Garage\"]")).click();      // нажимаем кнопку Garage
        driver.findElement(By.className("btn-primary")).click();                          // жмем Add Car
        driver.findElement(By.id("addCarMileage")).sendKeys(firstMileage, Keys.TAB);      // добавляем пробег
        driver.findElement(By.xpath("//button[text()=\"Add\"]")).click();    // нажимаем Add(создаётся авто)
        Thread.sleep(2000);                                                         // пауза
        driver.findElement(By.xpath("//button[text()=\"Add fuel expense\"]")).click();    // нажимаем добавить Expense
        Thread.sleep(2000);                                                        // пауза
        driver.findElement(By.name("mileage")).sendKeys(secondMileage, Keys.TAB);       // вводим пробег
        driver.findElement(By.name("liters")).sendKeys(numbOfLiters, Keys.TAB);         // вводим количетво литров
        driver.findElement(By.name("totalCost")).sendKeys(cost, Keys.TAB);              // вводим количество денег
        driver.findElement(By.xpath("//button[text()=\"Add\"]")).click();  // нажимаем Add
        driver.findElement(By.className("dropdown-toggle")).click();                    // нажимаем на дропдаун My profile
        Thread.sleep(1000);                                                       // пауза
        driver.findElement(By.xpath("//a[text()=\"Settings\"]")).click();  // нажимаем Settings
        Thread.sleep(3000);                                                       // пауза
        driver.findElement(By.xpath("//button[text()=\"Remove my account\"]")).click(); // нажимаем Remove my account
        driver.findElement(By.xpath("//button[text()=\"Remove\"]")).click();            // нажимаем Remove(удаляем аккаунт)
        }
    @After
    public void  postCondition(){                       // завершение тестирования
        driver.quit();
    }
}
