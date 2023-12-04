
public class Smoothie extends Beverage {
	private int numOfFruits;
	private boolean addProtein;
	
	public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein) {
		super(bevName, size, Type.SMOOTHIE);
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
	}
	
	public int getNumOfFruits() {
		return numOfFruits;
	}
	
	public boolean getAddProtein() {
		return addProtein;
	}
	
	public double calcPrice() {
		double finalPrice = addSizePrice();
		finalPrice += numOfFruits * 0.50;
		if (addProtein) {
			finalPrice += 1.50;
		}
		return finalPrice;
	}
	
	public String toString() {
		String output = "Beverage Name: " + bevName + "\nSize: " + bevSize;
		output += "\nNumber of Fruits: " + numOfFruits;
		if (addProtein) {
			output += "\nHas protein";
		} else {
			output += "\nNo protein";
		}
		return output;
	}
	
	public boolean equals(Smoothie otherSmoothie) {
		if (bevName.equals(otherSmoothie.bevName) && bevType == otherSmoothie.bevType && bevSize == otherSmoothie.bevSize && numOfFruits == otherSmoothie.numOfFruits && addProtein== otherSmoothie.addProtein) {
			return true;
		} else {
			return false;
		}
	}
}
