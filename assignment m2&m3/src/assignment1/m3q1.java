package assignment1;
public class m3q1 {
   private int accountNumber;
    private double balance;

    m3q1(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        m3q1 obj = new m3q1(12345, 1000);

        obj.deposit(500);
        obj.withdraw(300);
        obj.display();
    
        
    }
    
}
