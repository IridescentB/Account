package ruin;

public class Account {
	public double account1;
	public double account2;
	
	public void withdrawal1(double wd1){
		account1 -= wd1;
	}
	public void withdrawal2(double wd2){
		account2 -= wd2;
	}
	public void credit1(double money){
		account1 += money;
	}
	public void credit2(double money){
		account2 += money;
	}
	
}
