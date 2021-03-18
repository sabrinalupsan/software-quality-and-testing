package ro.ase.csie.cts.laboratory.stage3;

import java.util.ArrayList;

import ro.ase.csie.cts.laboratory.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.laboratory.exceptions.InvalidPriceException;
import ro.ase.csie.cts.laboratory.services.MarketingStrategySpring2021;
import ro.ase.csie.cts.laboratory.services.ValidatorService;

public class TestProduct {
	
	public static ArrayList<Object> services = new ArrayList<>();
	
	public static void startup()
	{
		services.add(new MarketingStrategySpring2021());
		services.add(new ValidatorService());
	}

	public static void main(String[] args) {
		startup();
		Product product = new Product(new MarketingStrategySpring2021(), new ValidatorService());
		
		try {
			float finalPrice = product.getFinalPrice(ProductType.DISCOUNT, 100, 12);
			System.out.println("The final price is: "+finalPrice);
		} catch (InvalidPriceException e1) {
			e1.printStackTrace();
		}
		catch(InvalidAccountAgeException e)
		{
			e.printStackTrace();
		}
	}

}
