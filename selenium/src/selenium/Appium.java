package selenium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.MobileBy;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
//test comment
public class Appium {
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException
	
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "8.1.0"); 
		capabilities.setCapability("deviceName","moto g6");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("appPackage", "com.tripple");
		capabilities.setCapability("appActivity","com.tripple.MainActivity");
		
		capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Mobile Number']")).sendKeys("1111111111");
		
	
		driver.findElement(By.xpath("//android.view.ViewGroup[@index='7']")).click();
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='GET OTP']")).click();
		
		
		driver.findElement(By.xpath("//android.widget.EditText[@index='4']")).sendKeys("1");
		
		driver.findElement(By.xpath("//android.widget.EditText[@index='5']")).sendKeys("2");
		
		driver.findElement(By.xpath("//android.widget.EditText[@index='6']")).sendKeys("3");
		
		driver.findElement(By.xpath("//android.widget.EditText[@index='7']")).sendKeys("4");
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='VERIFY']")).click();
		
		
		//driver.("abc");
		
		//driver.findElement(By.id("app_id_screen_save_button")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
