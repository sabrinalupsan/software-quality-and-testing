package ro.ase.csie.cts.laboratory.models;

import ro.ase.csie.cts.laboratory.exceptions.DivideBy0Exception;

public class MathOperations {
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static double divide(int a, int b) throws DivideBy0Exception {
		if(b==0)
			throw new DivideBy0Exception();
		return a / b;
	}

}
