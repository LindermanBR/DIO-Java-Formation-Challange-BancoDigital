import lombok.Getter;
import lombok.Setter;

public abstract class Account implements IAccount {

	private static final int DEFAULT_AGENCY = 1;
	private static int SEQUENTIAL = 1;

	@Getter
	protected int agency;

	@Getter
	protected int number;

	@Getter
	protected double balance;

	@Getter
	@Setter
	protected Client client;

	public Account(Client cliente) {
		this.agency = Account.DEFAULT_AGENCY;
		this.number = SEQUENTIAL++;
		this.client = cliente;
	}

	@Override
	public void withdraw(double value) {
		balance -= value;
	}

	@Override
	public void deposit(double value) {
		balance += value;
	}

	@Override
	public void transfer(double value, IAccount destinationAccount) {
		this.withdraw(value);
		destinationAccount.deposit(value);
	}

	protected void printCommonInfo() {
		System.out.println(String.format("Owner: %s", this.client.getName()));
		System.out.println(String.format("Agency: %d", this.agency));
		System.out.println(String.format("Number: %d", this.number));
		System.out.println(String.format("Balance: %.2f", this.balance));
	}
}
