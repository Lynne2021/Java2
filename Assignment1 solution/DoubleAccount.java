
public class DoubleAccount extends Account{
    private double doubleBalance;

    public DoubleAccount(){
        super();
    }
    public DoubleAccount(int number){
        super(number);
        this.doubleBalance=0.0;
    }
    public void withdrawFromDouble(double amount) {
        if(this.doubleBalance-amount>=0) {
            this.doubleBalance -= amount;
            System.out.println("Operation approved");
        }
        else
            System.out.println("Operation not approved");
    }

    public void depositToDouble(double amount) {
        this.doubleBalance += amount;
    }

    public double getDoubleBalance(){
        return this.doubleBalance;
    }

    public String toString(){
        return super.toString() + " Double Balance : " + this.doubleBalance + " total : " + (this.doubleBalance + getBalance());
    }
    public double getTotalBalance() {
        return this.doubleBalance + getBalance();
    }

}
