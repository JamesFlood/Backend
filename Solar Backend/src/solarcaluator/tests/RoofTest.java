package solarcaluator.tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import solarcaluator.backend.Roof;

public class RoofTest {

Roof RoofNorth;
Roof RoofWest;
	
	@Before
	public void setUp(){
		
		RoofNorth = new Roof(10, 5, 30, "n", 1, 1);
		RoofWest = new Roof(15, 5, 30, "w", 0, 0);
		
	}
	
	
}
