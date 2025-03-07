public class index {
    public static void main(String[] args) {
        // Membuat objek perusahaan
        Perusahaan ptInovasi = new Perusahaan("PT. Inovasi Teknologi");

        // Membuat objek karyawan yang terasosiasi dengan perusahaan
        Karyawan karyawan1 = new Karyawan("Andi", 5000000, ptInovasi);
        Karyawan karyawan2 = new Karyawan("Budi", 6000000, ptInovasi);
        Karyawan karyawan3 = new Karyawan("Citra", 7000000, ptInovasi);

        // Menampilkan informasi karyawan
        karyawan1.info();
        karyawan2.info();
        karyawan3.info();
    }
}
