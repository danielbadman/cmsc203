
public abstract class Beverage {
	protected String bevName;
	protected Size bevSize;
	protected Type bevType;
	protected final double basePrice = 2.0;
	protected final int sizePrice = 1;
	
	public Beverage (String bevName, Size bevSize, Type bevType) {
		this.bevName = bevName;
		this.bevSize = bevSize;
		this.bevType = bevType;
	}
	
	public abstract double calcPrice();
	
	public double addSizePrice() {;
		switch(bevSize) {
			case SMALL: return basePrice;
			case MEDIUM: return basePrice + sizePrice;
			case LARGE: return basePrice + (2 * sizePrice);
			default: return 0;
	}
	}
	
	public String toString() {
		return "Beverage Name: " + bevName 
				+ "\nBeverage Size: " + bevSize
				+ "\nBeverage Type: " + bevType;
	}
	
	public boolean equals(Beverage otherBev) {
		if (bevName.equals(otherBev.bevName) && bevSize == otherBev.bevSize && bevType == otherBev.bevType) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getBevName() {
		return bevName;
	}
	public Size getBevSize() {
		return bevSize;
	}
	public Type getBevType() {
		return bevType;
	}
	public double getBasePrice() {
		return basePrice;
	}
}
