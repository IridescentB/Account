import java.util.ArrayList;

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
	
	public static double sumForAccount(ArrayList<Accounts> list){
		double sum = 0;
		for(Accounts account : list){
			sum += account.getBalance();
		}
		return sum;
	}
	
	public static void passTimeForList(ArrayList<Accounts> list, int month){
		for(Accounts account : list){
			account.passTime(month);
		}
	}
	
	
	public String toString(){
		return String.format("Account_Balance: $ %d\n", getBalance());
	}
};
