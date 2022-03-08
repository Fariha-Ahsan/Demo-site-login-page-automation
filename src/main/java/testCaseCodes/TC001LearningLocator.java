package testCaseCodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseCode.DriverSetup;

public class TC001LearningLocator extends DriverSetup {
	String baseUrl ="https://rahulshettyacademy.com/locatorspractice/";
	@Test
	public void learningLocator() throws InterruptedException {
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys("Mohosi");
		Thread.sleep(2000);
		driver.findElement(By.name("inputPassword")).sendKeys("Password");
		Thread.sleep(2000);
		driver.findElement(By.id("chkboxOne")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("papel");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("pakl");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("01987684947");
		Thread.sleep(2000);
		driver.findElement(By.id("chkboxOne")).click();
		Thread.sleep(2000);
		
	}

}
