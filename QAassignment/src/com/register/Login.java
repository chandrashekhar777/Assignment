package com.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
public static void main(String[] args) throws InterruptedException
	
	{
	
	System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe"); 
	WebDriver driver = new FirefoxDriver();
	driver.get("https://meralda.scalenext.io/user/login");
    Thread.sleep(3000);
    driver.findElement(By.name("username")).sendKeys("channu2@gmail.com");
    Thread.sleep(3000);
    driver.findElement(By.name("password")).sendKeys("lsspl@123"); 
    Thread.sleep(3000);
    driver.findElement(By.xpath("/html/body/div[1]/section/div/form/div/div[3]/button")).click();
}

}
