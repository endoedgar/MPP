package myPackage;
import java.util.Date;

public class Employee {
	private int id;
	private String name;
	private Date birthDate;
	private String ssn;
	private double salary;
	
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public Date getBirthDate() { return birthDate; }
	public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }
	public String getSsn() { return ssn; }
	public void setSsn(String ssn) { this.ssn = ssn; }
	public double getSalary() { return salary; }
	public void setSalary(double salary) { this.salary = salary; }
	
	public Employee(int id, String name, Date birthDate, String ssn, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.ssn = ssn;
		this.salary = salary;
	}
}
