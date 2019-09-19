import java.time.LocalDate;
import java.util.List;

public class Commissioned extends Employee {
	private double commission;
	private double baseSalary;
	private List<Order> orders;
	
	public double calcGrossPay(int month, int year) {
		double orderAmount = 0;
		
		LocalDate currentMonthYear = LocalDate.of(year, month, 1);
		LocalDate lastMonthYear = currentMonthYear.minusMonths(1);
		
		for(Order order : orders) {
			if(order.getOrderDate().getMonth() == lastMonthYear.getMonth() && order.getOrderDate().getYear() == lastMonthYear.getYear())
				orderAmount += order.getOrderAmount();
		}
		
		return baseSalary + (commission * orderAmount);
	}

	public Commissioned(int empId, double commission, double baseSalary, List<Order> orders) {
		super(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.orders = orders;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	
	
	
}
