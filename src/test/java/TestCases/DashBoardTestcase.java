package TestCases;

import InfyniInternProject.PageObjects.DashBoard;
import org.testng.annotations.Test;

public class DashBoardTestcase extends DashBoard {

    @Test(priority = 2)
    public  void dashBoard()
    {
        Home();
    }
}
