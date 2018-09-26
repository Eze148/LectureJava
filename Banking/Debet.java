public class Debet extends Tabungan
{   
    double value=0.0;
    Debet(double balance){
        super(balance);
    }

    public void setor(double amount)
    {
        this.value=amount;
        deposit(value);
        System.out.println("Your balance is currently " +getBalance());
    }
}