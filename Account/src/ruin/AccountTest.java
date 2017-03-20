package ruin;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args){
		Account account = new Account();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Adding money to account1: "); //초기 자본금 설정 (account1)
		double money1 = input.nextDouble();
		account.credit1(money1);
		
		System.out.print("Adding money to account2: "); //초기 자본금 설정 (account2)
		double money2 = input.nextDouble();
		account.credit2(money2);
		
		while(true){
			System.out.print("Enter the withdrawal amount for account1: ");
			double wd1 = input.nextDouble();
			account.withdrawal1(wd1);
			if(account.account1 < 0){
				System.out.print("Debit amount exceeded account balance.\n");
				return;
			}
			System.out.printf("account1 balance: %f\n", account.account1);
			System.out.printf("account2 balance: %f\n", account.account2);
			
			System.out.print("Enter the withdrawal amount for account2: ");
			double wd2 = input.nextDouble();
			account.withdrawal2(wd2);
			if(account.account2 < 0){
				System.out.print("Debit amount exceeded account balance.\n");
				return;
			}
			System.out.printf("account1 balance: %f\n", account.account1);
			System.out.printf("account2 balance: %f\n", account.account2);
			
		}
		
	}

}
