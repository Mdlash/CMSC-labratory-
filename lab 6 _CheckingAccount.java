
public class CheckingAccount extends BankAccount {
	public static final double FEE = 0.15;

	public CheckingAccount(String Name, double initialAmount) {
		super(Name, initialAmount); // calling the
		setAccountNumber(getAccountNumber() + "-10");
	}

	@Override
	public boolean withdraw(double amount) {
		amount += FEE;
		return super.withdraw(amount);

	}

}
