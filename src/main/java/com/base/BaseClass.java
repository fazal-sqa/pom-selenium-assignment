package com.base;

import static com.codeborne.selenide.Selenide.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void initialization(String browserName) throws InterruptedException, IOException {

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"D:\\selenium_assignment_pom-master\\selenium_assignment_pom-master\\src\\main\\java\\config.properties");
		prop.load(ip);

		// Chrome Browser -- WebDriver Configurations

		if (browserName.equalsIgnoreCase("chrome")) {
			String chromeDriverPath = prop.getProperty("chrome_driver_path");
	        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//Drivers//chromedriver_win32//chromedriver.exe");
		}

		open(prop.getProperty("url"));
	}
}
