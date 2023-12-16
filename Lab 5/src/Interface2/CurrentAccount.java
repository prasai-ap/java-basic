package Interface2;

	public class CurrentAccount extends BasicAccount{
		public CurrentAccount(double withdrawLimit, double interestRate, long amount,String branchName) {
			super(withdrawLimit, interestRate, amount, branchName);
		}

		public boolean withdraw(double amount) {
			//withdraw and return true if amount to be withdrawn is less than amount in account\
			return false;
		}

		@Override
		public double computeInterest() {
			return this.amount*getRate();
		}

}
