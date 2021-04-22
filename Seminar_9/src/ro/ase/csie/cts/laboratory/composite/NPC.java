package ro.ase.csie.cts.laboratory.composite;

public class NPC extends AbstractNode {
	
	String name; 
	int powerLevel;

	public NPC(String name, int powerLevel) {
		super();
		this.name = name;
		this.powerLevel = powerLevel;
	}

	@Override
	public void attack(String playerName) {
		System.out.println(String.format("%s is attacking %s", this.name, playerName));
	}

	@Override
	public void retreat() {
		System.out.println(String.format("%s is retreating", this.name));
	}

	@Override
	public void move() {
		System.out.println(String.format("%s is moving", this.name));

	}

	@Override
	public void addNode(AbstractNode node) {
		throw new UnsupportedOperationException();
	}

	@Override
	public AbstractNode getNode(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void deleteNode(AbstractNode node) {
		throw new UnsupportedOperationException();
	}

}
