package InfyniInternProject.PageObjects;

import InfyniInternProject.Base.Base;
import org.openqa.selenium.By;

public class Logout extends Base {


public static By SelectLogout = By.xpath("//div[@class='flex']/button/div/img");
    public static By Logout = By.xpath("//span[text()='Log Out']");
public static void SelectDropdown()
{
    try {
        driver.findElement(SelectLogout).click();
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
public static void logout()
{
    try {
        driver.findElement(Logout).click();
    } catch (Exception e) {
        throw new RuntimeException(e);
    } finally {
    }
}



}
