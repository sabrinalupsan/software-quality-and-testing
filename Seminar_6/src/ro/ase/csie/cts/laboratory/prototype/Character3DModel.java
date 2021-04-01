package ro.ase.csie.cts.laboratory.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Character3DModel implements Cloneable{
	
	CharacterType type;
	String colour;
	
	ArrayList<Integer> graphicPoints = new ArrayList<Integer>();

	public Character3DModel(CharacterType type, String colour) {
		this.type = type;
		this.colour = colour;
		System.out.println("Generating the 3DModel points...");
		try {
			Thread.sleep(2000);
			Random random = new Random();
			for(int i=0; i<20; i++)
				graphicPoints.add(random.nextInt(1000));
			System.out.println("Model loaded");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public Character3DModel() {
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		Character3DModel copy = new Character3DModel();// = new Character3DModel(this.type); DON'T
		copy.type = this.type;
		copy.colour = this.colour;
		copy.graphicPoints = (ArrayList<Integer>) this.graphicPoints.clone();
		return copy;
		
	} 
	
	

}
