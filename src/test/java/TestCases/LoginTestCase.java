package TestCases;



import InfyniInternProject.PageObjects.LoginPage;
import org.testng.annotations.Test;

public class LoginTestCase extends LoginPage {

    @Test(priority=1)
    public void Login(){

        launch("chrome");

        implicitWait(8);

        Email("swathini16@gmail.com");

        Password("Start123!");

        LoginButton();



        //pageClose();


    }
}
