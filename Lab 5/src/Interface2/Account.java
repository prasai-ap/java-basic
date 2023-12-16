package Interface2;

public interface Account {
	String getBranchName();
	long getBalance();
	boolean deposit(double amount);
	boolean withdraw(double amount);
	void setRate(double rate);
	double computeInterest();
}
