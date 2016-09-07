package brake;

public class NormalBrake implements Brake {

	private static final String NORMAL_BRAKE = "stopping";

	@Override
	public void stop() {
		System.out.println(NORMAL_BRAKE);

	}

}
