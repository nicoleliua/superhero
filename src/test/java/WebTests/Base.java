package WebTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {

    public static WebDriver driver;
    public static Properties prop;

    public static WebDriver getDriver() throws IOException, InterruptedException {
        prop=new Properties();
        FileInputStream fis=new FileInputStream("D:\\Users\\nicole.liu\\workspace\\ExamTest\\src\\test\\java\\WebTests\\global.properties");
        prop.load(fis);

        System.setProperty("webdriver.chrome.driver", "C:\\personal\\chromedriver.exe");
        driver=new ChromeDriver();
        System.out.println("Nicole testing url ==" + prop.getProperty("url"));
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        Thread.sleep(3000);
        return driver;

    }
}








