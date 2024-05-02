package Pertemuan8;

import java.util.Scanner;

public class Utama16 {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);

        System.out.print("Masukkan kapasitas gudang: ");
        int kapasitas = scanInt.nextInt();

        Gudang16 gudang = new Gudang16(10);
        System.out.println("Selamat datang di sistem gudang");
        while (true) {
            System.out.println("=======================================");
            System.out.println("|Menu:                                |");
            System.out.println("=======================================");
            System.out.println("|1. Tambah Barang                     |");
            System.out.println("|2. Ambil barang                      |");
            System.out.println("|3. Tampilkan tumpukan barang         |");
            System.out.println("|4. Lihat Barang teratas/terbawah     |");
            System.out.println("|5. Cari menggunakan nama/kode        |");
            System.out.println("|6. Keluar                            |");
            System.out.println("=======================================");

            System.out.print("Pilih operasi: ");
            int pilihan = scanInt.nextInt();
            scanInt.nextLine();   
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanInt .nextInt();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanString.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanString.nextLine();
                    Barang16 barangBaru = new Barang16(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru); 
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                    case 4:
                    System.out.println("1.Lihat Barang teratas");
                    System.out.println("2.Lihat Barang terbawah");
                    System.out.println("Pilih operasi: ");
                    pilihan = scanInt.nextInt();

                    switch (pilihan) {
                        case 1:
                            gudang.lihatBarangTeratas();
                            break;
                        case 2:
                            gudang.lihatBarangTerbawah();
                            break;
                    }
                    break;

                case 5:
                System.out.println("1.  Pencarian berdasarkan Nama ");  
                System.out.println("2.  Pencarian berdasarkan Kode ");  
                System.out.println("pilih operasi pencarian ");
                int cari = scanInt.nextInt();

                switch (cari) {
                    case 1:
                        System.out.println("Masukkan nama barang yang dicari ");
                        String carinama = scanString.nextLine();
                        gudang.cariNama(carinama, 0);

                        break;
                    case 2:
                        System.out.println("Masukkan kode barang yang dicari ");
                        int carikode = scanInt.nextInt();
                        gudang.cariKode(carikode, 0);

                        break;
                }
                break;

                case 6:
                System.out.println("TERIMAKASIH!");
                break;

                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
                    break;
            }
        }
    }
}