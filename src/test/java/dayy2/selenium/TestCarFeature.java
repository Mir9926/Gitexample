package dayy2.selenium;

import org.junit.Test;

public class TestCarFeature {

	@Test

	public void verifyCar() {

		Car c = new Car();

		c.startEngine();

		c.brake();

		System.out.println("-------------------");

		// create an object of tata car

		TataCar tc = new TataCar();

		tc.brake();
		
		tc.airbagFeature();

	}

}
