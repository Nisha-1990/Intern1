package org.alert;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class alert1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nisha\\eclipse-workspace\\Alert\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement clk = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		clk.click();
		
		Thread.sleep(3000);
		
		//switch to alert box
		Alert swit = driver.switchTo().alert();
		
		swit.accept();
		
		
		
	}

}
