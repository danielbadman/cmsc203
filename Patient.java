
public class Patient {
		private String firstName, middleName, lastName, streetAddress, city, state, zipCode, phoneNumber, emergencyName, emergencyPhoneNumber;

		public Patient() {}
		
		public Patient(String firstName, String middleName, String lastName) {
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName = lastName;
		}

		public Patient(String firstName, String middleName, String lastName, String streetAddress, String city,
				String state, String zipCode, String phoneNumber, String emergencyName, String emergencyPhoneNumber) {
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName = lastName;
			this.streetAddress = streetAddress;
			this.city = city;
			this.state = state;
			this.zipCode = zipCode;
			this.phoneNumber = phoneNumber;
			this.emergencyName = emergencyName;
			this.emergencyPhoneNumber = emergencyPhoneNumber;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getMiddleName() {
			return middleName;
		}

		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getStreetAddress() {
			return streetAddress;
		}

		public void setStreetAddress(String streetAddress) {
			this.streetAddress = streetAddress;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getZipCode() {
			return zipCode;
		}

		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getEmergencyName() {
			return emergencyName;
		}

		public void setEmergencyFirstName(String emergencyName) {
			this.emergencyName = emergencyName;
		}

		public String getEmergencyPhoneNumber() {
			return emergencyPhoneNumber;
		}

		public void setEmergencyPhoneNumber(String emergencyPhoneNumber) {
			this.emergencyPhoneNumber = emergencyPhoneNumber;
		}
		
		public String buildFullName(String first, String middle, String last) {
			return (first + " " + middle + " " + last);
		}
		
		public String buildAddress(String address, String city, String state, String zip) {
			return (address + " " + city + " " + state + " " + zip);
		}
		
		public String buildEmergencyContact(String name, String phone) {
			return (name + " " + phone);
		}
		
		@Override
		public String toString() {
			return "Patient [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
					+ ", streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", zipCode="
					+ zipCode + ", phoneNumber=" + phoneNumber + ", emergencyName=" + emergencyName
					+ ", emergencyPhoneNumber=" + emergencyPhoneNumber + "]";
		}
		
}
