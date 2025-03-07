class Karyawan {
    private String nama;
    private double gajiPokok;
    private Perusahaan perusahaan; // Association dengan Perusahaan

    // Constructor
    public Karyawan(String nama, double gajiPokok, Perusahaan perusahaan) {
        setNama(nama); // Validasi nama
        this.gajiPokok = gajiPokok;
        this.perusahaan = perusahaan;
    }

    // Setter dengan validasi (nama minimal 4 karakter)
    public void setNama(String nama) {
        if (nama.length() >= 4) {
            this.nama = nama;
        } else {
            throw new IllegalArgumentException("Nama harus memiliki minimal 4 karakter!");
        }
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public Perusahaan getPerusahaan() {
        return perusahaan;
    }

    // Method untuk menampilkan informasi karyawan
    public void info() {
        System.out.println("Nama Karyawan : " + getNama());
        System.out.println("Gaji Pokok    : Rp" + getGajiPokok());
        System.out.println("Perusahaan    : " + perusahaan.getNamaPerusahaan());
        System.out.println("------------------------------------");
    }
}
