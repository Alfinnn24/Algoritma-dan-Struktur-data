package Pertemuan8;

import java.util.Scanner;

public class Utama16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input kapasitas gudang: ");
        int kap = scanner.nextInt();
        scanner.nextLine();

        Gudang16 gudang = new Gudang16(kap);

        while (true) {
            System.out.println("================================");
            System.out.println("|Menu                          |");
            System.out.println("================================");
            System.out.println("|1. Tambah barang              |");
            System.out.println("|2. Ambil barang               |");
            System.out.println("|3. Tampilkan tumpukan barang  |");
            System.out.println("|4. Keluar                     |");
            System.out.println("================================");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang : ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori : ");
                    String kategori = scanner.nextLine();
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
                    gudang.lihatBarangTeratas();
                    break;

                    default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }

    }
}
