public class SavingsAccount extends Account{
    private double annualInterestRate;

    public SavingsAccount(){
        super();
        annualInterestRate=0.0;
    }
    public SavingsAccount(int number, double interestRate){
        super(number);
        annualInterestRate=interestRate;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double rate){
        this.annualInterestRate = rate;
    }
    public void addInterestToAccount(){
        deposit(getBalance() * annualInterestRate);
    }
    public String toString(){
        return super.toString() + " rate: " + this.annualInterestRate;
    }
}
