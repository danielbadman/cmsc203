
public class CheckingAccount extends BankAccount{
	public static final double FEE = 0.15;
	
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		super.setAccountNumber(super.getAccountNumber() + "-10");
	}
	
	public boolean withdraw(double something) {
		return super.withdraw(something + FEE);
	}
}
