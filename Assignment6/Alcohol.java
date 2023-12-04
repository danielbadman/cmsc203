
public class Alcohol extends Beverage{
	private boolean isWeekend;
	private final double weekendCost = 0.6;
	
	public Alcohol(String bevName, Size size, boolean isWeekend) {
		super(bevName, size, Type.ALCOHOL);
		this.isWeekend = isWeekend;
	}
	
	public boolean isWeekend() {
		return isWeekend;
	}
	
	public double calcPrice() {
		double finalPrice = addSizePrice();
		if (isWeekend) {
			finalPrice += weekendCost;
		}
		return finalPrice;
	}
	
	public String toString() {
		String output = "Beverage Name: " + bevName + "\nSize: " + bevSize;
		if (isWeekend) {
			output += "\nIs weekend";
		} else {
			output += "\nNot weekend";
		}
		return output;
	}
	
	public boolean equals(Alcohol otherAlcohol) {
		if (bevName.equals(otherAlcohol.bevName) && bevType == otherAlcohol.bevType && isWeekend == otherAlcohol.isWeekend) {
			return true;
		} else {
			return false;
		}
	}
}
