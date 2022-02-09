package org.sele.task;

import org.base.function.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day12JavaScript extends BaseClass {
	
	@BeforeClass
	private void beforeClass() {
		browserLaunch("chrome");
		implicitlyWait(10);

	}
	@Test
	private void flipkart() {
		urlLaunch("https://www.flipkart.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		driver.findElement(by)

	}

}
