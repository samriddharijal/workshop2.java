package workshop2;



public class qs13 {
 private String accountNumber;
 private double balance;
 private String accountHolderName;
 private String accountHolderAddress;

 
 qs13() {
     accountNumber = "N/A";
     balance = 0.0;
     accountHolderName = "Unknown";
     accountHolderAddress = "Unknown";
     System.out.println("Default BankAccount created.");
 }

 
 qs13(String accountNumber, String accountHolderName) {
     this.accountNumber = accountNumber;
     this.accountHolderName = accountHolderName;
     this.balance = 0.0;
     this.accountHolderAddress = "Not Provided";
 }

 
 qs13(String accountNumber, double balance, String accountHolderName) {
     this.accountNumber = accountNumber;
     this.balance = balance;
     this.accountHolderName = accountHolderName;
     this.accountHolderAddress = "Not Provided";
 }

 
qs13(String accountNumber, double balance,
                           String accountHolderName, String accountHolderAddress) {
     this.accountNumber = accountNumber;
     this.balance = balance;
     this.accountHolderName = accountHolderName;
     this.accountHolderAddress = accountHolderAddress;
 }

 public double getBalance()           { return balance; }
 public String getAccountNumber()     { return accountNumber; }
 public String getAccountHolderName() { return accountHolderName; }

 public static void main(String[] args) {
    qs13 acc1 = new qs13();
    qs13 acc2 = new qs13("ACC002", "Sita Kumari");
    qs13 acc3 = new qs13("ACC003", 3000.00, "Hari Prasad");
    qs13 acc4 = new qs13("ACC004", 7000.00, "Gita Devi", "Pokhara");

     System.out.println(acc1.getAccountHolderName() + " - Balance: " + acc1.getBalance());
     System.out.println(acc2.getAccountHolderName() + " - Balance: " + acc2.getBalance());
     System.out.println(acc3.getAccountHolderName() + " - Balance: " + acc3.getBalance());
     System.out.println(acc4.getAccountHolderName() + " - Balance: " + acc4.getBalance());
 }
}