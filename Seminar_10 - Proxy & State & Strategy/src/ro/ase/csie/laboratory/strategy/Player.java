package ro.ase.csie.laboratory.strategy;

public class Player {
	
	String userName;
	public int playTime;
	int experiencePoints;
	
	BonusStrategyInterface bonusCampaign = null;

	public void setBonusCampaign(BonusStrategyInterface bonusCampaign) {
		this.bonusCampaign = bonusCampaign;
	}

	public Player(String userName, int playTime, int experiencePoints) {
		super();
		this.userName = userName;
		this.playTime = playTime;
		this.experiencePoints = experiencePoints;
	}
	
	public void getXP(int pointsReceived ) {
		if(this.bonusCampaign == null)
			this.experiencePoints += pointsReceived;
		else
			this.bonusCampaign.getBonusPoints(pointsReceived, this);
	}

}
