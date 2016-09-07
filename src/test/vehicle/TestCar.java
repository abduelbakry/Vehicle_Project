package test.vehicle;

import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vehicle.Car;
import vehicle.Vehicle;

public class TestCar {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Vehicle ferrari = (Vehicle) context.getBean("ferrari458");
		Car ferrariCar = (Car) ferrari;

		// test printTopSpeed null
		ferrariCar.setTopSpeed(null);
		assertNull(ferrariCar.printTopSpeed());

		// test printTopSpeed Empty
		ferrariCar.setTopSpeed("");
		assertNull(ferrariCar.printTopSpeed());

		// test printTopSpeed Integer Value
		// test printTopSpeed Empty
		ferrariCar.setTopSpeed("a22");
		assertNull(ferrariCar.printTopSpeed());
		
		

	}

}
