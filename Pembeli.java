import java.util.ArrayList;
import java.util.List;

public class Pembeli {
    private String nama;
    private List<Barang> daftarBarang;

    public Pembeli(String nama) {
        this.nama = nama;
        this.daftarBarang = new ArrayList<>();
    }

    public void tambahBarang(Barang b) {
        daftarBarang.add(b);
    }

    public int hitungTotalHarga() {
        int total = 0;
        for (Barang b : daftarBarang) {
            total += b.hitungTotalHarga();
        }
        return total;
    }

    public void tampilkanInfo() {
        System.out.println("\n=== INFORMASI PEMBELIAN ===");
        System.out.println("Nama Pembeli: " + nama);
        System.out.println("Daftar Barang:");
        for (Barang b : daftarBarang) {
            System.out.println("- " + b.getNama() + " | Harga: " + b.getHargaSatuan() +
                    " | Jumlah: " + b.getJumlah() +
                    " | Total: " + b.hitungTotalHarga());
        }
        System.out.println("Total Harga Keseluruhan: Rp" + hitungTotalHarga());
    }
}
