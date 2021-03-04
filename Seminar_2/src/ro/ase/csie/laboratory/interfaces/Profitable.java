package ro.ase.csie.laboratory.interfaces;

public interface Profitable {
	
	public static final double MAX_PERCENT_RATE = 4;
	public abstract void addInterest(double interestPercentRate);
	
}
