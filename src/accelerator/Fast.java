package accelerator;

public class Fast implements Accelerator {

	private static final String FAST = "fast";

	@Override
	public void accelerate() {
		System.out.println(FAST);

	}

}
