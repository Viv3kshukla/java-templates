package designpatterns;

public class BankAccount {
	
	private String name;
	private String accountNumber;
	private String email;
	private boolean newsletter;
	
	
	public static class BankAccountBuilder{
		private String name;
		private String accountNumber;
		private String email;
		private boolean newsletter;
		
		public BankAccountBuilder(String name, String accountNumber) {
			this.name = name;
			this.accountNumber = accountNumber;
		}
		
		public BankAccountBuilder withEmail(String email) {
			this.email = email;
			return this;
		}
		
		public BankAccountBuilder withNewsLetter(boolean newsletter) {
			this.newsletter = newsletter;
			return this;
		}
		
		
		public BankAccount build() {
			return new BankAccount(this);
		}
		
		
	}
	
	public BankAccount(BankAccountBuilder builder) {
		this.name = builder.name;
		this.accountNumber = builder.accountNumber;
		this.email = builder.email;
		this.newsletter = builder.newsletter;
	}
	
	
	
	
	
}
