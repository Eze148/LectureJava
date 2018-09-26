import java.util.Scanner;

class Menu
{    public static void main(String[] args)
    {
        Tabungan t = new Tabungan(10000.0);
        Scanner input = new Scanner(System.in);
        int pilihan;
        do
        {
            Kredit kr = new Kredit(t.getBalance());
            Debet db= new Debet(t.getBalance());
            System.out.println("Select a Menu: ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            pilihan=input.nextInt();
            if(pilihan == 1)
            {
                System.out.println(t.getBalance());
            }
            else if(pilihan == 2)
            {
                System.out.print("Input the amount you want to deposit: ");
                double am=input.nextDouble();
                db.setor(am);
                t.setTabungan(db.getBalance());
            }
            else if(pilihan == 3)
            {
                if(kr.getBalance() > 5000.0)    // Balance must be above 5000 to make a withdrawal.
                {
                    System.out.println("Input the amount you want to withdraw: ");
                    double am=input.nextDouble();
                    kr.tarik(am);
                    t.setTabungan(kr.getBalance());
                }
                else
                {
                    System.out.println("Sorry your balance is insufficient.");
                }
            }

        } while(pilihan !=4);
        System.out.println("Thank you for using the application");
    }
}