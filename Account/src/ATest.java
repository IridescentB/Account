import java.util.Scanner;

public class ATest {
	public static void main(String[] args){
		Accounts acc1 = new CheckingAccount(100, 50, 0.01, 0.07);
		Accounts acc2 = new SavingsAccount(100, 0.05);
		
		Scanner scan = new Scanner(System.in);
		double amount;
		
		//CheckingAccount
		
		System.out.printf("Account1 balance: $ %.2f\t 현재 출금 가능액: $ %.2f\n", acc1.getBalance(), acc1.getWithdrawableAccount());
		System.out.printf("Enter withdrawal amount for Account1: ");
		amount = scan.nextDouble();
		acc1.debit(amount);
		System.out.printf("Account1 balance: $ %.2f\t 현재 출금 가능액: $ %.2f\n", acc1.getBalance(), acc1.getWithdrawableAccount());
		((CheckingAccount)acc1).isBankrupted();
		
		acc1.passTime(1);
		System.out.printf("Account1 balance: $ %.2f\t 현재 출금 가능액: $ %.2f\n", acc1.getBalance(), acc1.getWithdrawableAccount());
		((CheckingAccount)acc1).isBankrupted();
		acc1.passTime(5);
		System.out.printf("Account1 balance: $ %.2f\t 현재 출금 가능액: $ %.2f\n", acc1.getBalance(), acc1.getWithdrawableAccount());
		((CheckingAccount)acc1).isBankrupted();
		
		//SavingsAccount
		
		System.out.println("");
		
		System.out.printf("Account2 balance: $ %.2f\t 현재 출금 가능액: $ %.2f\n", acc2.getBalance(), acc2.getWithdrawableAccount());
		
		System.out.println("6 Month Later!");
		acc2.passTime(6);
		System.out.printf("Account2 balance: $ %.2f\t 현재 출금 가능액: $ %.2f\n", acc2.getBalance(), acc2.getWithdrawableAccount());
		acc2.debit(50);
		
		System.out.println("Next 6 Month Later!");
		acc2.passTime(6);
		System.out.printf("Account2 balance: $ %.2f\t 현재 출금 가능액: $ %.2f\n", acc2.getBalance(), acc2.getWithdrawableAccount());
		
		System.out.println("Next 1 Month Later!");
		acc2.passTime(1);
		System.out.printf("Account2 balance: $ %.2f\t 현재 출금 가능액: $ %.2f\n", acc2.getBalance(), acc2.getWithdrawableAccount());
		acc2.debit(50);
		System.out.printf("Account2 balance: $ %.2f\t 현재 출금 가능액: $ %.2f\n", acc2.getBalance(), acc2.getWithdrawableAccount());
		
	}
}
