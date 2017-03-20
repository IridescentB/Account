
public class Accounts {
	
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
	public void debit(double money){
		balance -= money;
	}
};
