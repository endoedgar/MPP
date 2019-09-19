
public class CheckingAccount extends Account {
	private String acctId;
	private double monthlyFee;
	private double balance;
	
	public CheckingAccount(String acctId, double fee, double startBalance) {
		super();
		this.acctId = acctId;
		this.monthlyFee = fee;
		this.balance = startBalance;
	}

	@Override
	public String getAccountID() {
		return this.acctId;
	}

	@Override
	public double getBalance() {
		return this.balance;
	}

	@Override
	public double computeUpdatedBalance() {
		return balance - monthlyFee;
	}

}
