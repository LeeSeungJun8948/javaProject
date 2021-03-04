package Check;

public class Account {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	private int balance;
	
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) // 잔고는 0이상 1000000이하
		this.balance = balance;
	}
}
