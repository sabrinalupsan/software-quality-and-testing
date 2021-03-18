package ro.ase.csie.cts.laboratory.stage1;

import ro.ase.csie.cts.laboratory.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.laboratory.exceptions.InvalidPriceException;

public class Product {

	public static final int MAX_ACCOUNT_AGE = 10;
	public static final float MAX_FIDELITY_DISCOUNT = 0.15f;

	public float getFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears) throws InvalidPriceException, InvalidAccountAgeException {
		
		if(initialPrice <= 0)
			throw new InvalidPriceException();
		if(accountAgeInYears < 0)
			throw new InvalidAccountAgeException();
		
		float finalPrice = 0;
		float fidelityDiscount = (accountAgeInYears > MAX_ACCOUNT_AGE) ? MAX_FIDELITY_DISCOUNT
				: (float) accountAgeInYears / 100;
		
		float discountValue = 0;
		
		switch(productType)
		{
		case NEW:
			finalPrice = initialPrice;
			break;
		case DISCOUNT:
			discountValue = ProductType.DISCOUNT.getDiscount();
			finalPrice = (initialPrice - (discountValue * initialPrice))
					- fidelityDiscount * (initialPrice - (discountValue * initialPrice));
			break;
		case LIMITED_STOCK:
			discountValue = ProductType.LIMITED_STOCK.getDiscount();
			finalPrice = (initialPrice - (discountValue * initialPrice))
					- fidelityDiscount * (initialPrice - (discountValue * initialPrice));
			break;
		case LEGACY:
			discountValue = ProductType.LEGACY.getDiscount();
			finalPrice = (initialPrice - (discountValue * initialPrice))
					- fidelityDiscount * (initialPrice - (discountValue * initialPrice));
			break;
		default:
			throw new UnsupportedOperationException("New enum symbol not processed!");
			
		}
		
		if (productType == ProductType.NEW) {
			finalPrice = initialPrice;
		} else if (productType == ProductType.DISCOUNT) {
			discountValue = ProductType.DISCOUNT.getDiscount();
			finalPrice = (initialPrice - (discountValue * initialPrice))
					- fidelityDiscount * (initialPrice - (discountValue * initialPrice));
		} else if (productType == ProductType.LIMITED_STOCK) {
			discountValue = ProductType.LIMITED_STOCK.getDiscount();
			finalPrice = (initialPrice - (discountValue * initialPrice))
					- fidelityDiscount * (initialPrice - (discountValue * initialPrice));
		} else if (productType == ProductType.LEGACY) {
			discountValue = ProductType.LEGACY.getDiscount();
			finalPrice = (initialPrice - (discountValue * initialPrice))
					- fidelityDiscount * (initialPrice - (discountValue * initialPrice));
		}
		return finalPrice;
	}
}
