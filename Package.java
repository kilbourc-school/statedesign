public class Package {
	private State InTransitState;
	private State OrderedState;
	private State DeliveredState;
	private State state;
	private String name;

	
	public Package(String name) {
		InTransitState = new InTransitState(this);
		OrderedState = new OrderedState(this);
		DeliveredState = new DeliveredState(this);
		this.name = name;
	}
	
	public void order() {
		setState(OrderedState);
		state.displayStatus();
		state.displayETA();
	}

	public void mail() {
		setState(InTransitState);
		state.displayStatus();
		state.displayETA();
	}
	public void received() {
		setState(DeliveredState);
		state.displayStatus();
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}
}
