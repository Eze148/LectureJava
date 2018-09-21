public class saldo
{
	private double balance;
	private double interest;

	public saldo()
	{
		balance = 0;
		interest = 0;
    }
    
	public saldo(double initialBalance, double initialInterest)
	{
		balance = initialBalance;
		interest = initialInterest;
    }
    
	public void deposit(double amount)
	{
		balance = balance + amount;
    }
    
	public void withdraw(double amount)
	{
		balance = balance - amount;
    }
    
	public void addInterest()
	{
		balance = balance + balance * interest;
	}

	public double getBalance()
	{
		return balance;
	}
}