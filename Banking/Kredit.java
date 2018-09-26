public class Kredit extends Tabungan
{
    double value=0.0;
    Kredit(double balance){
        super(balance);
    }
    public void tarik(double amount)
    {
        this.value=amount;
        withdraw(value);
        System.out.println("Your balance is currently " +getBalance());
    }
}
