package com.Demo2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@AfterTest
	public void post()
	{
		System.out.println("Final execution" );
	}
	
	@Test
	public void home()
	{
		System.out.println("entering to Home");
	}
	@Test
	public void office()
	{
		System.out.println("Entering into office");
	}
	@BeforeTest
	public void prereq()
	{
		System.out.println("i will execute first in Demo2 Day1");
	}

}
