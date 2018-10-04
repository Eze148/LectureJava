class Interface
{
    public static void main (String[] args)
    {
        Dokter d = new Dokter("Nicky Logan",35);
        Dokter a = new Dokter("Jeremy Liem", 42);
        Perawat p = new Perawat("Trisya Christine",39);
        Perawat c = new Perawat("Adeline Llisa", 33);

        d.gajiTambahan(10);
        a.gajiTambahan(21);
        p.gajiTambahan(25);
        c.gajiTambahan(26);

        System.out.println("Dr "+d.getNama());
        System.out.println("Umur: "+d.getUmur());
        System.out.println("Total Pasien: "+d.getPasien());
        System.out.println("Total Gaji: "+d.getGaji());

        System.out.println();

        System.out.println("Dr "+a.getNama());
        System.out.println("Umur: "+a.getUmur());
        System.out.println("Total Pasien: "+a.getPasien());
        System.out.println("Total Gaji: "+a.getGaji());

        System.out.println();

        System.out.println("Perawat "+p.getNama());
        System.out.println("Umur: "+p.getUmur());
        System.out.println("Total Kehadiran: "+p.getKehadiran());
        System.out.println("Total Gaji: "+p.getGaji());

        System.out.println();

        System.out.println("Perawat "+c.getNama());
        System.out.println("Umur: "+c.getUmur());
        System.out.println("Total Kehadiran: "+c.getKehadiran());
        System.out.println("Total Gaji: "+c.getGaji());
    }
}
