package com.org.konakart.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.org.konakart.testbase.InvokeBrowser;
import com.org.konakrt.utils.PageActions;
import com.org.konakrt.utils.ValidateTestResult;

public class HeroImagePage extends InvokeBrowser {

	// click on the hero image (used as Westclox 32042r Retro 1950 Kitchen Wall
	// Clock 9.5-inch Red)
	@Test(priority = 1)
	public void clickOnHeroImage() {
		css = read.readPropertiesFile("loc.heroimage.css");
		PageActions.clickOnElement(driver, css);
	}

	@Test(priority = 2)
	public void validatetabsOfHeroImage() {
		if ("loc.title.css" != null) {
			css = read.readPropertiesFile("loc.kindleproduct.css");
			String kindleproduct = driver.findElement(By.cssSelector(css)).getText();
			ValidateTestResult.validateData(kindleproduct, "coffeeproduct", "No match");

			css = read.readPropertiesFile("loc.kindlespec.css");
			PageActions.clickOnElement(driver, css);
			String kindlespec = driver.findElement(By.cssSelector(css)).getText();
			ValidateTestResult.validateData(kindlespec, "coffeespec", "No match");

			css = read.readPropertiesFile("loc.kindleereview.css");
			PageActions.clickOnElement(driver, css);
			String kindleReview = driver.findElement(By.cssSelector(css)).getText();
			ValidateTestResult.validateData(kindleReview, "coffeeReview", "No match");
		} else {
			css = read.readPropertiesFile("loc.coffeeproduct.css");
			PageActions.clickOnElement(driver, css);
			String coffeeproduct = driver.findElement(By.cssSelector(css)).getText();
			ValidateTestResult.validateData(coffeeproduct, "coffeeproduct", "No match");

			css = read.readPropertiesFile("loc.coffeespec.css");
			PageActions.clickOnElement(driver, css);
			String coffeespec = driver.findElement(By.cssSelector(css)).getText();
			ValidateTestResult.validateData(coffeespec, "coffeespec", "No match");

			css = read.readPropertiesFile("loc.coffeereview.css");
			PageActions.clickOnElement(driver, css);
			String coffeeReview = driver.findElement(By.cssSelector(css)).getText();
			ValidateTestResult.validateData(coffeeReview, "coffeeReview", "No match");
		}
	}
	@Test(priority=3)
		public void sortByActions() {
			css=read.readPropertiesFile("loc.sortbyactions.css");
			PageActions.clickOnElement(driver, css);
		}
	}

	
