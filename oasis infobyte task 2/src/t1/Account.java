package t1;

public class Account {

	double balance=0.0;
	
	public Account() {
        
        balance = 0.0;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public boolean transfer(String recipient, double amount) {
        // simulate a successful transfer
        return true;
    }

}
