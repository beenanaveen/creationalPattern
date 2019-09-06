package builderPattern;

public class TestBuilderPattern {

	public static void main(String[] args) {
		BankAccount newAccount=new BankAccount
				.BankAccountBuilder("Sylvia")
				.withEmail("abc@gmail.com")
				.build();
		
		System.out.println("Account details: \n"
				+"Account name: "+newAccount.getName()
				+"\nEmail : "+newAccount.getEmail()
				);
	}
}
