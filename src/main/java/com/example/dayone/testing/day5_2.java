package com.example.dayone.testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		
//		WebDriver driver = new EdgeDriver();
		
		ChromeOptions co=new ChromeOptions(); 
	    co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("401");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		Alert alrt = driver.switchTo().alert();
		alrt.dismiss();//will cancel the alert msg
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("402",Keys.ENTER);
//		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		alrt.accept();//will select the ok
		String msg = alrt.getText();// copy the text from the alert pop
		System.out.println(msg);
		driver.quit();

		
	}
}
