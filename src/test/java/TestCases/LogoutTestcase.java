package TestCases;

import InfyniInternProject.PageObjects.Logout;
import org.testng.annotations.Test;


public class LogoutTestcase extends Logout {

    @Test(priority = 4)

    public void LogoutPage()
    {

        SelectDropdown();
        logout();
    }
}
