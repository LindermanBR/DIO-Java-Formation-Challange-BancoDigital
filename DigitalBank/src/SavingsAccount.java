
public class SavingsAccount extends Account {

	public SavingsAccount(Client cliente) {
		super(cliente);
	}

	@Override
	public void printStatement() {
		System.out.println("=== Savings Account Statement ===");
		super.printCommonInfo();
	}
}
