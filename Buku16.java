public class Buku16 {
    
    String judul, pengarang;
    int halaman, stock, harga;

    void tampilInformasi() {
        System.out.println("Judul: "+ judul);
        System.out.println("Pengarang: "+ pengarang);
        System.out.println("Jumlah halaman: "+ halaman);
        System.out.println("Stock: "+ stock);
        System.out.println("Harga: Rp "+ harga);

    }
    void terjual(int jml){
        stock -= jml;
    }
    void restock(int jml) {
        stock += jml;
    }
    void gantiHarga(int hrg) {
        harga = hrg;
    }
}
