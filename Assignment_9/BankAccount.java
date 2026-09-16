public class BankAccount {

	String accountNumber;
	String accountHolderName;
	double balance;
	static double interestRate = 5.0;

	BankAccount(String accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	void displayAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Balance: " + balance);
		System.out.println("Interest Rate: " + interestRate + "%");
		System.out.println();
	}

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount("ACC1001", "Rahul", 5000);
		BankAccount account2 = new BankAccount("ACC1002", "Amit", 7500);
		BankAccount account3 = new BankAccount("ACC1003", "Riya", 10000);

		System.out.println("Before Changing Interest Rate:");

		account1.displayAccountDetails();
		account2.displayAccountDetails();
		account3.displayAccountDetails();

		BankAccount.interestRate = 7.5;

		System.out.println("After Changing Interest Rate:");

		account1.displayAccountDetails();
		account2.displayAccountDetails();
		account3.displayAccountDetails();
	}
}
