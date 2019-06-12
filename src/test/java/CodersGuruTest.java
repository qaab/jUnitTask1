import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class CodersGuruTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","/home/cmok/chromeDriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();


    }

    @Test
    public void CodersGuruTest() {
        driver.get("https://men-men-s-01.codersguru.pl/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        List<String> linklist = new ArrayList<>();

        for (WebElement link:links) {
            String name = link.getAttribute("href");
            assertTrue(linklist.add(name));

        }

        for (String linkAdress : linklist) {
            driver.get(linkAdress);
            if (linkAdress.contains(".e")) {
                System.out.println(linkAdress);
            }
        }

    }

    @After
    public void tearDown () {
        driver.close();
        driver.quit();



    }
}

