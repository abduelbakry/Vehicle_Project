package accelerator;

public class SlowAccelerator implements Accelerator{

	private static final String SLOW = "slow";

	@Override
	public void accelerate() {
		System.out.println(SLOW);
		
	}

}
