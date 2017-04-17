import java.math.*;

public class CheckingAccount extends Accounts {
	private double creditLimit;
	private double interest;
	private double loanInterest;
	
	public CheckingAccount(double b, double cl, double i, double li){
		setBalance(b);
		creditLimit = cl;
		interest = i;
		loanInterest = li;
	}
	
	@Override
	public void debit(double money) throws Exception {
		if(money < 0){
			throw new NegativeDebitException("음수 입력!");
		} else if ((getBalance()-money) < -creditLimit) {
			throw new NonDebitAmountException("Debit Amount exceeded account balance.");
		} else {
			setBalance(getBalance()-money);
		}
		/*		
		if(getBalance() > -creditLimit){
			System.out.print("Exceeded your credit limit.\n");
			setBalance(getBalance()+money);
		}
		*/
	}
	public void nextMonth(){
		if(getBalance() > 0){
			setBalance(getBalance()*(1+interest));
		}
		if(getBalance() < 0){
			setBalance(getBalance()*(1+loanInterest));
		}
	}
	
	@Override
	public double getWithdrawableAccount(){
		if(getBalance() < -creditLimit){
			return 0;
		}
		return creditLimit + getBalance();
	}
	
	@Override
	public double passTime(int time){
		if(getBalance() > 0) {
			setBalance(getBalance()*Math.pow((1+interest), time));
			return getBalance();
		} else if(getBalance() > -creditLimit){
			setBalance(getBalance()*(1+loanInterest)*time);
			//setBalance(getBalance()*Math.pow((1+loanInterest), time));
			return getBalance();
		} else {
			return getBalance();
		}
	}
	
	@Override
	public double passTime(){
		if(getBalance() > 0) {
			setBalance(getBalance()*(1+interest));
			return getBalance();
		} else if(getBalance() > -creditLimit){
			setBalance(getBalance()*(1+loanInterest));
			return getBalance();
		} else {
			return getBalance();
		}
	}
	public boolean isBankrupted(){
		if(getBalance() < -creditLimit){
			System.out.println("account went Bankrupted!");
		}
		return (getBalance() < -creditLimit);
		
	}
	
	public double estimateValue(int month){
		return getBalance()*Math.pow((1+interest),month);
	}
	
	public double estimateValue(){
		return getBalance()*(1+interest);
	}
	
	public String toString(){
		return String.format("CheckingAccount_Balance: $ %.2f\n", getBalance());
	}
}
