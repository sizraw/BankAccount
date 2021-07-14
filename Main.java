import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		System.out.println("Please enter your full name: ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();//Reads string
		account.setCustomerName(name);

		System.out.println("Please enter your account number: ");
		Scanner ainput = new Scanner(System.in);
		int accountt = input.nextInt();//Reads string
		account.setAccountnumber(accountt);

		System.out.println("Please enter amount to deposit: ");
		Scanner deposit = new Scanner(System.in);
		Float depositt= deposit.nextFloat();//Reads string
		account.setBalance(depositt);

		System.out.println("Please enter your email address: ");
		Scanner emailinput = new Scanner(System.in);
		String email= emailinput.nextLine();//Reads string
		account.setEmail(email);

		System.out.println("Please enter your phone number: ");
		Scanner phoneinput = new Scanner(System.in);
		long phone= phoneinput.nextLong();//Reads string
		account.setPhoneNumber(phone);

		do {
			System.out.println("Please enter 'd' for deposit, 'w' for withdraw, 'b' for balance and 'e' for exit: ");
			Scanner inputt = new Scanner(System.in);
			String str = inputt.nextLine();//Reads string
			account.method(str);

		}
		while (true);
	}

}