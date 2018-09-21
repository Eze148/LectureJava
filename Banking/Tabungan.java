public class Tabungan
{
    private double balance=0.0;
    
	public Tabungan(double initialBalance)
	{
        this.balance = initialBalance;
    }
    
	public void deposit(double amount)
	{
		this.balance+=amount;
    }
    
	public void withdraw(double amount)
	{
		this.balance-=amount;
    }
	public double getBalance()
	{
		return balance;
	}
}