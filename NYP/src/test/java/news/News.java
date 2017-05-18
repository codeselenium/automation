package news;

import base.CommonAPI;
import utility.reporting.ApplicationLog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Waruna on 5/13/2017.
 */
public class News extends CommonAPI {

    @Test
    public void headlineNews(){
        ApplicationLog.epicLogger("Epic: News EC:1,2 <a https://automationcodeinc.atlassian.net/browse/GREEN-1> GREEN-1 </a>");
        NewsPage newsPage = PageFactory.initElements(driver, NewsPage.class);
        newsPage.clickOnHeadLine();
    }
}
