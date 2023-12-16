package Interface2;

public class SavingAccount extends BasicAccount {
	int transactionLimit;
	int transact=0;
	double depositLimit;
	double withdrawlLimit;
	double interestRate;
	long amount;
	String branchName;
	double rate; 
	public SavingAccount(double depositLimit,double withdrawLimit,double interestRate,long amount,String branchName,double rate,int transactionLimit) {
		 this.depositLimit=depositLimit;
		 this.withdrawLimit=withdrawLimit;
		 this.interestRate=interestRate;
		 this.branchName=branchName;
		 this.rate=rate;
		 this.transactionLimit=transactionLimit;
	}
	public boolean withdraw(double amount) {
		if(amount>this.amount)
			return false;
		else {
			if(transact>transactionLimit) {
				return false;
			}
			else {
				this.amount-=amount;
				transact++;
				return true;
			}
		}
	}
	
	public double computeInterest() {
		
		return 0;
		}
}
