package Pertemuan7;

public class Buku16 {
    String kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    Buku16 (String kb, String jb, int tt, String p, int s) {
        kodeBuku = kb;
        judulBuku = jb;
        tahunTerbit = tt;
        pengarang = p;
        stock = s;
    }

    void tampilDataBuku() {
        System.out.println("========================");
        System.out.println("Kode buku :"+kodeBuku);
        System.out.println("Judul buku :"+judulBuku);
        System.out.println("Tahun terbit :"+tahunTerbit);
        System.out.println("Pengarang :"+pengarang);
        System.out.println("Stock :"+stock);
    }
}