package genericlab;
//for taking screen shot of failed test cases
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
//we will pass a parmenter for driver and name
	public void getScreenshot( WebDriver driver, String name) throws IOException {
	Date d =new Date();
	String currentdate = d.toString().replaceAll(":", "-");
	//creating a object we are giving a date pattren
		TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
		//we are adding the date and name, file format for the screen shot taken
	File dest= new File(AutoConstant.photopath+currentdate+name+".png");
	FileUtils.copyFile(src, dest);
	}

}
