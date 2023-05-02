package com.example.dayone.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.lang.Thread;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
    	WebDriver driver = new EdgeDriver();
    	driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.findElement(By.xpath("/html/body/main/div[2]/div/div/form/fieldset[1]/div[2]/div/input")).sendKeys("Sanjitha");
        driver.findElement(By.id("input-lastname")).sendKeys("Chandrasekar");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("sanju@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("hello@123");
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"input-theme\"]/div[1]/label")).click();
    	driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("hello");
    	driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/label")).click();
    	driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();		
        
    }
}
