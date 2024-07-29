package InfyniInternProject.PageObjects;

import InfyniInternProject.Base.Base;
import org.openqa.selenium.By;

public class DashBoard extends Base {

    public static By home=By.xpath("//span[text()='Home']");

    public static void Home()
    {
        try {
            driver.findElement(home).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
