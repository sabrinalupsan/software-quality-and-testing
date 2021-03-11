package ro.ase.csie.cts.laboratory;

import ro.ase.csie.cts.laboratory.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.laboratory.exceptions.InvalidPriceException;

public class TestProduct {

	public static void main(String[] args) {
		Product product = new Product();
		
		try {
			product.getFinalPrice(ProductType.DISCOUNT, 0, 0);
		} catch (InvalidPriceException | InvalidAccountAgeException e) {
			e.printStackTrace();
		}
	}

}
