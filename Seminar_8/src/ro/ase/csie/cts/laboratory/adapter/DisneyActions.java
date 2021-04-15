package ro.ase.csie.cts.laboratory.adapter;

public interface DisneyActions {
	
	public abstract String getName();
	public abstract int getPowerLevel();
	
	public abstract void losePower(int power);
	public abstract void recoverPower(int power);
	public abstract void changeLocation(int x, int y);

}
