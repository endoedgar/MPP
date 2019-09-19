
public abstract class Employee {
	private int empId;
	
	public Employee(int empId) {
		super();
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void print() {
		System.out.println("Employee " + empId);
		System.out.println("Compensation");
		calcCompensation(9, 2019).print();
	}
	
	public Paycheck calcCompensation(int month, int year) {
		return new Paycheck(calcGrossPay(month, year), 0.23d, 0.05d, 0.01d, 0.03d, 0.075);
	}
	
	public abstract double calcGrossPay(int month, int year);
}
