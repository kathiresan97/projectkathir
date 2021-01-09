package org.red;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2 {
public WebDriver driver;
	@BeforeClass
	private void openClass() {
WebDriverManager.chromedriver().setup();
 driver=new ChromeDriver();
	}
	
	@Test
	private void tc1() {
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("kathir");
driver.findElement(By.id("pass")).sendKeys("jdhd");
driver.findElement(By.name("login")).click();
	}
}
