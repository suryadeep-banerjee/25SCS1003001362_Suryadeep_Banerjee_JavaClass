import java.util.Scanner;

public class BankAccount {

	private String accountNumber;
	private String accountHolderName;
	private double balance;

	public BankAccount(String accountNumber, String accountHolderName, double balance) {
		setAccountNumber(accountNumber);
		setAccountHolderName(accountHolderName);
		setBalance(balance);
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		if (!accountNumber.isEmpty() && accountNumber.length() >= 5) {
			this.accountNumber = accountNumber;
		} else {
			System.out.println("Invalid Account Number");
		}
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		if (!accountHolderName.isEmpty() && accountHolderName.length() >= 3) {
			this.accountHolderName = accountHolderName;
		} else {
			System.out.println("Invalid Account Holder Name");
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance >= 0) {
			this.balance = balance;
		} else {
			System.out.println("Invalid Balance");
		}
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
		} else {
			System.out.println("Invalid Deposit Amount");
		}
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid Withdrawal Amount");
		} else if (amount > balance) {
			System.out.println("Insufficient Balance");
		} else {
			balance = balance - amount;
		}
	}

	public void displayAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Available Balance: " + balance);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Account Number: ");
		String accountNumber = sc.nextLine();

		System.out.print("Enter Account Holder Name: ");
		String accountHolderName = sc.nextLine();

		System.out.print("Enter Initial Balance: ");
		double balance = sc.nextDouble();

		BankAccount account = new BankAccount(accountNumber, accountHolderName, balance);

		account.displayAccountDetails();

		System.out.print("Depositing: ");
		double depositAmount = sc.nextDouble();
		account.deposit(depositAmount);

		System.out.print("Withdrawal: ");
		double withdrawalAmount = sc.nextDouble();
		account.withdraw(withdrawalAmount);

		System.out.println("Updated Balance: " + account.getBalance());
	}
}
