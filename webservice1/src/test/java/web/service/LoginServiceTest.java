package web.service;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginServiceTest {
	
	public String chromeDriverPath = "C:\\Users\\bksol\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe";
	public String loginPagePath = "D:\\vs code\\dark\\java_assignment\\week8\\8.1P-resources\\pages\\login.html";
	public String invalid_username = "invalid_username", invalid_password = "invalid_password", invalid_dob = "2002-02-02", valid_username = "krishna", valid_password = "krishna_pass", valid_dob = "21-12-2002";
	private void sleep(long sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Functional testing using decision table
	
	public String testingFunc(String username, String password, String dob) {
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
		
		driver.navigate().to(loginPagePath);
		sleep(1);
	
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys(username);

		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys(password);
		
		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys(dob);
		
		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(2);
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		driver.close();
		
		return title;
	}
	
	@Test
	public void testT1() {
		String result = testingFunc("", "", "");
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT2() {
		String result = testingFunc("", "", invalid_dob);
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT3() {
		String result = testingFunc("", "", valid_dob);
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT4() {
		String result = testingFunc("", invalid_password, "");
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT5() {
		String result = testingFunc("", invalid_password, invalid_dob);
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT6() {
		String result = testingFunc("", invalid_password, valid_dob);
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT7() {
		String result = testingFunc("", valid_password, "");
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT8() {
		String result = testingFunc("", valid_password, invalid_dob);
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT9() {
		String result = testingFunc("", valid_password, valid_dob);
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT10() {
		String result = testingFunc(invalid_username, "", "");
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT11() {
		String result = testingFunc(invalid_username, "", invalid_dob);
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT12() {
		String result = testingFunc(invalid_username, "", valid_dob);
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT13() {
		String result = testingFunc(invalid_username, invalid_password, "");
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT14() {
		String result = testingFunc(invalid_username, invalid_password, invalid_dob);
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT15() {
		String result = testingFunc(invalid_username, invalid_password, valid_dob);
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT16() {
		String result = testingFunc(invalid_username, valid_password, "");
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT17() {
		String result = testingFunc(invalid_username, valid_password, invalid_dob);
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT18() {
		String result = testingFunc(invalid_username, valid_password, valid_dob);
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT19() {
		String result = testingFunc(valid_username, "", "");
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT20() {
		String result = testingFunc(valid_username, "", invalid_dob);
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT21() {
		String result = testingFunc(valid_username, "", valid_dob);
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT22() {
		String result = testingFunc(valid_username, invalid_password, "");
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT23() {
		String result = testingFunc(valid_username, invalid_password, invalid_dob);
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT24() {
		String result = testingFunc(valid_username, invalid_password, valid_dob);
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT25() {
		String result = testingFunc(valid_username, valid_password, "");
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT26() {
		String result = testingFunc(valid_username, valid_password, invalid_dob);
		Assert.assertEquals("fail", result);
	}
	
	@Test
	public void testT27() {
		String result = testingFunc(valid_username, valid_password, valid_dob);
		Assert.assertEquals("success", result);
	}
}
