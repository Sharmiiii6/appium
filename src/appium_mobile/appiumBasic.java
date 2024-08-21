package appium_mobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class appiumBasic {
	
	@Test
	public void AppiumTest() throws MalformedURLException
	{
		//AndroidDriver
		//appium code->appium server->mobile
		
		AppiumDriverLocalService service= new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\91824\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
						.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
						
		
		UiAutomator2Options option=new UiAutomator2Options();
		option.setDeviceName("My device"); //emulator
		option.setApp("C:\\Users\\91824\\OneDrive - Technology Risk Limited\\Desktop\\appium_mobile\\src\\resources\\ApiDemos-debug.apk");
		option.setCapability("uiautomator2ServerLaunchTimeout", 90000);
		
		
		AndroidDriver driver=new AndroidDriver(new URL(" http://127.0.0.1:4723"),option);
		driver.findElement(AppiumBy.accessibilityId("Content")).click();
		
		
		
		//driver.quit();
		
		//service.stop();
	}

}
