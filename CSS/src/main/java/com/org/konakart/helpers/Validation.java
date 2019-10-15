package com.org.konakart.helpers;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.org.konakart.reports.LogReports;
import com.org.konakart.testbase.InvokeBrowser;
import com.org.konakrt.utils.ReadPropertiesFile;
import com.org.konakrt.utils.ValidateTestResult;

public class Validation extends InvokeBrowser {
	public static WebDriver driver;
	Properties config = new Properties();
	protected ReadPropertiesFile read = new ReadPropertiesFile();
	protected String Xpath;
	protected ValidateTestResult validate = new ValidateTestResult();
	public LogReports log = new LogReports();

	public void ValidateAtmecsFooters() {
		Xpath = read.readPropertiesFile("loc.footer.xpath");
		String footer = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(footer, "footervalue", "No match");

		/*
		 * Xpath = read.readPropertiesFile("loc.homepage.sitemap.xpath"); String sitemap
		 * = driver.findElement(By.xpath(Xpath)).getText();
		 * ValidateTestResult.validateData(sitemap, "Sitemap", "Sitemap matches");
		 * System.out.println("Sitemap matched"); // Validation for footer-Services
		 * Xpath = read.readPropertiesFile("loc.homepage.services.xpath"); String
		 * services = driver.findElement(By.xpath(Xpath)).getText();
		 * ValidateTestResult.validateData(services, "Services", " Not Matches");
		 * System.out.println("Services matched"); // validation for footer-Careers
		 * Xpath = read.readPropertiesFile("loc.homepage.careers.xpath"); String careers
		 * = driver.findElement(By.xpath(Xpath)).getText();
		 * ValidateTestResult.validateData(careers, "Careers", "Careers matches");
		 * System.out.println("Careers matched"); // validation for footer-contactus
		 * Xpath = read.readPropertiesFile("loc.homepage.contactus.xpath"); String
		 * contactus = driver.findElement(By.xpath(Xpath)).getText();
		 * ValidateTestResult.validateData(contactus, "Contact Us",
		 * "Contactus matches"); System.out.println("Contact us matched");
		 * log.info("Footer validation for Contact us is done");
		 */
	}
}
