
package ro.ase.acs.cts.refactor.phase1;

public class SalesStrategy {
	public float computeFinalPrice(int productType, float initialPrice, int yearsSinceRegistrations)
	  {
	    float finalRezult = 0;
	    float fidelityDiscount = (yearsSinceRegistrations > 10) ? (float)15/100 : (float)yearsSinceRegistrations/100; 
	    if (productType == 1)
	    {
	      finalRezult = initialPrice;
	    }
	    else if (productType == 2)
	    {
	      finalRezult = (initialPrice - (0.1f * initialPrice)) - fidelityDiscount * (initialPrice - (0.1f * initialPrice));
	    }
	    else if (productType == 3)
	    {
	      finalRezult = (initialPrice - (0.25f * initialPrice)) - fidelityDiscount * (initialPrice - (0.25f * initialPrice));
	    }
	    else if (productType == 4)
	    {
	      finalRezult = (initialPrice - (0.35f * initialPrice)) - fidelityDiscount * (initialPrice - (0.35f * initialPrice));
	    }
	    return finalRezult;
	  }
}