import java.util.Scanner;

public class BankAccount {

    private int accountnumber;
    private float balance;
    private String customerName;
    private long phoneNumber;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void method(String Name) {
        if (Name.equals("b")) {
            System.out.println("Here is the information of the customer!!");
            System.out.println("***************************");
            System.out.println("Name: " + this.getCustomerName());
            System.out.println("Account Number: " + this.getAccountnumber());
            System.out.println("Email: " + this.getEmail());
            System.out.println("Phone Number: " + this.getPhoneNumber());
            System.out.println("Account Balance: " + this.balance);
        } else if (Name.equals("d")) {
            System.out.println("Please enter the amount to deposit: ");
            Scanner input = new Scanner(System.in);
            float str = input.nextFloat();
            this.balance = this.balance + str;
            System.out.println("Your new balance is " + this.balance);
        } else if (Name.equals("w")) {
            System.out.println("Please enter the amount to withdraw: ");
            Scanner input = new Scanner(System.in);
            float str = input.nextFloat();

            if (str <= this.balance) {
                this.balance = this.balance - str;
                System.out.println("Your new balance is " + this.balance);
            } else {
                System.out.println("Sorry you do not have enough balance to withdraw");
            }
        }
        else if(Name.equals("e")){
            System.out.println("Bye....");
            System.exit(0);
        }
    }
    public void depositFund(float deposit) {
        System.out.println(this.balance + deposit);
    }

    public void WithdrawFund(float withdraw) {
        if (this.balance > withdraw) {
            System.out.println(this.balance - withdraw);
        } else {
            System.out.println("not enough fund");
        }
    }
}