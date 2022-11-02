package spase.forstudy.qauto;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MainTests {
    WebDriver driver;

    /*@BeforeClass
    public static void configuration(){
        final String path = String.format("%s/bin/chromedriver.exe",
                System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", path);
    }*/

    @Before
    public void precondition(){
        driver = new SafariDriver();
    }

    @Test
    public void test(){
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
    }
}
