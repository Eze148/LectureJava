class Tabungan
{
    private String nama;
    private long noRekening;
    private double saldo =0;
    private double saldo_minimum = 0;
    private double setoran_minimum=0;

    public Tabungan()
    {

    }
    public Tabungan(String nama, long noRekening)
    {
        this.nama=nama;
        this.noRekening=noRekening;
    }
    public String getNama()
    {
        return nama;
    }
    public long getnoRek()
    {
        return noRekening;
    }
    protected void setSaldoMinimum(double saldo_minimum)
    {
        this.saldo_minimum=saldo_minimum;
    }
    public double getSaldoMinimum()
    {
        return saldo_minimum;
    }
    protected void setSetoranMinimum(double setoran_minimum)
    {
        this.setoran_minimum=setoran_minimum;
    }
    public void setSaldo(double saldo)
    {
        this.saldo=saldo;
    }
    public double getSaldo()
    {
        return saldo;
    }
    public void simpanUang(double deposit)
    {
        if(deposit>=this.setoran_minimum)
        {
            this.saldo+=deposit;
        }
        else
        {
            System.out.println("Maaf setoran minimum adalah sebesar "+this.setoran_minimum);
        }
    }
    public void tarikUang(double withdraw)
    {
        if(withdraw > 0 && this.saldo-withdraw>=saldo_minimum)
        {
            this.saldo-=withdraw;
        }
        else
        {
            System.out.println("Jumlah penarikan anda melebihi saldo anda atau invalid, sehingga transaksi dibatalkan ");
        }
    }
}