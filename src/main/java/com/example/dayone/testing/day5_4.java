package com.example.dayone.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5_4 {
	
	public static void main(String[] args)
	{
		ChromeOptions co=new ChromeOptions(); 
	    co.addArguments("--remote-allow-origins=*");
			
	     WebDriverManager.edgedriver().setup();
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.abhibus.com/bus-ticket-booking");
	     driver.findElement(By.xpath("//*[@id=\"source\"]")).sendKeys("Coimbatore");
	     driver.findElement(By.xpath("//*[@id=\"destination\"]")).sendKeys("Tiruppur");
	     WebElement date = driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
	     JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].setAttribute('value','27/04/2023')", date);

	     
	     
	     
	}

}
