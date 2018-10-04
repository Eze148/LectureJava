class Perawat extends Pegawai implements Gaji
{
    private double gaji=gaji_Tetap;
    private int kehadiran;

    Perawat(String nama, int umur)
    {
        super(nama, umur);
    }
    public double getGaji()
    {
        return gaji;
    }
    public int getKehadiran()
    {
        return kehadiran;
    }
    public void gajiTambahan(int kehadiran)
    {
        this.kehadiran=kehadiran;
        this.gaji+=gaji_kehadiran*kehadiran;
    }
}