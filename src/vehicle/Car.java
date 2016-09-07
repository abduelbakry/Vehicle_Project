package vehicle;

import accelerator.Accelerator;
import brake.Brake;
import engine.EngineType;

public class Car implements Vehicle {

	private String topSpeed;

	private EngineType engine;

	private Accelerator accelerator;

	private Brake brake;

	@Override
	public Integer printTopSpeed() {
		Integer topSpeedInt = null;
		try {
			if (null != topSpeed && topSpeed.length() > 0) {
				topSpeedInt = Integer.parseInt(topSpeed);
				System.out.println("Top Speed " + topSpeedInt + " mph ");
			} else {
				System.err.println("No top speed defined , Car is still being manufactured !!");
			}
		} catch (NumberFormatException nfe) {
			System.err.println("Invalid top speed , Car is still being manufactured !!");
			return null ;
		}
		return topSpeedInt;

	}

	/**
	 * @return the topSpeed
	 */
	public String getTopSpeed() {
		return topSpeed;
	}

	/**
	 * @param topSpeed
	 *            the topSpeed to set
	 */
	public void setTopSpeed(String topSpeed) {
		this.topSpeed = topSpeed;
	}

	/**
	 * @return the engine
	 */
	public EngineType getEngine() {
		return engine;
	}

	/**
	 * @param engine
	 *            the engine to set
	 */
	public void setEngine(EngineType engine) {
		this.engine = engine;
	}

	/**
	 * @return the accelerator
	 */
	public Accelerator getAccelerator() {
		return accelerator;
	}

	/**
	 * @param accelerator
	 *            the accelerator to set
	 */
	public void setAccelerator(Accelerator accelerator) {
		this.accelerator = accelerator;
	}

	/**
	 * @return the brake
	 */
	public Brake getBrake() {
		return brake;
	}

	/**
	 * @param brake
	 *            the brake to set
	 */
	public void setBrake(Brake brake) {
		this.brake = brake;
	}

	@Override
	public void accelerate() {
		accelerator.accelerate();

	}

	@Override
	public void stop() {
		brake.stop();

	}

}
