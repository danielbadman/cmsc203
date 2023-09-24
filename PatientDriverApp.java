
public class PatientDriverApp {

	public static void main(String args[]) {
		Patient patient1 = new Patient("Clancey", "Rose", "James", "49442 Cadbury Circle", "Germantown", "MD", "20874", "301-239-9191", "Saul Goodman", "240-092-2231");
		Procedure procedure1 = new Procedure("Physical Exam", "7/20/2018", "Dr. Erwin", 3425.0);
		Procedure procedure2 = new Procedure("X-Ray", "8/20/2018", "Dr. Jamison", 4672.3);
		Procedure procedure3 = new Procedure("Blood Test", "9/19/2018", "Dr. Maxwell", 1590.88);
		
		PatientDriverApp pda = new PatientDriverApp();
		
		pda.displayPatient(patient1);
		pda.displayProcedure(procedure1);
		pda.displayProcedure(procedure2);
		pda.displayProcedure(procedure3);
		System.out.println("\nTotal Charges: $" + pda.calculateTotalCharges(procedure1, procedure2, procedure3));
		
		System.out.println("\nStudent Name: Daniel Badman"
				+ "\nMC#: 21135999"
				+ "\nDue Date: 9/24/2023");
	}
	
	public void displayPatient(Patient patient) {
		System.out.println("Patient info:" +
	"\n  Name: " + patient.buildFullName(patient.getFirstName(), patient.getMiddleName(), patient.getLastName()) +
	"\n  Address: " + patient.buildAddress(patient.getStreetAddress(), patient.getCity(), patient.getState(), patient.getZipCode()) +
	"\n  Emergency Contact: " + patient.buildEmergencyContact(patient.getEmergencyName(), patient.getEmergencyPhoneNumber()) + "\n");
	}
	
	public void displayProcedure(Procedure procedure) {
		System.out.println("\tProcedure: " + procedure.getProcedureName() +
				"\n\tProcedure Date: " + procedure.getDate() +
				"\n\tPractitioner: " + procedure.getPractitionerName() +
				"\n\tCharge: " + procedure.getCharges() + "\n");
	}
	
	public double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
		return (procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges());
	}
}
