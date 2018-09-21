import java.util.Scanner;

class Interface{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        mobil m = new mobil();

        System.out.println("Hello, berapa kecepatan mobil km/litre ?");
        double user = input.nextDouble();
        m.kmPerliter= user;
        System.out.println("Sukses! Kecepatan mobil km/litre anda adalah "+m.kmPerliter);

        boolean flag = true;
        while(flag)
        {
            System.out.println("Main Menu...");
	    System.out.println("1. Cek Odometer");
	    System.out.println("2. Cek Bensin");
	    System.out.println("3. Mengemudikan");
	    System.out.println("4. Isi Bensin");
	    System.out.println("5. Membunyikan Klakson!");
            System.out.println("6. Ganti Oli");
            System.out.println("7. Keluar");
            System.out.println("Pilih input: ");
            int pil = input.nextInt();
            switch(pil)
            {
                case 1:
                        System.out.println("Anda telah menempuh jarak sebesar "+m.cekOdometer());
                        continue;
                case 2:
                        System.out.println("Anda mempunyai "+m.cekBahanBakar()+" litre bensin");
                        continue;
                case 3:
                        System.out.println("Masukkan jarak yang akan ditempuh: ");
                        pil = input.nextInt();
                        m.kemudikan(pil);
                        continue;      
                case 4:
                        System.out.println("Masukan jumlah bensin yang akan diisi: ");
                        double ben = input.nextDouble();
                        m.tambahBahanBakar(ben);
                        continue; 
                case 5:
						m.bunyikanKlakson();
						continue;
				case 6:
						m.gantiOli();
                        continue;
                case 7:
                        System.out.println("Terima Kasih telah menggunakan aplikasi ini :)");
                        flag = false;
                        break;
				default:
						System.out.println("Invalid input!");
						continue;
            }
        }
    }
}