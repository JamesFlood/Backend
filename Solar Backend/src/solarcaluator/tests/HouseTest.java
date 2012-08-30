package solarcaluator.tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


import solarcaluator.backend.House;

public class HouseTest {

	House House1;
	
	@Before
	public void setUp(){
		
		House1 = new House();
		House1.setLocation("Brisbane", "Australia");
		
	}
	
	@Test
	public void getCity(){
		assertTrue(House1.getCity()=="Brisbane");
	}
	
	@Test
	public void getCountry(){
		assertTrue(House1.getCountry()=="Australia");
	}
	
	
	
}

