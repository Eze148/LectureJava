import java.util.Scanner;

class Interface{
    static void MainMenu(){
        System.out.println();
        System.out.println("Main Menu");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Saldo");
        System.out.println("4. Exit");
        System.out.println("Your Input: ");
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Please enter account name:");
	String name = in.nextLine();
	System.out.println("Please enter account number:");
	long noRek = in.nextLong();
        System.out.println("Input Saldo Awal: ");
        double saldoAwal=in.nextDouble();
        
        boolean flag =true;
        int pilihan;
        double value;
        
        System.out.println();
        System.out.println("1. Business Bank");
        System.out.println("2. Haji Bank");
        System.out.println("Choose a bank type [1/2]: ");
        pilihan=in.nextInt();
        if(pilihan == 1)
        {
            Bisnis b = new Bisnis(name, noRek, saldoAwal);
            while(flag)
            {
                System.out.println("Welcome to Business Bank "+b.getNama());
                System.out.println("Account No: "+b.getnoRek());
                MainMenu();
                pilihan=in.nextInt();
                switch(pilihan)
                {
                    case 1:
                            System.out.println("Input jumlah yang akan disetor: ");
                            value = in.nextDouble();
                            b.simpanUang(value);
                            System.out.println("Saldo Bisnis anda sekarang Rp. "+b.getSaldo());
                            System.out.println();
                            continue;
                    case 2:
                            System.out.println("Input jumlah yang akan ditarik: ");
                            value = in.nextDouble();
                            b.tarikUang(value);
                            System.out.println("Saldo Bisnis anda sekarang Rp. "+b.getSaldo());
                            System.out.println();
                            continue;
                    case 3: 
                            System.out.println("Saldo akun bisnis anda adalah "+b.getSaldo());
                            System.out.println();
                            continue;
                    case 4:
                            System.out.println("Good Bye");
                            flag=false;
                            break;
                    default: 
                            System.out.println("Invalid Input");
                            continue;
                }
            }
            
        }
        else if(pilihan==2)
        {
            Haji h = new Haji(name, noRek, saldoAwal);
            while(flag)
            {
                System.out.println("Welcome to Haji Bank "+h.getNama());
                System.out.println("Account No: "+h.getnoRek());
                MainMenu();
                pilihan=in.nextInt();
                switch(pilihan)
                {
                    case 1:
                            System.out.println("Input jumlah yang akan disetor: ");
                            value = in.nextDouble();
                            h.simpanUang(value);
                            System.out.println("Saldo Bisnis anda sekarang Rp. "+h.getSaldo());
                            System.out.println();
                            continue;
                    case 2:
                            System.out.println("Input jumlah yang akan ditarik: ");
                            value = in.nextDouble();
                            h.tarikUang(value);
                            System.out.println("Saldo Bisnis anda sekarang Rp. "+h.getSaldo());
                            System.out.println();
                            continue;
                    case 3:
                            System.out.println("Saldo akun haji anda adalah "+h.getSaldo());
                            System.out.println();
                            continue;
                    case 4:
                            System.out.println("Good Bye");
                            flag=false;
                            break;
                    default: 
                            System.out.println("Invalid Input");
                            continue;
                }
            }
        }     
    }
}
