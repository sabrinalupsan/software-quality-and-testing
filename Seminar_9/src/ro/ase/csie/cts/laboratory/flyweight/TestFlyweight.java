package ro.ase.csie.cts.laboratory.flyweight;

public class TestFlyweight {
	
	public static void main(String[] args) {
		
		ScreenData soldier = new ScreenData(100,  200,  0,  "red");
		ScreenData soldier2 = new ScreenData(2,  45,  0,  "blue");
		ScreenData building = new ScreenData(42,  48,  5,  "green");
		ScreenData building2= new ScreenData(142,  148,  35,  "red");

		Model3DInterface soldierModel = FlyweightFactory.getModel(ModelType.SOLDIER);
		soldierModel.display(soldier);
		soldierModel.display(soldier2);

		FlyweightFactory.getModel(ModelType.SOLDIER).display(building);;
		FlyweightFactory.getModel(ModelType.BUILDING).display(building2);

	}
}
