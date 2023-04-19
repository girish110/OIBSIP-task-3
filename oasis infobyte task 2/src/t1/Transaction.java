package t1;

class Transaction {
    enum Type { DEPOSIT, WITHDRAWAL, TRANSFER };
    
    private Type type;
    private double amount;
    
    public Transaction(Type type, double amount) {
        this.type = type;
        this.amount = amount;
    }
    
    public String toString() {
        return type + " $" + amount;
    }
}






