package InfyniInternProject.PageObjects;

import InfyniInternProject.Base.Base;
import org.openqa.selenium.By;

public class LoginPage extends Base {

    public static By Email_id=By.name("email");
    public static By Pass_id=By.name("password");
    public static By LoginButton_id=By.xpath("//button[@type='submit']");

    public static void Email(String email)
    {
        driver.findElement(Email_id).sendKeys(email);


    }
    public static void Password(String pass)
    {
        driver.findElement(Pass_id).sendKeys(pass);


    }
    public static void LoginButton()
    {
        driver.findElement(LoginButton_id).click();

    }

}
