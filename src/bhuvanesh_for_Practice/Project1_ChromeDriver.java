package bhuvanesh_for_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1_ChromeDriver {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\Bhuvanesh - Testing\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");

	}

}
