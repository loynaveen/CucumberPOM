package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase {

	public HomePage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[contains(@href, 'contacts')]//parent::div//button")
	WebElement addContact;

	@FindBy(xpath = "//span[@class='user-display']")
	WebElement userNameLabel;

	@FindBy(xpath = "//a[contains(@href, 'contacts')]//span[contains(text(), 'Contacts')]")
	WebElement contactsLabel;

	@FindBy(xpath = "//a[contains(@href, 'deals')]//span[contains(text(), 'Deals')]")
	WebElement dealsLabel;

	@FindBy(xpath = "//a[contains(@href, 'tasks')]//span[contains(text(), 'Tasks')]")
	WebElement tasksLabel;

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public Boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}

	public void clickOnNewContactLink() {
		addContact.click();
	}

}
