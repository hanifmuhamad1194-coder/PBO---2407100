public class BangunRuang extends BangunDatar {
    // Atribut tambahan
    private double tinggi;
    
    // Constructor
    public BangunRuang(double panjang, double lebar, double tinggi) {
        // Memanggil constructor parent class
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    // Getter untuk tinggi
    public double getTinggi() {
        return tinggi;
    }
    
    // Setter untuk tinggi
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    // Method untuk menghitung volume
    // Menggunakan method hitungLuas() dari parent class
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }
}