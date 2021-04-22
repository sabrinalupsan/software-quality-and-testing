package ro.ase.csie.cts.laboratory.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
	
	static HashMap<String, Model3DInterface> models = new HashMap<String, Model3DInterface>();
	
	static {
		models.put(ModelType.BUILDING.toString(), new Model3DFlyweight("SkyTower"));
		models.put(ModelType.SOLDIER.toString(), new Model3DFlyweight("Stormtrooper"));
	}
	
	public static Model3DInterface getModel(ModelType type) {
		return models.get(type.toString());
	}

}
