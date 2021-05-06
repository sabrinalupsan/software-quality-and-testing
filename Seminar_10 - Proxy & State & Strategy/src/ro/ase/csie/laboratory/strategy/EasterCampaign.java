package ro.ase.csie.laboratory.strategy;

public class EasterCampaign implements BonusStrategyInterface{

	@Override
	public void getBonusPoints(int points, Player player) {

		if(player.playTime > 5)
			player.experiencePoints += 2*points;
	}
	
	

}
