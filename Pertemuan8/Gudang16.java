package Pertemuan8;

import java.util.Stack;

public class Gudang16 {
    Barang16[] tumpukan;
    int size, top;

    public Gudang16(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang16[size];
        top = -1;
    }
    public boolean cekKosong(){
        if (top == -1) {
            return true;
        }else{
            return false;
        }
    }
    public boolean cekPenuh(){
        if (top == size - 1) {
            return true;
        }else{
            return false;
        }
    }
    //push
    public void tambahBarang(Barang16 brg){
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang "+ brg.nama+ " berhasil ditambahkan ke gudang");
        }else{
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
        }
    }
    //pop
    public Barang16 ambilBarang(){
        if (!cekKosong()) {
            Barang16 delete = tumpukan[top];
            top--;
            System.out.println("Barang "+delete.nama+" diambil dari gudang");
            System.out.println("Kode unik dalam biner : " + konversiDesimalkeBiner(delete.kode));
            return delete;
        }else{
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }
    //peek
    public Barang16 lihatBarangTeratas(){
        if (!cekKosong()) {
            Barang16 barangteratas = tumpukan[top];
            System.out.println("Barang teratas: "+barangteratas.nama);
            return barangteratas;
        }else{
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }
     public void tampilkanBarang() {
        if(!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang : ");
            for(int i = top; i <= 0; i++) {
                System.out.printf("Kode %d : %s (Kategori %s)\n", tumpukan[i]. kode, 
                tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }
    public String konversiDesimalkeBiner(int kode) {
        StackKonversi16 stack = new StackKonversi16();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
    //Soal latihan
    public Barang16 lihatBarangTerbawah() {
        if(!cekKosong()) {
            System.out.println("Barang terbawah : " + tumpukan[0].nama);
            return tumpukan[0];
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }
    boolean cariNama(String nama, int mulai) {
        if(nama.equalsIgnoreCase(tumpukan[mulai].nama)) {
            System.out.println("Barang ditemukan.");
            return true;
        } else {
            return cariNama(nama, mulai+1);
        }
    }

    boolean cariKode(int kode, int mulai) {
        if(kode == tumpukan[mulai].kode) {
            System.out.println("Barang ditemukan.");
            return true;
        } else {
            return cariKode(kode, mulai+1);
        }
    }
}
