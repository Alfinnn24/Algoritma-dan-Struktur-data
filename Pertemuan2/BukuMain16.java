package Pertemuan2;
public class BukuMain16 {
    public static void main(String[] args) {
        
        Buku16 bk1 = new Buku16();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stock = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku16 bk2 = new Buku16("Self Reward ", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku16 bk3 = new Buku16("Moch. Alfin Burhanudin A.", "Alfin", 200, 33, 190000);
        bk3.terjual(20);
        bk3.tampilInformasi();

        System.out.print("Harga total: Rp ");
        System.out.println(bk3.hitungHargaTotal());
        System.out.print("Diskon: Rp ");
        System.out.println(bk3.hitungDiskon());
        System.out.print("Total bayar: Rp ");
        System.out.println(bk3.hitungHargaBayar());
       
    }
}
