package org.red;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.id("email")).sendKeys("kathir");
		d.findElement(By.id("pass")).sendKeys("jdhd");
		d.findElement(By.name("login")).click();
		}

}
