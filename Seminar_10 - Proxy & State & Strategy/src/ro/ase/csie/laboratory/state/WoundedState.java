package ro.ase.csie.laboratory.state;

public class WoundedState implements MoveStateInterface{

	@Override
	public void moveAtDifferentLocation() {
		System.out.println("The hero is moving slowly");
	}

}
