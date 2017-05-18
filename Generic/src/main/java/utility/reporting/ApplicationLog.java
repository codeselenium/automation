package utility.reporting;

import utility.reporting.TestLogger;

/**
 * Created by mwaruna on 5/14/17.
 */
public class ApplicationLog {
    public static void epicLogger(String epic){
        TestLogger.log(epic);
        TestLogger.log("Launch local browser Instance");
    }
}
