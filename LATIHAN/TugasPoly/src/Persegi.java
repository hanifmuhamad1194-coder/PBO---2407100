public class Persegi extends BangunDatar {
    private final double sisi;
    
    // Constructor
    public Persegi(double sisi) {
        super(sisi); // memanggil constructor induk dengan 1 parameter
        this.sisi = sisi;
    }
    
    // Override method hitungLuas
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
    
    // Override method tampilkan
    @Override
    public void tampilkan() {
        System.out.println("Persegi");
        System.out.println("======================");
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("======================");
    }
}