package androidmhb;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentReportsMHB {

	ExtentSparkReporter htmlReporter;
	ExtentReports extent;

	@BeforeSuite 
	public void reportSetup() {
		//ExtentHtmlReporter has been discontinued from version 5 and replaced with SparkREporter
		 htmlReporter = new ExtentSparkReporter("extent.html");
		// create ExtentReporters and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	@AfterSuite
	public void reportTeardown()
	{
		// Calling flush writes everything to the log file
		extent.flush();
	}
}
