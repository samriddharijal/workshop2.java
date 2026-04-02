package workshop2;



public class qs10 {
 String accountNumber;
 private double balance;    
 String accountHolderName;
 String accountHolderAddress;

 qs10(String accountNumber, double balance,
                        String accountHolderName, String accountHolderAddress) {
     this.accountNumber = accountNumber;
     this.balance = balance;
     this.accountHolderName = accountHolderName;
     this.accountHolderAddress = accountHolderAddress;
 }

 
 public double getBalance() {
     return balance;
 }

 public static void main(String[] args) {
     qs10 account = new qs10(
         "ACC001", 5000.00, "Ram Bahadur", "Kathmandu"
     );
     System.out.println("Balance: " + account.getBalance());
 }
}
