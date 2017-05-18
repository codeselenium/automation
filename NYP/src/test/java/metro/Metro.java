package metro;

import base.CommonAPI;
import utility.reporting.ApplicationLog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Waruna on 5/13/2017.
 */
public class Metro extends CommonAPI {

    @Test
    public void metroNews(){
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://automationcodeinc.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        MetroPage metroPage = PageFactory.initElements(driver, MetroPage.class);
        metroPage.metroPageNews();
    }
}
