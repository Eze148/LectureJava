class Bisnis extends Tabungan
{
    private double saldo_awal_minimum = 1000000.0;
    private double saldo_minimum = 1000000.0;
    private double setoran_minimum = 50000.0;

    Bisnis(String nama, long noRekening, double saldoAwal)
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
}