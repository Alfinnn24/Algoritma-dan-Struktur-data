package Pertemuan6;

public class Hotel16 {
    String nama, kota;
    int harga, bintang;

    public Hotel16(String n, String k, int h, int b){
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }
    void tampilAll(){
        System.out.println("Nama = "+nama);
        System.out.println("Kota = "+kota);
        System.out.println("Harga = "+harga);
        System.out.println("Bintang = "+bintang);
    }
}
