package com.tusharTest;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;

import com.tushar.AddUserPage;
import com.tushar.LoginPages;


	public class LoginTest {
	WebDriver driver;
	LoginPages lp;
	AddUserPage hp;
		@Test(priority=1)
		public void test01() {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("file:///G:/Tushar/Software/Offline%20Website%20FULL/Offline%20Website/Offline%20Website/index.html");

			 lp = new LoginPages(driver);
			hp=lp.validLogin();
		 
			Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		}


	@Test(priority=2)
	public void homeTest(){
		hp.clickUsers();
	Assert.assertEquals(driver.getTitle(), "JavaByKiran | User");

	}
	@Test(priority=3)
	public void adduserTest(){
		hp.clickAddUsers();
	Assert.assertEquals(driver.getTitle(), "JavaByKiran | Add User");

	}
	@Test(priority = 4)
	public void verifyUsernameLable() {
		String userLable = hp.getLableText();
		System.out.println(userLable);
	Assert.assertEquals(userLable, "Username");
	}
	@Test(priority = 5)
	public void verifyMobile() {
		String mobileLable = hp.getLableText2();
		System.out.println(mobileLable);
	Assert.assertEquals(mobileLable, "Mobile");
	}
	@Test(priority = 6)
	public void verifyEmail() {
		String emailLable = hp.getLableText3();
		System.out.println(emailLable);
	Assert.assertEquals(emailLable, "Email");
	}
	@Test(priority = 7)
	public void verifyCourse() {
		String courseLable = hp.getLableText4();
		System.out.println(courseLable);
	Assert.assertEquals(courseLable, "Courses");
	}
	}


