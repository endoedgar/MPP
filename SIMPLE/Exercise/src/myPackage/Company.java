package myPackage;
import java.util.List;

public class Company {
	private String name;
	private List<Department> departments;
	
	public Company(String name, List<Department> departments) {
		super();
		this.name = name;
		this.departments = departments;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	
	public double calculateTotalSalaries() {
		double sum = 0;
		for(Department d : departments) {
			sum += d.getSalaries();
		}
		
		return sum;
	}
}
