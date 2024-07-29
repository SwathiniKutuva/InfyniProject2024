package InfyniInternProject.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Base {

    public static WebDriver driver;

    public static void launch(String browser )
    {


        if(browser.equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();


        }else if(browser.equals("Edge")) {

            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }

        driver.get("https://devnj.infyni.com/login");

        driver.manage().window().maximize();



    }

    public static void implicitWait(int seconds)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));

    }


    public static void pageClose() {

        driver.close();
    }

}
