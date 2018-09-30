class Haji extends Tabungan
{
    private double saldo_awal_minimum = 500000.0;
    private double saldo_minimum = 500000.0;
    private double setoran_minimum = 100000.0;

    Haji(String nama, long noRekening, double saldoAwal)
    {
        super(nama,noRekening);
        setSaldoMinimum(this.saldo_minimum);
        setSetoranMinimum(this.setoran_minimum);
        if(saldoAwal>= getSaldoMinimum()){
            setSaldo(saldoAwal);
        }
        else{
            System.out.println("Maaf saldo awal anda tidak mencukupi, minimum saldo awal adalah " +getSaldoMinimum());
            System.exit(0);
        }
        
    }
    public void tarikUang(double jumlahPenarikan)
    {
        if(jumlahPenarikan> 0.1*getSaldo())
        {
            setSaldo(getSaldo()-jumlahPenarikan - 50000.0);
            getSaldo();
        }
        else{
            setSaldo(getSaldo()-jumlahPenarikan);
            getSaldo();
        }
    }
}