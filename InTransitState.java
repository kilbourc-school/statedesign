public class InTransitState implements State {
	private Package pkg;

	public InTransitState(Package pkg) {
		this.pkg = pkg;
	}

	@Override
	public void displayStatus() {
		System.out.println(pkg.getName() +" is out for delivery");
	}

	@Override
	public void displayETA() {
		System.out.println(pkg.getName() +" should arrive within 5 days");
	}

	
}
