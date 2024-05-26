package WebApps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.Immutable;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class Masai {
	AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void cap() throws MalformedURLException {
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Random");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "/Users/shwetasankyan/Downloads/chromedriver-mac-arm64/chromedriver");
	dc.setCapability("appium:chromeOptions", ImmutableMap.of("w3c",false));
	driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);

	 
	
	}
	
	@Test
	public void Test1() throws InterruptedException {
		driver.get("https://www.google.com");
		 driver.findElement(MobileBy.xpath("//textarea[@class='gLFyf']")).sendKeys("Masai", Keys.ENTER);
		 
//			Pressing Enter using action class.
//		 Actions act = new Actions(driver);
//		 act.sendKeys(Keys.ENTER).build().perform();
//		 
//		 
//		 driver.findElement(By.linkText("Masai School")).click();
//			
//	  List<AndroidElement> getLink = driver.findElements(By.tagName("a"));
//	
//	  
//	System.out.println(getLink.size());
//	for(int i = 0 ;i<getLink.size();i++) {
//		System.out.println(getLink.get(i).getText());
//		System.out.println(getLink.get(i).getAttribute("href"));
//	}
//		Thread.sleep(1000);
//		
//		
//		 this below 2 lines of code is for scrolling the WebPage in the mobile. 
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0, 500);");
//		
		
	}

}




















