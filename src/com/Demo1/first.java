package com.Demo1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class first {
	
	@Test
	public void start()
	{
		System.out.println("My First TestNG Program");
	}
	@Test (groups= {"Smoke"})
	public void end()
	{
		System.out.println("second from the same class");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class first");
	}
	@BeforeMethod
	public void bmethod()
	{
		System.out.println("Before method of class first");
		System.out.println("llllllloooooovvvveeeee");
		System.out.println("lalalal");
	}

}
