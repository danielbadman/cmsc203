
public class SavingsAccount extends BankAccount{
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		savingsNumber++;
	}
	
	public void postInterest() {
		deposit(super.getBalance()*(rate/12));
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public SavingsAccount(SavingsAccount savingsAccount, double balance) {
		super(savingsAccount, balance);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		savingsNumber++;
	}
}

