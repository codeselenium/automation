package home;

import base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created By Waruna.
 */
public class SearchItems extends CommonAPI {

    @Test
    public void serach(){
        typeByCss("#twotabsearchtextbox", "iphone");
        clickByCss(".nav-input");
    }
}
