public class Tabungan
{
    private double balance=0.0;
    
	public Tabungan(double initialBalance)
	{
		this.balance = initialBalance;
	}
	public void setTabungan(double setTabungan)
	{
		this.balance=setTabungan;
	}
	public boolean deposit(double amount)
	{
		if(amount < 0)
		{
			System.out.println("Input Invalid");
			return false;
		}
		else{
			balance+=amount;
			return true;
		}
    }
    
	public boolean withdraw(double amount)
	{
		if(amount < 0)
		{
			System.out.println("Input Invalid");
			return false;
		}
		else if(amount > balance)
		{
			System.out.println("Insufficient Funds");
			return false;
		}
		else{
			balance-=amount;
			return true;
		}
		
    }
	public double getBalance()
	{
		return balance;
	}
}