package ro.ase.csie.cts.laboratory.stage3;

import ro.ase.csie.cts.laboratory.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.laboratory.exceptions.InvalidPriceException;
import ro.ase.csie.cts.laboratory.services.MarketingInterface;
import ro.ase.csie.cts.laboratory.services.MarketingStrategySpring2021;
import ro.ase.csie.cts.laboratory.services.ValidatorInterface;
import ro.ase.csie.cts.laboratory.services.ValidatorService;

public class Product {
	
	//NOT LIKE THIS!
	//MarketingInterface marketingService = new MarketingStrategySpring2021();
	//ValidatorInterface validatorService = new ValidatorService();
	
	MarketingInterface marketingService = null;
	ValidatorInterface validatorService = null;
	
	public Product(MarketingInterface marketingService, ValidatorInterface validatorService)
	{
		if(marketingService == null)
			throw new NullPointerException();
		if(validatorService == null)
			throw new NullPointerException();
		setMarketingStrategy(marketingService);
		this.validatorService = validatorService;
	}
	
	public Product()
	{
		for(Object service : TestProduct.services)
		{
			if(service instanceof MarketingInterface)
				this.marketingService = (MarketingInterface)service;
			if(this.marketingService == null)
				throw new UnsupportedOperationException();
		}
	}
	
	public void setMarketingStrategy(MarketingInterface marketingService)
	{
		this.marketingService = marketingService;
	}
	
	public static float getPriceWithDiscount(float initialPrice, float discountValue)
	{
		return initialPrice - (discountValue * initialPrice);
	}

	public float getFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears) throws InvalidPriceException, InvalidAccountAgeException {
		
		validatorService.validateAccountAge(accountAgeInYears);
		validatorService.validatePrice(initialPrice);
		
		float fidelityDiscount = 
				(productType == ProductType.NEW) ? 0 : marketingService.getFidelityDiscount(accountAgeInYears);
				
		float discountValue = productType.getDiscount();
		float priceWithDiscount = getPriceWithDiscount(initialPrice, discountValue);
		float finalPrice = priceWithDiscount * (1 - fidelityDiscount);	
		
		return finalPrice;
	}
}
