public class Debet extends Tabungan
{   
    double interestRate = 0.0;
    public Debit(double balance, double interestRate)
    {
        this.interestRate=interestRate;
    }
    public void addInterest()
    {
        double interest = (1+0.01*interestRate)
        multiplier(interest);
        return;
    }
}