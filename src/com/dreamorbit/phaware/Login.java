
package com.dreamorbit.phaware;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login 
{
	//private static String url="https://qa-walktest.phaware.global";
	
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./lib/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://qa-walktest.phaware.global");
	Thread.sleep(3000);
	WebElement ele= driver.findElement(By.xpath("//input[@type='text']"));
	//ele.click();// for laptop
	ele.sendKeys("karthik.ds@dreamorbit.com");
	WebElement ele2= driver.findElement(By.id("userPassword"));
	//ele2.click();
	ele2.sendKeys("Orbit+987*");
	WebElement ele3= driver.findElement(By.id("submit"));
	ele3.click();
	Thread.sleep(20000);
	//WebElement elep=driver.findElement(By.linkText("Participants"));
	//WebElement elep1= driver.findElement(By.xpath("//td/a[@href='/organization/127/studies/19/participants']"));
//	driver.findElement(By.xpath("a[text()='Participants']")).click();
	//driver.findElement(By.xpath("a[contains(text(),'Participants')])"));
	driver.findElement(By.xpath("//a[contains(@href, 'participants')"));
	//elep1.click();
	
	
}
}
