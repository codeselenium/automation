package home;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created By Waruna.
 */
public class TestAmazonHome extends CommonAPI {
    @Test
    public void amazonTitle() {
        String titleActual = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        Assert.assertEquals(titleActual, driver.getTitle());
        System.out.println(driver.getTitle());
    }
}
