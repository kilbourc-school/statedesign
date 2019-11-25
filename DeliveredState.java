public class DeliveredState implements State {
	private Package pkg;
	
	public DeliveredState(Package pkg) {
		this.pkg = pkg;
	}

	@Override
	public void displayStatus() {
		System.out.println(pkg.getName() +" is here for you");
	}

	@Override
	public void displayETA() {
		System.out.println(pkg.getName() +" is here");
	}
}
