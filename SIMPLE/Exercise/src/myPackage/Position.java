package myPackage;

public class Position {
	private String title;
	private Employee employee;
	
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	public Employee getEmployee() { return employee; }
	public void setEmployee(Employee employee) { this.employee = employee; }
	
	public Position(String title, Employee employee) {
		super();
		this.title = title;
		this.employee = employee;
	}
	
	public double getSalary()  {
		return (this.employee != null) ? this.employee.getSalary() : 0;
	}
}
