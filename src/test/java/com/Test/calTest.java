package com.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CalculatorPage;

public class calTest {

	CalculatorPage calPage;

	@BeforeTest
	public void setup() {
		calPage = new CalculatorPage();

	}

	@Test(priority = 1)
	public void sumTest() {

		String result = calPage.doSum("10", "20");
		Assert.assertEquals(result, "30");
	}

	@Test(priority = 2)
	public void subTest() {

		String result = calPage.doSub("100", "80");
		Assert.assertEquals(result, "20");
	}

	@Test(priority = 3)
	public void divTest() {

		String result = calPage.doDiv("20", "2");
		Assert.assertEquals(result, "10");
	}
}
