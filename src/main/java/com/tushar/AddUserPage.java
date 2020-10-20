package com.tushar;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class AddUserPage {
		WebDriver driver = null;
 String usernameLable=null;
 String moblable=null;
 String emailLable=null;
 String courseLable= null;

		public AddUserPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			 this.driver=driver;
		}

		public WebElement getUserBtn() {
			return driver .findElement(By.xpath("//span[text()='Users']"));
		}

	public void clickUsers() {
		// TODO Auto-generated method stub
		getUserBtn().click();
	}
	
	public WebElement getAddUserBtn() {
		return driver .findElement(By.xpath("//button[text()='Add User']"));
	}
public void clickAddUsers() {
	// TODO Auto-generated method stub
	getAddUserBtn().click();
  }

public String getLableText() {
	usernameLable	= driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[1]/label")).getText();
	return usernameLable;
}
/*public String getLableText() {
	return driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[1]/label")).getText();
}
public void checkUserLabl() {
	// TODO Auto-generated method stub
	getLableText().click();
  }*/
public String getLableText2() {
	moblable= driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[2]/label")).getText();
	return moblable;
}
public String getLableText3() {
	emailLable= driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[3]/label")).getText();
	return emailLable;
	}
public String getLableText4() {
	courseLable= driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[4]/label")).getText();
	return courseLable;
}
}
