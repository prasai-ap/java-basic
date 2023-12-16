package Interface2;

public class Main {
	public static void main(String[] args) {
		CurrentAccount ca = new CurrentAccount(100000,0.07,850000,"Hattisar");
		System.out.println(ca.computeInterest());
		boolean b = ca.withdraw(75000);
		if(b) {
			System.out.println("Rupees 75000 is withdrawn from current account");
		}
		else {
			System.out.println("withdrawl amount exceeds current balance");	
		}
		System.out.println("current balance "+ca.getBalance());	
		SavingAccount sa=new SavingAccount(10000000,50000,0.04,8000,"Hattisar",0.04,100000);
		boolean a=sa.withdraw(8000);
		if(a) {
			System.out.println("Rupees 8000 is withdrawn fromsaving account");
		}
		else {
			System.out.println("Withdrawl amount exceeds the limit");
		}
		
	}

}

