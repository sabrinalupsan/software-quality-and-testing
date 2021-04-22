package ro.ase.csie.cts.laboratory.composite;

public class TestComposite {
	
	public static void main(String[] args) {
	
		AbstractNode group1 = new Group("Red team");
		group1.addNode(new NPC("Soldier 1", 100));
		group1.addNode(new NPC("Soldier 2", 110));
		group1.addNode(new NPC("Soldier 3", 200));
		
		AbstractNode group2 = new Group("Blue team");
		group2.addNode(new NPC("Solder 4", 150));
		group2.addNode(new NPC("Tank", 400));

		AbstractNode levelGroup = new Group("Level 2");
		levelGroup.addNode(new NPC("Level Boss", 5));
		levelGroup.addNode(group1);
		levelGroup.addNode(group2);
		
		levelGroup.attack("Superman");
		levelGroup.retreat();
		levelGroup.getNode(0).move();

	}

}
