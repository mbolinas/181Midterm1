package com.cisc181.core;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;
import com.cisc181.eNums.*;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void TestSalary() throws PersonException{
		Staff s1 = new Staff("first","middle","last",new Date(),"home","(123)-456-7890","email","soon",0,5,new Date(),eTitle.KING);
		Staff s2 = new Staff("jon","you know nothing","snow",new Date(),"castle black","(123)-456-7890","email","soon",40,5,new Date(),eTitle.KING);
		Staff s3 = new Staff("me","middle","last",new Date(),"over yonder","(123)-456-7890","email","soon",0,5,new Date(),eTitle.DR);
		Staff s4 = new Staff("brandon","","ye",new Date(),"gilbert","(123)-456-7890","email","soon",2,5,new Date(),eTitle.DR);
		Staff s5 = new Staff("boosted","","bonobo",new Date(),"no","(123)-456-7890","email","soon",0,5,new Date(),eTitle.MS);
		
		
		double expectedAvg = 5 + 5 + 5 + 5 + 5;
		expectedAvg = expectedAvg / 5;
		int e = ((int) (expectedAvg * 100));
		
		double actualAvg = s1.getSalary() + s2.getSalary() + s3.getSalary() + s4.getSalary() + s5.getSalary();
		actualAvg = actualAvg / 5;
		int a = ((int) (actualAvg * 100));
		
		
		//Convert to int because assertEquals(double, double) is deprecated
		//Have to use assertEquals(int, int)

		assertEquals(e,a);
		
		
		
	}	
	
	
	@Test(expected = PersonException.class)
	public void TestPhone() throws PersonException{
		
		Staff s2 = new Staff("jon","you know nothing","snow",new Date(),"castle black","123-456-7890","email","soon",40,5,new Date(),eTitle.KING);
	}
	
	
	@Test(expected = PersonException.class)
	public void TestDOB() throws PersonException{
		
		Staff s2 = new Staff("jon","you know nothing","snow",new Date(-100,10,10),"castle black","(123)-456-7890","email","soon",40,5,new Date(),eTitle.KING);
	}

}
