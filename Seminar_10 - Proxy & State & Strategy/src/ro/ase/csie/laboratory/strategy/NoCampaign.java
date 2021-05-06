package ro.ase.csie.laboratory.strategy;

public class NoCampaign implements BonusStrategyInterface{

	@Override
	public void getBonusPoints(int points, Player player) {
		
		player.experiencePoints += points;
	}

}
