import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Bank {

	private String name;
	private List<Account> accounts = new ArrayList<Account>();

	public void addAccount(Account account) {
		this.accounts.add(account);
	}

}
