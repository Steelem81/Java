package bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount bankAccount1 =new BankAccount();
		bankAccount1.depositFunds(20, "savings");
		bankAccount1.getAccountInfo();
		bankAccount1.withdrawFunds(10, "checking");
		bankAccount1.withdrawFunds(10, "savings");
		bankAccount1.getAccountInfo();


	}

}
