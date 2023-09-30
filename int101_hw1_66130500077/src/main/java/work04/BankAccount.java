package work04;

public class BankAccount {
    private int number;
    private Person owner;
    private double balance;

    public BankAccount(int number, Person owner) {
        this.number = number;
        this.owner = owner;     
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        if(amount <= this.balance) {
            balance -= amount;
        }
        
        return balance;
    }

    public void transfer(double amount, BankAccount account) {
        if(amount <= this.balance) {
            balance = withdraw(amount);
            account.deposit(amount);
        }
    }

    
    public String toString() {
        return "BankAccount(" + number +  " owner:"+ getOwner() +  " balance:" +getBalance()+ ")";
    }
}
