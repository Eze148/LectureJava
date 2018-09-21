import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Mie");
        System.out.println("2. Nasi");
        System.out.println("3. Spagetti");
        System.out.println("Pilihan Anda: ");
        int pilihan;
        String makanan;
        pilihan=input.nextInt();
        switch (pilihan) {
            case 1:  makanan = "Mie"; //klo String pilihan -> case "1"
                     break;
            case 2:  makanan = "Nasi";
                     break;
            case 3:  makanan = "Spagetti";
                     break;
            default: makanan = "Pilihan Invalid";
                     break;
        }
        System.out.println(makanan);
    }
}