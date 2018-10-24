package com.shopping.framework.utility;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {
	
public static WebDriver driver=null;
	
	public static WebDriver launch_App() {
		ConfigReader config=new ConfigReader();
		
		System.setProperty(config.getKeyValue("chromeDriver"), config.getKeyValue("chromeDriverPath"));		
		driver =new ChromeDriver();
		driver.get(config.getKeyValue("baseUrl"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;			
	}

	
	
}






	
	
	
	
	


