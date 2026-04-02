package workshop2;



public class qs7 {
 String accountNumber;
 double balance;
 String accountHolderName;
 String accountHolderAddress;

 // Parameterized Constructor
 qs7(String accountNumber, double balance,
                            String accountHolderName, String accountHolderAddress) {
     this.accountNumber = accountNumber;
     this.balance = balance;
     this.accountHolderName = accountHolderName;
     this.accountHolderAddress = accountHolderAddress;
 }

 public static void main(String[] args) {
     qs7 account = new qs7(
         "ACC001", 5000.00, "Ram Bahadur", "Kathmandu"
     );
     System.out.println("Account Number: " + account.accountNumber);
     System.out.println("Holder: " + account.accountHolderName);
     System.out.println("Balance: " + account.balance);
 }
}
