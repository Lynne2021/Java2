import java.util.Date;

public class Account {
    private double balance;
    private int number;
    private Date createdDate;

    public Account(){
        this.createdDate = new Date();
    }
    public Account(int number){
        this.number=number;
        this.balance=0.0;
        this.createdDate = new Date();
    }
    public void withdraw(double amount) {
        if(this.balance - amount>=0) {
            this.balance -= amount;
            System.out.println("Operation approved");
        }
        else
            System.out.println("Operation not approved");
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
    public double getBalance(){
        return this.balance;
    }
    public int getNumber(){
        return number;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public String toString(){
        return "Account number: "+ getNumber() + " Balance: " + getBalance() ;
    }


}
