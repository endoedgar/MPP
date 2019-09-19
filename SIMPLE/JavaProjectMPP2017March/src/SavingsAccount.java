
public class SavingsAccount extends Account {
	private String acctId;
	private double interestRate;
	private double balance;
	
	
	public SavingsAccount(String acctId, double interestRate, double startBalance) {
		super();
		this.acctId = acctId;
		this.interestRate = interestRate;
		this.balance = startBalance;
	}

	@Override
	public String getAccountID() {
		return acctId;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public double computeUpdatedBalance() {
		return balance + (interestRate * balance);
	}

}
