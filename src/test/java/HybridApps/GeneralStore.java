package HybridApps;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import capabilities.NewCapability;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class GeneralStore extends NewCapability{
	
	
AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void bt() throws MalformedURLException {
		
		driver = capabilityTwo();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@Test(enabled = true)
	public void test1() throws InterruptedException {
	driver.findElement(MobileBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
	
	
	Thread.sleep(2000);
	
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Brazil\"))").click();
	
	Thread.sleep(2000);
	driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Gaurav Sankhyan");
	Thread.sleep(2000);
	driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioMale")).click();
	
	Thread.sleep(2000);
	driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	
	Thread.sleep(2000);
	driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
	Thread.sleep(2000);
	driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
	
//	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Converse All Star\"))").click();
//	
//	driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(1).click();
//	
	
	driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	
	Thread.sleep(2000);
	 String text = driver.findElement(MobileBy.xpath("//*[@text='$160.97']")).getText();
	 System.out.println(text);
	 String product1 = text.substring(1);
	 System.out.println(product1);
	 
	 Thread.sleep(2000);
	 String textTwo = driver.findElement(MobileBy.xpath("//*[@text='$120.0']")).getText();
	 System.out.println(textTwo);
	 String product2 = textTwo.substring(1);
	 System.out.println(product2);
	 
	 Thread.sleep(2000);
	 String totalSum = driver.findElement(MobileBy.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
	 System.out.println(totalSum);
	 String totalPrice = totalSum.substring(2);
	 System.out.println(totalPrice);
	 
	Double firstProduct = Double.parseDouble(product1);
	Double secondProduct = Double.parseDouble(product2);
	Double Total = Double.parseDouble(totalPrice);
	
	
	Double num = firstProduct + secondProduct;
	if(num.equals(Total)) {
		System.out.println("Cost Matched");
	}else {
		System.out.println("Cost Not Matched");
	}
	
	 driver.findElement(MobileBy.xpath("//*[@text='Send me e-mails on discounts related to selected products in future']")).click();
		
	 driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnProceed")).click();
		
	
	 
	 
	}
	
	
	
	
}


