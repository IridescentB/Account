
public abstract class Accounts implements Valuable {
	
	private double balance;
	
	public void Accounts(double b){
		balance = b;
	}
	protected void setBalance(double money){
		balance = money;
	}
	public double getBalance(){ 
		return balance;
	}
	public void credit(double money){
		balance += money;
	}
	public void debit(double money) throws Exception {
		balance -= money;
	}
	public abstract double getWithdrawableAccount();
	public abstract double passTime(int time);
	public abstract double passTime();
	
	public String toString(){
		return String.format("Account_Balance: $ %d\n", getBalance());
	}
};
