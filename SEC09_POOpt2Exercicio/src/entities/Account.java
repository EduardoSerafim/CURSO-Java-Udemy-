package entities;

public class Account {

	private static final double TAX = 5.00;
	
	private int accountNumber;
	private String holderName;
	private double balance;
	
	public Account() {
		
	}

	public Account(int accountNumber, String holderName, double intialDeposit) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		toDeposit(intialDeposit);
	}
	
	public Account(int accountNumber, String holderName) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
	}

	
	public int getAccountNumber() {
		return accountNumber;
	}


	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}
	
	
	
	public void toDeposit(double quantity) {
		this.balance += quantity;
	}
	
	public void toWithdraw(double quantity) {
		this.balance = this.balance - quantity - TAX;
	}

	@Override
	public String toString() {
		return "Account " 
				+ accountNumber + ", "
				+ "Holder: " 
				+ holderName + ", "
				+ "Balance: $ " 
				+ String.format("%.2f", balance)
				;
	}
	
	


	
	
	
	
}
