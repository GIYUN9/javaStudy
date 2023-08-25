package study;

public class MainStrat {
	public static void main(String[] args) {
		BankAccountPO na1 = new BankAccountPO();
		BankAccountPO na2 = new BankAccountPO(1000);
		BankAccountPO na3 = new BankAccountPO(1000, "기윤");
		
		na1.deposit(1000);
		
		na1.checkMyBalance();
	}
}
