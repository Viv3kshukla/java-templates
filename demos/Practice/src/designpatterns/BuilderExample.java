package designpatterns;

public class BuilderExample {
	public static void main(String args[]) {
		
		BankAccount obj = new BankAccount.BankAccountBuilder("vivek", "7861").build();
		
	}
}
