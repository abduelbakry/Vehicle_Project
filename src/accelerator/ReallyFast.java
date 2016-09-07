package accelerator;

public class ReallyFast implements Accelerator {

	private static final String REALLY_FAST = "really-fast";

	@Override
	public void accelerate() {
		System.out.println(REALLY_FAST);

	}

}
