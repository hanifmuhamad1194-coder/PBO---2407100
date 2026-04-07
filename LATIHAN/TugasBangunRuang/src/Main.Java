public class Main {
    public static void main(String[] args) {
        // Data sesuai soal
        double panjang = 10;
        double lebar = 5;
        double tinggi = 4;
        
        // Membuat objek BangunRuang
        BangunRuang bangunRuang = new BangunRuang(panjang, lebar, tinggi);
        
        // Menampilkan hasil
        System.out.println("=== HASIL PERHITUNGAN ===");
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("------------------------");
        System.out.println("Luas Alas: " + bangunRuang.hitungLuas());
        System.out.println("Volume: " + bangunRuang.hitungVolume());
    }
}