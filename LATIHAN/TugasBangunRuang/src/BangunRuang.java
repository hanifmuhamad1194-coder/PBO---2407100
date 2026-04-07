public class BangunRuang extends BangunDatar {
    // Atribut tambahan
    private double tinggi;
    
    // Constructor
    public BangunRuang(double panjang, double lebar, double tinggi) {
        // Memanggil constructor parent class
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    // Getter dan Setter untuk tinggi (opsional)
    public double getTinggi() {
        return tinggi;
    }
    
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    // Method untuk menghitung volume
    public double hitungVolume() {
        // Menggunakan method hitungLuas dari parent class
        return this.hitungLuas() * tinggi;
    }
}