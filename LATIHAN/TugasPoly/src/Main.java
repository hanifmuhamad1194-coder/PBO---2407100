public class Main {
    public static void main(String[] args) {
        // Menggunakan satu tipe variabel (BangunDatar) untuk menyimpan berbagai objek
        BangunDatar[] bangunDatar = new BangunDatar[3];
        
        // Inisialisasi objek-objek berbeda
        bangunDatar[0] = new Persegi(5.0);
        bangunDatar[1] = new PersegiPanjang(4.0, 6.0);
        bangunDatar[2] = new Segitiga(3.0, 4.0);
        
        // Menampilkan semua bangun datar menggunakan polymorphism
        System.out.println("=== DAFTAR BANGUN DATAR ===\n");
        
        for (BangunDatar bd : bangunDatar) {
            bd.tampilkan();
            System.out.println(); // spasi antar output
        }
        
        // Contoh penggunaan constructor BangunDatar langsung
        System.out.println("=== CONTOH BANGUN DATAR INDUK ===");
        BangunDatar bd1 = new BangunDatar(3.0, 4.0);
        bd1.tampilkan();
        
        BangunDatar bd2 = new BangunDatar(7.0); // menggunakan constructor 1 parameter
        bd2.tampilkan();
    }
}