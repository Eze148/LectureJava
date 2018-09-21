public class nasabah
{
    public static void main(String[] args)
    {
        int nomorRekening[]={1111,2222,3333};
        String namaNasabah[]={"Gallard", "Reiner", "Marcel"};
        for(int i=0; i<nomorRekening.length; i++)
        {
            System.out.println("Nomor Rekening : " +nomorRekening[i]+" bernama "+namaNasabah[i]);
        }
    }
}