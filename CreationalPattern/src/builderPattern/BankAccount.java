package builderPattern;

public class BankAccount {
	private String name;
	private String email;
	private String accountNumber;
	
	//can only be initialized by inner class
	private BankAccount(BankAccountBuilder builder) {
		this.name=builder.name;
		this.email=builder.email;
		this.accountNumber=builder.accountNumber;
	}

	//All getters
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	//inner class to build outer class
	public static class BankAccountBuilder{
		private String name;
		private String email;
		private String accountNumber;
		
		//All mandatory params are initialized
		public BankAccountBuilder(String name) {
			this.name=name;
		}
		
		//setters for optional params
		public BankAccountBuilder withEmail(String email) {
			this.email=email;
			return this;
		}
		
		public BankAccountBuilder withAccountNumber(String accountNumber) {
			this.accountNumber=accountNumber;
			return this;
		}
		
		public BankAccount build() {
			return new BankAccount(this);
		}
		
	}

}
