package com.tushar;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class LoginPages {
		WebDriver driver = null;

		public LoginPages(WebDriver driver) {
			this.driver = driver;

		}

		public WebElement getUname() {

			return driver.findElement(By.id("email"));
		}

		public WebElement getPass() {
			return driver.findElement(By.id("password"));

		}

		public WebElement getLoginBtn() {
			return driver.findElement(By.xpath("//button"));
		}
		
		public void typeUname(String uname) {
			getUname().sendKeys(uname);
		}

		public void typePass(String pass) {
			getPass().sendKeys(pass);
		}

		public void clickLoginBtn() {
			getLoginBtn().click();
		}
		
		public AddUserPage validLogin() {
			typeUname("kiran@gmail.com");
			typePass("123456");
			clickLoginBtn();
			return new AddUserPage(driver);
		}
	 
	}

