package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static Properties prop; //it's a simple way, the better way see in GlobalProperties class

    public static WebDriver getDriver() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\o.basha\\IdeaProjects\\CucumberDemo\\src\\test\\java\\Utils\\global.properties");
        prop.load(fis);
//        prop.get("url");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\o.basha\\Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(prop.getProperty("url"));
        return driver;
    }

}
