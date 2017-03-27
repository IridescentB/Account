import java.util.Scanner;

public class AccountsTest {
	public static void main(String[] args){
		CheckingAccount account1 = new CheckingAccount(100,-20,0.10,0.07);
		CheckingAccount account2 = new CheckingAccount(100,-20,0.10,0.07);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Adding money to account1: "); //초기 자본금 설정 (account1)
		double money1 = input.nextDouble();
		account1.setBalance(money1);
		
		System.out.print("Adding money to account2: "); //초기 자본금 설정 (account2)
		double money2 = input.nextDouble();
		account2.setBalance(money2);
		
		//while(true){
			System.out.print("Enter the withdrawal amount for account1: ");
			double wd1 = input.nextDouble();
			account1.debit(wd1);
			if(account1.getBalance() < 0){
				System.out.print("Your balance is under 0..\n");
			}
			System.out.printf("account1 balance: %f\n", account1.getBalance());
			System.out.printf("account2 balance: %f\n", account2.getBalance());
			
			System.out.print("Enter the withdrawal amount for account2: ");
			double wd2 = input.nextDouble();
			account2.debit(wd2);
			if(account2.getBalance() < 0){
				System.out.print("Your balance is under 0..\n");
				//return;
			}
			System.out.printf("account1 balance: %f\n", account1.getBalance());
			System.out.printf("account2 balance: %f\n", account2.getBalance());
			
			account1.nextMonth();
			account2.nextMonth();
			System.out.print("Next Month!\n");
			
			System.out.printf("account1 balance: %f\n", account1.getBalance());
			System.out.printf("account2 balance: %f\n", account2.getBalance());
			
		//}
		
	}

}
