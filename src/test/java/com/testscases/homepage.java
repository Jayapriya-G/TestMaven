package com.testscases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.test.base;

public class homepage extends base{
	
@Test
public void pagenavigation() throws IOException
{
	 
	initialisebrowser();
	driver.get("https://qaclickacademy.com");
}
}