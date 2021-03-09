
package ro.ase.cts.refractor.phase3;

import ro.ase.acs.cts.exceptions.InvalidValueException;

public class SalesStrategy {
	public static final int FIDELITY_YEARS_THRESHOLD = 10;
	public static final float MAX_FIDELITY_DISCOUNT = (float)0.15;
	
	public static float getFidelityDiscount(int yearsSinceRegistration) {
		return (yearsSinceRegistration >  FIDELITY_YEARS_THRESHOLD) ? MAX_FIDELITY_DISCOUNT : (float)yearsSinceRegistration/100; 
	}
	//public static float getPriceWithDiscount(float)
	
	public float computeFinalPrice(ProductType productType, float initialPrice, int yearsSinceRegistration) throws InvalidValueException
	  {
		if(initialPrice <= 0 || yearsSinceRegistration < 0) {
			throw new InvalidValueException();
		}
	    float finalPrice = 0;
	    float fidelityDiscount = getFidelityDiscount(yearsSinceRegistration); 
	    
	    switch (productType) {
		case NEW:
			finalPrice = initialPrice;
			break;
		case DISCOUNTED:
			finalPrice = (initialPrice - (ProductType.DISCOUNTED.getDiscount()) * initialPrice) - fidelityDiscount * (initialPrice - ProductType.DISCOUNTED.getDiscount() * initialPrice);
			break;
		case LIMITED_STOCK:
			finalPrice = (initialPrice - (ProductType.LIMITED_STOCK.getDiscount()) - fidelityDiscount * (initialPrice - ProductType.DISCOUNTED.getDiscount()) * initialPrice);
			break;
		case LEGACY:
			finalPrice = (initialPrice - (ProductType.LEGACY.getDiscount()) - fidelityDiscount * (initialPrice - ProductType.DISCOUNTED.getDiscount())* initialPrice);
			break;
			default:
				throw new UnsupportedOperationException("Type not managed");
		}
	    return finalPrice;
	  }
}
	    
	    