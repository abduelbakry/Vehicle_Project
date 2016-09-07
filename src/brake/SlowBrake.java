package brake;

public class SlowBrake implements Brake {

	private static final String STOP_SLOWLY = "stopping – slowly";

	@Override
	public void stop() {
		System.out.println(STOP_SLOWLY);

	}

}
