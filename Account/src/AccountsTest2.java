import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountsTest2 {
	public static void main(String[] args) throws Exception{
		Accounts account1 = new CheckingAccount(100, 50, 0.01, 0.07);
		Accounts account2 = new SavingsAccount(100, 0.05);
		
		Scanner scan = new Scanner(System.in);
		
		try {			
			System.out.println("Enter deposit amount for Account1: ");
			double amount = scan.nextDouble();
			account1.debit(amount);
			System.out.println("Account1 balance: $ " + account1.getBalance());
			
			System.out.println("Enter deposit amount for Account2: ");
			amount = scan.nextDouble();
			account2.debit(amount);
			
		} catch(InputMismatchException e) {
			System.out.println("예외 발생: 숫자를 입력하세요.\n" + e.toString());
		} catch(NegativeDebitException e){
			System.out.println("예외 발생: " + e.toString());
		} catch(NonDebitAmountException e){
			System.out.println("예외 발생: " + e.toString());
		} catch(NotWithdrawalException e){
			System.out.println("예외 발생: " + e.toString());
		}
		finally {
			account1.passTime(2);
			System.out.println("2 months later account1: " + account1.getBalance());
		}
	}
}
