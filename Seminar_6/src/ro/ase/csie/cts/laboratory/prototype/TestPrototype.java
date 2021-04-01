package ro.ase.csie.cts.laboratory.prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Character3DModel Spiderman = new Character3DModel(CharacterType.Marvel, "red");
		/* Character3DModel Spiderman2 = new Character3DModel(CharacterType.Marvel, "red");
		 * Character3DModel Spiderman3 = new Character3DModel(CharacterType.Marvel, "red");
		 * Character3DModel Spiderman4 = new Character3DModel(CharacterType.Marvel, "red");
		 */
		Character3DModel Spiderman2 = (Character3DModel) Spiderman.clone();
		Character3DModel Spiderman3 = (Character3DModel) Spiderman.clone();
		Character3DModel Spiderman4 = (Character3DModel) Spiderman.clone();
	}

}
