class Dokter extends Pegawai implements Gaji
{
    private double gaji=gaji_Tetap;
    private int pasien;

    Dokter(String nama, int umur)
    {
        super(nama, umur);
    }
    public double getGaji()
    {
        return gaji;
    }
    public int getPasien()
    {
        return pasien;
    }
    public void gajiTambahan(int pasien)
    {
        this.pasien=pasien;
        this.gaji+=gaji_bonus*pasien;
    }
}