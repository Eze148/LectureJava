public class mobil{

    int tempuh =0;
    int gantioli =0;
    double tangki= 0.0;
    double kmPerliter=0.0;
    final double tangkipenuh=45;

    mobil()
    {
        this.tangki=this.tangkipenuh;
        this.gantioli=1000;
        this.kmPerliter=14;
    }
    mobil(double kmPerliter)
    {
        if(kmPerliter<=0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            this.tangki=this.tangkipenuh;
            this.gantioli=1000;
            this.kmPerliter=kmPerliter;
        }

    }
    public int cekOdometer()
    {
        return tempuh;
    }
    public void kemudikan(int km)
    {
        double bensinout = km/kmPerliter;
        if(tangki<=0)
        {
            System.out.println("Bensin anda telah habis");
        }
        else if(tangki-bensinout<0)
        {
            System.out.println("Mobil tidak dapat menyelesaikan perjalanan");
            System.out.format("Jarak yang dapat ditempuh oleh mobil adalah sejauh %.2f\n", tangki*kmPerliter);
            tempuh+=(tangki*kmPerliter);
            tangki=0;
        }
        else
        {
            System.out.println("Anda telah sampai, anda menempuh perjalanan sejauh " +km);
            tangki-=bensinout;
            tempuh+=km;
        }
    }
    public void tambahBahanBakar(double liter)
    {
        if(liter<=0)
        {
            System.out.println("Input Invalid");
        }
        else if(tangki+liter>tangkipenuh)
        {
            System.out.format("Bensin terlalu banyak!! Jumlah yang terbuang %.2f litre\n", tangki+liter-tangkipenuh);
            tangki=tangkipenuh;
            System.out.println("Akan tetapi bensin anda sudah full");
        }
        else{
            tangki+=liter;
            System.out.println("Sukses!!! Tangki anda sekarang sebanyak" +tangki);
        }

    }
    public void bunyikanKlakson()
    {
        System.out.println("TIIIIIIIIIIIIIIIIIIIIIN");
    }
    public void gantiOli()
    {
        if(cekOli())
        {
            gantioli+=1000;
            System.out.println("Oli anda telah diganti. Anda harus menempuh "+gantioli+" untuk mengganti oli kembali.");
            System.out.println("Anda telah menempuh jarak sejauh "+this.cekOdometer());
        }
        else{
            System.out.println("Anda tidak perlu mengganti oli!");
        }
    }
    public boolean cekOli()
    {
        if(tempuh>=gantioli)
        {
            return true;
        }
        return false;
    }
    public double cekBahanBakar()
    {
        return tangki;
    }
}