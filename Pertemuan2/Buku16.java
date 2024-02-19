package Pertemuan2;
public class Buku16 {
    
    String judul, pengarang;
    int halaman, stock, harga;

    public Buku16() {

    }

    public Buku16(String jud, String pg, int hal, int stock, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stock = stock;
        harga = har;
    }
    void tampilInformasi() {
        System.out.println("Judul: "+ judul);
        System.out.println("Pengarang: "+ pengarang);
        System.out.println("Jumlah halaman: "+ halaman);
        System.out.println("Stock: "+ stock);
        System.out.println("Harga: Rp "+ harga);

    }
    void terjual(int jml){
        if (stock > 0 && jml <= stock) {
            stock -= jml;
            System.out.println(jml + " buku " + judul + " telah terjual.");
        } else {
            System.out.println("Stok tidak mencukupi untuk melakukan penjualan.");
        }
      
    }
    void restock(int jml) {
        stock += jml;
    }
    void gantiHarga(int hrg) {
        harga = hrg;
    }
}
