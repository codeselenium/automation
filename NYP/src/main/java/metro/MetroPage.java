package metro;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import utility.reporting.TestLogger;

/**
 * Created by Waruna on 5/13/2017.
 */
public class MetroPage extends CommonAPI {

    public void metroPageNews(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToMetroSections();
    }
}
