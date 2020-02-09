package com.Demo1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class second {
	@Test
	public void secondfirst()
	{
		System.out.println("second class");
	}
	@BeforeTest
	public void ss()
	{
		System.out.println("I will execute first demo second class");
	}
	

}
