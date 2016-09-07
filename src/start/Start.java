package start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import engine.EngineType;
import vehicle.Vehicle;

public class Start {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Vehicle ferrari = (Vehicle) context.getBean("ferrari458");

		ferrari.accelerate();
		ferrari.printTopSpeed();
		ferrari.stop();
	}

}
