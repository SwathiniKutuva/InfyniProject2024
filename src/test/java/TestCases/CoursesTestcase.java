package TestCases;

import InfyniInternProject.PageObjects.Courses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CoursesTestcase extends Courses{

    @Test(priority = 3)
    public  void Courses()
    {
        ProfessionalCourse();

        boolean actualresult = ProfessionalPage();
        boolean expectedresult = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualresult, expectedresult);// using soft assert
        sa.assertAll();

        Home();




    }
}
