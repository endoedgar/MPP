
public class Hourly extends Employee {
	private double hourlyWage;
	private double hoursPerWeek;
	
	public double calcGrossPay(int month, int year) {
		return 4*hoursPerWeek*hourlyWage;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public double getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(double hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	public Hourly(int empId, double hourlyWage, double hoursPerWeek) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	
	

}
