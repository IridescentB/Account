
public class SavingsAccount extends Accounts {
	private double interest;
	public int passedTime = 0;
	
	public SavingsAccount(double bal, double i){
		setBalance(bal);
		interest = i;
	}
	
	@Override
	public void debit(double money) throws Exception {
		if(passedTime < 12){
			// System.out.println("아직 출금할 수 없습니다!\n");
			throw new NotWithdrawalException("아직 출금할 수 없습니다!\n");
		} else {
			setBalance(getBalance() - money);
		}
	}
	
	@Override
	public double getWithdrawableAccount(){
		if(passedTime < 12){
			return 0;
		} else {
			return getBalance();
		}
	}
	
	@Override
	public double passTime(int time){
		passedTime += time;
		if(passedTime < 12) {
			return getBalance();
		} else if(passedTime == 12) {
			setBalance(getBalance()*Math.pow((1+interest), 12));
			return getBalance();
		} else {
			return getBalance();
		}
	}
	
	@Override
	public double passTime(){
		passedTime += 1;
		if(passedTime < 12) {
			return getBalance();
		} else if(passedTime == 12) {
			setBalance(getBalance()*Math.pow((1+interest), 12));
			return getBalance();
		} else {
			return getBalance();
		}
	}
	
	public double estimateValue(int month){
		return getBalance()*Math.pow((1+interest),month);
	}
	
	public double estimateValue(){
		return getBalance()*(1+interest);
	}
	
	public String toString(){
		return String.format("SavingsAccount_Balance: $ %.2f\n", getBalance());
	}
}
