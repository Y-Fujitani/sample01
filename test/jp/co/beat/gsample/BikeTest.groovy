package jp.co.beat.gsample;

import static org.junit.Assert.*;

class BikeTest {
	
	void testBike() {
		
		def b = new Bike(manufactuturer:"Shimano", model:"Roadmaster")
		
		assert b.getManufacture() == "Shimano"
		assert b.getModel() == "Roadmaster"
			
		assert b.model == "Roadmaster"
		assert b.manufacture == "Shimano"
			
	}
}
