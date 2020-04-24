package com.qa.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	
	
	public void initialisebrowser() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\jaya\\workspace\\work\\ProjectE2E\\src\\main\\java\\com\\qa\\test\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		if(browserName.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgajjave\\Desktop\\seleniu set up softwares\\chromedriver.exe");
		    driver=new ChromeDriver();	
			
		}
		
		else if (browserName.equals("firefox"))
		{
			System.out.println("Execute in firefox Browser");
			driver = new FirefoxDriver();
			
		}
		
	}

}
