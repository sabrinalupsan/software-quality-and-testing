package ro.ase.csie.cts.laboratory;

public class TestProduct {

	public static void main(String[] args) {
		Product product = new Product();
		
		product.getFinalPrice(ProductType.DISCOUNT, 0, 0);
	}

}
