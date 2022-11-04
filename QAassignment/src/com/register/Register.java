package com.register;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Register {
	public static void main(String[] args) throws InterruptedException
	
	{
		
		//Register
	    System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe"); 
		WebDriver driver = new FirefoxDriver();
		driver.get("https://meralda.scalenext.io/user/register");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/section/div/div[2]/form/div/div[1]/div/div[1]/div[1]/input")).sendKeys("Channu");
		Thread.sleep(3000);
		driver.findElement(By.name("last_name")).sendKeys("M");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/section/div/div[2]/form/div/div[1]/div/div[2]/input")).sendKeys("channu2@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("mobile")).sendKeys("3234567890");
		Thread.sleep(3000);
		driver.findElement(By.className("mx-input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/table/tbody/tr[3]/td[4]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/section/div/div[2]/form/div/div[1]/div/div[5]/input")).sendKeys("lsspl@123");
		Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/section/div/div[2]/form/div/div[1]/div/div[6]/input")).sendKeys("lsspl@123");
	    Thread.sleep(3000);
	    JavascriptExecutor js =(JavascriptExecutor)driver;
	    js.executeScript("window.scroll(0,2000)");
	    Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/section/div/div[2]/form/div/div[2]/button")).click();
        
	    String text = driver.findElement(By.className("alert alert-success alert-dismissable fade show text-center")).getText();
	    System.out.println(text);
	    
	    }
}