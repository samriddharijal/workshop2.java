package workshop2;



class BankAccountInfo {
 private String accountNumber;
 private double balance;

 public BankAccountInfo(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 public String getAccountNumber() { return accountNumber; }
 public double getBalance()       { return balance; }
}

public class qs12 {
 private int customerId;
 private String name;
 private BankAccountInfo bankAccount;

 
 public qs12(int customerId, String name, BankAccountInfo bankAccount) {
     this.customerId = customerId;
     this.name = name;
     this.bankAccount = bankAccount;
 }

 
 public int getCustomerId()              { return customerId; }
 public String getName()                 { return name; }
 public BankAccountInfo getBankAccount() { return bankAccount; }

 
 public void setName(String name) { this.name = name; }

 public static void main(String[] args) {
     qs12 c1 = new qs12(1, "Ram Bahadur",
                         new BankAccountInfo("ACC001", 5000.00));
    qs12 c2 = new qs12(2, "Sita Kumari",
                         new BankAccountInfo("ACC002", 8000.00));

     System.out.println("Customer 1: " + c1.getName()
                      + ", Balance: " + c1.getBankAccount().getBalance());
     System.out.println("Customer 2: " + c2.getName()
                      + ", Balance: " + c2.getBankAccount().getBalance());

     
     c1.setName("Ram B. Thapa");
     System.out.println("Updated Name: " + c1.getName());
 }
}