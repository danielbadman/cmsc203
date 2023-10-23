
public class ManagementCompany {
	
	private String name, taxID;
	private double managementFeePercentage;
	public final int MAX_PROPERTY = 5, MGMT_WIDTH = 10, MGMT_DEPTH = 10;
	private Property [] properties = new Property[MAX_PROPERTY];
	private Plot plot;
	private int numberOfProperties = 0;
	
	public ManagementCompany(String name, String taxID, double managementFeePercentage) {
		this.name = name;
		this.taxID = taxID;
		this.managementFeePercentage = managementFeePercentage;
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaxID() {
		return taxID;
	}

	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}

	public double getManagementFeePercentage() {
		return managementFeePercentage;
	}

	public void setManagementFeePercentage(double managementFeePercentage) {
		this.managementFeePercentage = managementFeePercentage;
	}

	public Property[] getProperties() {
		return properties;
	}

	public void setProperties(Property[] properties) {
		this.properties = properties;
	}

	public Plot getPlot() {
		return plot;
	}

	public void setPlot(Plot plot) {
		this.plot = plot;
	}

	public int getNumberOfProperties() {
		return numberOfProperties;
	}

	public void setNumberOfProperties(int numberOfProperties) {
		this.numberOfProperties = numberOfProperties;
	}

	
	public int addProperty(Property addedProperty) {
		int index = 0;
		boolean nullFound = false;
		while (!nullFound  && index < MAX_PROPERTY) {
			if (properties[index] == null) {
				nullFound = true;
				break;
			}
			index++;
		}
		if (!nullFound) {
			return -1;
		}
		if (addedProperty == null) {
			return -2;
		}
		if (!this.plot.encompasses(addedProperty.getPlot())) {
			return -3;
		}
		for (int k = 0; k < index; k++) {
			if (this.properties[k] != null) {
				if (this.properties[k].getPlot().overlaps(addedProperty.getPlot())) {
					return -4;
				}
			}
		}
		this.properties[index] = addedProperty;
		this.numberOfProperties++;
		return index;
	}
	
	public double getTotalRent() {
		double total = 0;
		for (int k = 0; k < MAX_PROPERTY; k++) {
			if (this.properties[k] != null) {
				total += this.properties[k].getRentAmount();
			}
		}
		return total;
	}
	
	public Property getHighestRentPropperty() {
		Property highest = new Property("", "", 0.0, "");
		for (int k = 0; k < MAX_PROPERTY; k++) {
			if (this.properties[k] != null) {
				if (this.properties[k].getRentAmount() > highest.getRentAmount()) {
					highest = this.properties[k];
				}
			}
		}
		return highest;
	}
	
	public void removeLastProperty() {
		int k = 0;
		while (k < MAX_PROPERTY) {
			if (this.properties[k] == null) {
				break;
			}
			k++;
		}
		if (k > 0) {
			this.properties[k - 1] = null;
			this.numberOfProperties--;
		}
	}
	
	public boolean isPropertiesFull () {
		for (int k = 0; k < MAX_PROPERTY; k++) {
			if (this.properties[k] == null) {
				return false;
			}
		}
		return true;
	}
	
	public int getPropertiesCount() {
		int counter = 0;
		while (counter < MAX_PROPERTY) {
			if (this.properties[counter] == null) {
				this.numberOfProperties = counter;
				return counter;
			}
			counter++;
		}
		//If none of them are null, that means there are 5 properties.
		this.numberOfProperties = counter;
		return counter;
	}
	
	public boolean isManagementFeeValid () {
		if (this.managementFeePercentage < 0 || this.managementFeePercentage > 100) {
			return false;
		} else {
			return true;
		}
	}
	
	public String toString() {
		String theString = "List of the properties for " + name + ", taxID: " + taxID + "\n______________________________________________________\n";
		for (int k = 0; k < this.getNumberOfProperties(); k++) {
			if (this.properties[k] != null) {
				theString += this.properties[k].toString() + "\n";
			}
		}
		theString += "______________________________________________________\n\ntotal management Fee: " + (this.getTotalRent() * this.managementFeePercentage / 100);
		return theString;
	}
}
