package ro.ase.csie.laboratory.state;

public class CriticalWoundedState implements MoveStateInterface {

	@Override
	public void moveAtDifferentLocation() {
		System.out.println("The hero cannot move");
	}

}
