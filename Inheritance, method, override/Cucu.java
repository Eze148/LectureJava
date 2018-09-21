public class Cucu extends Anak
{
    String sifatCucu;
    
    protected void setsifatCucu(String h)
    {
        this.sifatCucu = h;
    }

    public static void main(String[] args)
    {
        String _Induk="Pemarah";
        String _Anak="Ramah";
        String _Cucu="Sombong";
        Cucu c = new Cucu();
        c.setsifatAnak(_Anak);
        c.setsifatInduk(_Induk);
        c.setsifatCucu(_Cucu);
        System.out.println(c.sifatAnak);
        System.out.println(c.sifatInduk);
        System.out.println(c.sifatCucu);
        c.cetak();
    }
}