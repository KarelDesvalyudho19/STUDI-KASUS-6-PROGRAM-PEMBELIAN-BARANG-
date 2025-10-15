public class Barang {
    private String nama;
    private int hargaSatuan;
    private int jumlah;

    public Barang(String nama, int hargaSatuan, int jumlah) {
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int hitungTotalHarga() {
        return hargaSatuan * jumlah;
    }
}
