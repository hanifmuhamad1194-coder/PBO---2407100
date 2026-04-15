public class PersegiPanjang extends BangunDatar {
    private final double panjang;
    private final double lebar;
    
    // Constructor
    public PersegiPanjang(double panjang, double lebar) {
        super(panjang, lebar); // memanggil constructor induk dengan 2 parameter
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    // Override method hitungLuas
    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
    
    // Override method tampilkan
    @Override
    public void tampilkan() {
        System.out.println("Persegi Panjang");
        System.out.println("======================");
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("======================");
    }
}