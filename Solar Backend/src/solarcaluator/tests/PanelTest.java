package solarcaluator.tests;

import org.junit.Before;
import solarcaluator.backend.Panel;


public class PanelTest {

	Panel Panel1;
	Panel Panel2;
		
		@Before
		public void setUp(){
			
			Panel1 = new Panel(75);
			Panel2 = new Panel(75);
			
		}
	
}
