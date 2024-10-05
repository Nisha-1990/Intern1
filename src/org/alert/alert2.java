package org.alert;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class alert2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nisha\\eclipse-workspace\\Alert\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement alert = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		alert.click();
		
		WebElement clk = driver.findElement(By.xpath("//button[contains(text(),'display a confirm box')]"));
		clk.click();
		
		//switch to alert box
		Alert a = driver.switchTo().alert();
	
		a.accept();
		
		
		
		
		
	

}
}
