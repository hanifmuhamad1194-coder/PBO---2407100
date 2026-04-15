public class Segitiga extends BangunDatar {
    private final double alas;
    private final double tinggi;
    
    // Constructor
    public Segitiga(double alas, double tinggi) {
        super(alas, tinggi); // memanggil constructor induk dengan 2 parameter
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    // Override method hitungLuas
    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
    
    // Override method tampilkan
    @Override
    public void tampilkan() {
        System.out.println("Segitiga");
        System.out.println("======================");
        System.out.println("Alas: " + alas);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("======================");
    }
}