public class Anak extends Induk
{
    String sifatAnak;
    
    protected void setsifatAnak(String h)
    {
        this.sifatAnak = h;
    }
    protected void setsifatInduk(String h)
    {
        this.sifatInduk = "abc";
    }
    public static void main(String[] args)
    {
        String _Induk = "Pemarah";
        String _Anak = "Ramah";
        Anak a = new Anak();
        a.setsifatAnak(_Anak);
        a.setsifatInduk(_Induk);
        System.out.println(a.sifatAnak);
        System.out.println(a.sifatInduk);
        a.cetak();
    }
}