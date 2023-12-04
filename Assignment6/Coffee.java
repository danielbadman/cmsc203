
public class Coffee extends Beverage{
	private boolean extraShot, extraSyrup;
	private final double shotAndSyrupTax = .5;
	
	public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		super(bevName, size, Type.COFFEE);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}
	
	public boolean getExtraShot() {
		return extraShot;
	}
	
	public boolean getExtraSyrup() {
		return extraSyrup;
	}
	
	public double calcPrice() {
		double finalPrice = super.addSizePrice();
		if (extraShot) {
			finalPrice += shotAndSyrupTax;
		}
		if (extraSyrup) {
			finalPrice += shotAndSyrupTax;
		}
		return finalPrice;
	}
	
	public String toString() {
		String output = "Beverage Name: " + bevName + "\nSize: " + bevSize;
		if (extraShot) {
			output += "\nHas extra shot";
		} else {
			output += "\nNo extra shot";
		}
		if (extraSyrup) {
			output += "\nHas extra syrup";
		} else {
			output += "\nNo extra syrup";
		}
		return output;
	}

	public boolean equals(Coffee otherCoffee) {
		if (bevName.equals(otherCoffee.bevName) && bevType == otherCoffee.bevType && bevSize == otherCoffee.bevSize && extraShot == otherCoffee.extraShot && extraSyrup == otherCoffee.extraSyrup) {
			return true;
		} else {
			return false;
		}
	}
}
