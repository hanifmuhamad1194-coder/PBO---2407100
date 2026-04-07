public class BangunDatar {
    // Atribut private (enkapsulasi)
    private double panjang;
    private double lebar;
    
    // Constructor
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    // Getter untuk panjang
    public double getPanjang() {
        return panjang;
    }
    
    // Setter untuk panjang
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    // Getter untuk lebar
    public double getLebar() {
        return lebar;
    }
    
    // Setter untuk lebar
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    // Method untuk menghitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }
}