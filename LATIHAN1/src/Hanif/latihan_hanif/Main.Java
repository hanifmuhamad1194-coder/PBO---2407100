package latihan.latihan1;
import java.util.ArrayList;

// Contoh sederhana konsep Class dan Object untuk tugas PBO
class Mahasiswa {
    // Atribut (Data)
    private String nama;
    private String nim;
    private double nilai;
class Cafe {
    String nama;
    String alamat;

    // Constructor (Untuk bikin objek baru)
    public Mahasiswa(String nama, String nim, double nilai) {
    public Cafe(String nama, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
        this.alamat = alamat;
    }

    // Method (Perilaku/Fungsi)
    public void cetakInfo() {
        System.out.println("=== DATA MAHASISWA PBO ===");
        System.out.println("Nama  : " + this.nama);
        System.out.println("NIM   : " + this.nim);
        System.out.println("Nilai : " + this.nilai);
        
        // Contoh logika sederhana
        if (nilai >= 75) {
            System.out.println("Status: LULUS MATKUL");
        } else {
            System.out.println("Status: PERBAIKAN");
        }
        System.out.println("--------------------------");
    public void tampilkan() {
        System.out.println("Nama Cafe: " + nama + " | Alamat: " + alamat);
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari Class Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Lucky", "2407042", 85.5);
        Mahasiswa mhs2 = new Mahasiswa("Budi", "2407001", 60.0);
        // Ini wadahnya biar kaga lama
        ArrayList<Cafe> daftarCafe = new ArrayList<>();

        // Kita masukin datanya pake loop biar keren, atau add manual tapi cepet
        daftarCafe.add(new Cafe("Cafe Halaman", "Indramayu"));
        daftarCafe.add(new Cafe("Kopi Kenangan", "Indramayu"));
        daftarCafe.add(new Cafe("Point Cafe", "Indramayu"));
        daftarCafe.add(new Cafe("Cafe Teras", "Indramayu"));
        daftarCafe.add(new Cafe("Jatibarang Kopi", "Indramayu"));
        daftarCafe.add(new Cafe("Sudut Ruang", "Indramayu"));
        daftarCafe.add(new Cafe("Kopi Janji", "Indramayu"));
        daftarCafe.add(new Cafe("Cafe Rindang", "Indramayu"));
        daftarCafe.add(new Cafe("Senja Kopi", "Indramayu"));
        daftarCafe.add(new Cafe("Cafe Juara", "Indramayu"));

        // Menjalankan method
        mhs1.cetakInfo();
        mhs2.cetakInfo();
        System.out.println("=== DAFTAR 10 CAFE INDRAMAYU ===");
        // Ini bagian otomatisnya biar langsung muncul 10
        for (Cafe c : daftarCafe) {
            c.tampilkan();
        }
    }
}