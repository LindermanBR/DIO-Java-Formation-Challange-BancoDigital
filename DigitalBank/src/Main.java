
public class Main {

	public static void main(String[] args) {
		Bank bradesco = new Bank();
		bradesco.setName("Bradesco");

		Client client = new Client("Linderman");
		SavingsAccount savingsAccount = new SavingsAccount(client);
		CheckingAccount checkingAccount = new CheckingAccount(client);

		System.out.println("Bradesco Bank");
		System.out.println("Savings Account");
		savingsAccount.deposit(1000);
		savingsAccount.printStatement();

		System.out.println("Checking Account");
		checkingAccount.deposit(1000);
		checkingAccount.printStatement();

		System.out.println("Transfering 500 from savings to checking");
		savingsAccount.transfer(500, checkingAccount);

		System.out.println("Savings Account");
		savingsAccount.printStatement();

		System.out.println("Checking Account");
		checkingAccount.printStatement();

		System.out.println("Transfering 500 from checking to savings");
		checkingAccount.transfer(500, savingsAccount);

		System.out.println("Savings Account");
		savingsAccount.printStatement();

		System.out.println("Checking Account");
		checkingAccount.printStatement();

		bradesco.addAccount(savingsAccount);
		bradesco.addAccount(checkingAccount);

		System.out.println("All accounts on Bradesco Bank");
		for (Account account : bradesco.getAccounts()) {
			account.printStatement();
		}

	}

}
