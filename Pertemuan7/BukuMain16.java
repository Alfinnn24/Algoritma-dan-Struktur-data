package Pertemuan7;

import java.util.Scanner;

public class BukuMain16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku data = new PencarianBuku();
        int jumBuku = 5;

        System.out.println("========================================");
        System.out.println("Masukan data buku secara urut dari kode buku terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("========================");
            System.out.print("Kode Buku\t : ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul Buku\t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit\t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang\t : ");
            String pengarang = s1.nextLine();
            System.out.print("stok\t\t : ");
            int stok = s.nextInt();
            
            

            Buku16 m = new Buku16(kodeBuku, judulBuku, tahunTerbit, pengarang, stok);
            data.tambahBuku(m);
        }

        System.out.println("=======================================");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();

        System.out.println("=======================================");
        System.out.println("=======================================");
        System.out.println("Pencarian Data : ");
        System.out.println("1. Pencarian berdasarkan Kode Buku");
        System.out.println("2. Pencarian berdasarkan Judul Buku");
        System.out.print("Pilihan: ");
        int pilihan = s.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Masukan Kode Buku yang dicari : ");
                System.out.print("Kode Buku : ");
                String cariKode = s1.next();
                System.out.println("Menggunakan Sequential Search");
                int posisiKode = data.FindSeqSearch(cariKode);
                data.tampilPosisi(cariKode, posisiKode);
                data.TampilData(cariKode, posisiKode);
                System.out.println("=======================================");
                System.out.println("Menggunakan Binary Search");
                posisiKode = data.FindBinarySearch(cariKode, 0, jumBuku - 1);
                data.tampilPosisi(cariKode, posisiKode);
                data.TampilData(cariKode, posisiKode);
                
                break;
            case 2:
                System.out.println("Masukan Judul Buku yang dicari : ");
                System.out.print("Judul Buku : ");
                String cari = s1.next();
                System.out.println("Menggunakan Sequential Search");
                int posisiJudulSequential = data.findJudulSequential(cari);
                data.tampilPosisi(cari, posisiJudulSequential);
                data.TampilData(cari, posisiJudulSequential);
                int jumlahJudulSequential = 0;
                for (Buku16 buku : data.listBK) {
                    if (buku != null && buku.judulBuku.equals(cari)) {
                        jumlahJudulSequential++;
                    }
                }
                if (jumlahJudulSequential > 1) {
                    System.out.println("Peringatan: Terdapat lebih dari satu hasil dengan judul buku '" + cari + "'!");
                }
                System.out.println("=======================================");
                System.out.println("Menggunakan Binary Search");
                int posisiJudulBinary = data.findJudulBinary(cari);
                data.tampilPosisi(cari, posisiJudulBinary);
                data.TampilData(cari, posisiJudulBinary);
                int jumlahJudulBinary = 0;
                for (Buku16 buku : data.listBK) {
                    if (buku != null && buku.judulBuku.equals(cari)) {
                        jumlahJudulBinary++;
                    }
                }
                if (jumlahJudulBinary > 1) {
                    System.out.println("Peringatan: Terdapat lebih dari satu hasil dengan judul buku '" + cari + "'!");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}