import java.util.ArrayList;

public class AccountTest508 {
	public static void main(String[] args){
		CheckingAccount account1 = new CheckingAccount(100, 50, 0.01, 0.07);
		SavingsAccount account2 = new SavingsAccount(100, 0.05);
		
		ArrayList<Accounts> accountList = new ArrayList<Accounts>();
		
		accountList.add(account1);
		accountList.add(account2);
		
		System.out.println("전체 계좌의 잔액 합산 : " + Accounts.sumForAccount(accountList));
		
		System.out.println("전체 계좌의 12개월 후 적용");
		Accounts.passTimeForList(accountList, 12);
		System.out.println("전체 계좌의 잔액 합산 : " + Accounts.sumForAccount(accountList));
	}
}
