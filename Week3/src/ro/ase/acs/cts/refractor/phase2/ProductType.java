package ro.ase.acs.cts.refractor.phase2;

public enum ProductType {
 NEW(0), DISCOUNTED(0.1f), LIMITED_STOCK(0.25f), LEGACY(0.35f);
 
private float discount;

private ProductType(float discountValue) {
	this.discount = discountValue;
}

public float getDiscount() {
	return discount;
}
 
}
