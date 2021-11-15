package com.TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation {

	@BeforeSuite
	private void setproperty() {
		System.out.println("SetProperty");
	}

	@BeforeTest
	private void browser() {
		System.out.println("Chrome");
	}

	@BeforeClass
	private void url() {
		System.out.println("URL Launch");
	}

	@BeforeMethod
	private void login() {
		System.out.println("Login");
	}

	@Test
	private void amazon() {
		System.out.println("Amazon");
	}

	@Test
	private void eBay() {
		System.out.println("ebay");
	}

	@Test
	private void filpkart() {
		System.out.println("Filpkart");
	}

	@AfterMethod
	private void logout() {
		System.out.println("Logout");
	}
	
	@AfterClass
	private void homepage() {
		System.out.println("HomePage");
	}
	
	@AfterTest
	private void closebrowser() {
		System.out.println("Quit Chrome");
	}
	
	@AfterSuite
	private void deleteallcookies() {
	System.out.println("Delete All Cookies");
	}
	
}