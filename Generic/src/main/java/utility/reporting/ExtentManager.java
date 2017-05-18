package utility.reporting;


import com.relevantcodes.extentreports.ExtentReports;
import org.testng.ITestContext;
import org.testng.Reporter;
import java.io.File;

/**
 * Created by mwaruna on 05/13/17.
 */
public class ExtentManager {

    private static ExtentReports extent;
    private static ITestContext context;

    public synchronized static ExtentReports getInstance() {
        if (extent == null) {
            File outputDirectory = new File(context.getOutputDirectory());
            File resultDirectory = new File(outputDirectory.getParentFile(), "html");
            extent = new ExtentReports(System.getProperty("user.dir") + "/Extent-Report/ExtentReport.html", true);
            Reporter.log("Extent Report directory: " + resultDirectory, true);
            extent.addSystemInfo("Host Name" , "automationinc")
                    .addSystemInfo("Environment", "QA")
                    .addSystemInfo("User Name", "waruna");
            extent.loadConfig(new File(System.getProperty("user.dir") + "/report-config.xml"));
        }

        return extent;
    }


    public static void setOutputDirectory(ITestContext context) {
        ExtentManager.context = context;
    }
}
