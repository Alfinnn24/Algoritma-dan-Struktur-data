package Pertemuan8;

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
            System.out.println("Barang "+ brg.nama+" berhasil ditambahkan ke gudang");
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
            for(int i = top; i >= 0; i--) {
                System.out.printf("Kode %d : %s (Kategori %s)\n", tumpukan[i]. kode, 
                tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }
}
