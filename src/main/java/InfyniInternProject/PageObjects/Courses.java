package InfyniInternProject.PageObjects;

import InfyniInternProject.Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Courses extends Base {

    public static By Professionals=By.xpath("//span[text()='Professionals']");
    public static By ProfessionalPage =By.xpath("//h1[text()='Professionals']");
    public static By home=By.xpath("//span[text()='Home']");

    public static void ProfessionalCourse(){
        try {
            driver.findElement(Professionals).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public static boolean ProfessionalPage()
    {
        boolean result= false;
        try {
            result = driver.findElement(ProfessionalPage).isDisplayed();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return result;


    }

    public static void Home()
    {
        try {
            driver.findElement(home).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }




}
