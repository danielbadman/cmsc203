
public class Procedure {
		public String procedureName, date, practitionerName;

		public double charges;
		
		public Procedure() {
			
		}
		
		public Procedure(String procedureName, String date) {
			this.procedureName = procedureName;
			this.date = date;
		}

		public Procedure(String procedureName, String date, String practitionerName, double charges) {
			this.procedureName = procedureName;
			this.date = date;
			this.practitionerName = practitionerName;
			this.charges = charges;
		}
		
		public String getProcedureName() {
			return procedureName;
		}

		public void setProcedureName(String procedureName) {
			this.procedureName = procedureName;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getPractitionerName() {
			return practitionerName;
		}

		public void setPractitionerName(String practitionerName) {
			this.practitionerName = practitionerName;
		}

		public double getCharges() {
			return charges;
		}

		public void setCharges(double charges) {
			this.charges = charges;
		}
		
		@Override
		public String toString() {
			return "Procedure [procedureName=" + procedureName + ", date=" + date + ", practitionerName="
					+ practitionerName + ", charges=" + charges + "]";
		}
}
