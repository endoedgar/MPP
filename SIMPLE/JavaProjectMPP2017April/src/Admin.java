


public class Admin {
	private Department[] departments;
	
	public Admin(Department[] depts) {
		this.departments = depts;
	}
	
	public String format(String name, String message) {
		return name + ": " + message;
	}
	
	public String hourlyCompanyMessage() {
		String output = "";
		for(Department dept : departments) {
			output += format(dept.getName(), dept.nextMessage())+"\n";
		}
		
		return output;
	}
}
