package brake;

public class FastBrake implements Brake {

	private static final String STOPPING_FAST = "stopping-fast";

	@Override
	public void stop() {
		System.out.println(STOPPING_FAST);

	}

}
