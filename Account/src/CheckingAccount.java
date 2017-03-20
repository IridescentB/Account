
public class CheckingAccount extends Accounts {
	private double creditLimit;
	private double interest;
	private double loanInterest;
	
	public CheckingAccount(double cl, double i, double li){
		creditLimit = cl;
		interest = i;
		loanInterest = li;
	}
	
	@Override
	public void debit(double money){
		setBalance(getBalance()-money);
		/*
		if(getBalance() < 0){
			System.out.print("Your balance is now under 0.\n");
		}
		*/
		if(getBalance() < creditLimit){
			System.out.print("Exceeded your credit limit.\n");
			setBalance(getBalance()+money);
		}
	}
	public void nextMonth(){
		if(getBalance() > 0){
			setBalance(getBalance()*(1+interest));
		}
		if(getBalance() < 0){
			setBalance(getBalance()*(1+loanInterest));
		}
	}
}
