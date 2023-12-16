package Interface2;

public abstract class BasicAccount implements Account {
	double withdrawLimit;	
	double interestRate;
	long amount;
	String branchName;
	
	
	public BasicAccount(double withdrawLimit, double interestRate, long amount, String branchName) {
		this.withdrawLimit=withdrawLimit; 
		this.interestRate=interestRate; 
		this.amount=amount; 
		this.branchName=branchName;
	}

	public String getBranchName() {
		return this.branchName;
	}
	
	public long getBalance() {
		return 0;
	}
	
	public void setRate(double interestRate) {
		this.interestRate=interestRate;
	}
	public double getRate() {
		return interestRate;
	}
	public boolean deposit(double amount) {
		this.amount+=amount;
		return true;
	}	
}
