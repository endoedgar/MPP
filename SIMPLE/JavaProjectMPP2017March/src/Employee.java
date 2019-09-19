import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> accounts;
	
	
	
	public Employee(String name) {
		super();
		this.name = name;
		accounts = new ArrayList<Account>();
	}

	public String getName()
	{ return name; }
	
	public void addAccount(Account acct) {
		accounts.add(acct);
	}
	
	public double computeUpdatedBalanceSum() {
		return accounts.stream().mapToDouble(x -> x.computeUpdatedBalance()).sum();
	}
}
