package bankaccount;

import java.util.UUID;

public class BankAccount {
	private double checkingBalance;
	private double savingsBalance;
	private String accountId;
	private static int numAccounts = 0;
	private static double totalAmount = 0;
	public BankAccount() {
		this(0,0);
		
	}
	
	public BankAccount(double checkingBalance, double savingsBalance) {
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		this.accountId = setAccountId();
		numAccounts ++;
		totalAmount = checkingBalance + savingsBalance;
		getAccountInfo();

	}
	
	private String setAccountId() {
		return UUID.randomUUID().toString().replaceAll("_", "");
	}
	
	
	public double getCheckingBalance() {
		return this.checkingBalance;
	}
	
	public double getSavingsBalance() {
		return this.savingsBalance;
	}
	
	
	public void depositFunds(double depositAmount, String accountType) {
		switch(accountType) {
		case "checking":
			this.checkingBalance += depositAmount;
			totalAmount += depositAmount;
			System.out.println("Deposited " + depositAmount + "to checking account");
			break;
		case "savings":
			this.savingsBalance += depositAmount;
			totalAmount += depositAmount;
			System.out.println("Deposited " + depositAmount + "to savings account");
			break;
		default:
			System.out.println("Please choose checking or savings accout");
		}
	}
	public void withdrawFunds(double withdrawAmount, String accountType) {
		switch(accountType) {
		case "checking":
			if(this.checkingBalance - withdrawAmount > 0){
				this.checkingBalance -= withdrawAmount;
				totalAmount -= withdrawAmount;
				System.out.println("Withdrew " + withdrawAmount + "from checking account");
			} else {
				System.out.println("Insufficient funds");
				
			}
			break;
		case "savings":
			if (this.savingsBalance - withdrawAmount > 0) {
				this.savingsBalance -= withdrawAmount;
				totalAmount -= withdrawAmount;
				System.out.println("Withdrew " + withdrawAmount + "from savings account");
			}else {
				System.out.println("Insufficient funds");
			}
			break;
		default:
			System.out.println("Please choose checking or savings accout");
		}
	}
	
	public void getAccountInfo() {
		System.out.println("Info for account " + this.accountId);
		System.out.println("Number of Accounts" + numAccounts);
		System.out.println("Checking: " + this.checkingBalance);
		System.out.println("Savings: " + this.savingsBalance);
		System.out.println("Total: " + totalAmount);
	}
	
}
