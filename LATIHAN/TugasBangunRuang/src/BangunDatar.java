public class BangunDatar {
    // Atribut dengan enkapsulasi (private)
    private double panjang;
    private double lebar;
    
    // Constructor
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    // Getter dan Setter (opsional, untuk akses jika diperlukan)
    public double getPanjang() {
        return panjang;
    }
    
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public double getLebar() {
        return lebar;
    }
    
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    // Method untuk menghitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }
}