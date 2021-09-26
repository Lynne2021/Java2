public class CurrentAccount extends Account {
    private double overdraftBalance;

    public CurrentAccount() {
        super();
    }

    public CurrentAccount(int number, double limit) {
        super(number);
        overdraftBalance = limit;
    }

    public void setOverdraftBalance(double amount){
        this.overdraftBalance=amount;
    }

    public double getOverdraftBalance(){
        return this.overdraftBalance;
    }

    public void withdraw(double amount) {
        if(this.getBalance() + this.overdraftBalance >= amount) {
            super.withdraw(amount);
            System.out.println("Operation approved");
        }
        else
            System.out.println("Operation not approved");
    }

    public String toString(){
        return super.toString() + "overdraft Balance : "+ overdraftBalance;
    }
}
