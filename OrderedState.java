public class OrderedState implements State {
	private Package pkg;

	public OrderedState(Package pkg) {
		this.pkg = pkg;
	}

	@Override
	public void displayStatus() {
System.out.println(pkg.getName() + " is out for delivery");
	}

	@Override
	public void displayETA() {
		System.out.println(pkg.getName() +" should arrive in 5-7 business days");
	}

	
}
