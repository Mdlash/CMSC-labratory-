public class SavingsAccount extends BankAccount {
	
	//1
    private double rate = 0.025;  //1a
    private int savingsNumber = 0;//1b
    private String accountNumber;//1c
    
    //2
    public SavingsAccount(String Name, double initialBalance) {
        super(Name, initialBalance);
        savingsNumber++;
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }
    //3
    public void postInterest() { //  void and no param 
        double interest = getBalance() * rate / 12;
        deposit(interest); // deposit it to account 
    }
    //4
    @Override
    public String getAccountNumber() { // method overrides the super class
        return accountNumber;
    }
    //4
    public SavingsAccount(SavingsAccount original, double initialBalance) {// copy constructor 
        super(original, initialBalance); // call and pass values to the super class 
        savingsNumber = original.savingsNumber + 1; // assign the savings account to this one 
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;//  assign the same account number to the superlass 
    }
}
