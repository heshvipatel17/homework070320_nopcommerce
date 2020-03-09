package brosertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IETest {

    public static void main(String[] args) {

        String baseURL = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
        String title = driver.getTitle();
        System.out.println("Main page " +title);
        driver.quit();
    }
}


