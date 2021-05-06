package ro.ase.csie.laboratory.strategy;

public class TestStrategy {

	public static void main(String[] args) {
		Player player = new Player("John", 10, 100);
		player.setBonusCampaign(new NoCampaign());
		player.getXP(150);
		System.out.println(player.experiencePoints);
		
		player.setBonusCampaign(new EasterCampaign());
		player.getXP(150);
		System.out.println(player.experiencePoints);

		player.setBonusCampaign(new SummerCampaign());
		player.getXP(150);
		System.out.println(player.experiencePoints);
	}

}
