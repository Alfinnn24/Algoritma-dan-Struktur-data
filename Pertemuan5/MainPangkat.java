package Pertemuan5;

import java.util.Scanner;

public class MainPangkat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=====================");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        Pangkat16[] png = new Pangkat16[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkatan: ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat16(nilai, pangkat);
            
        }

        System.out.println("========================");
        System.out.println("|1. Brute Force        |");
        System.out.println("|1. Devide and Conquer |");
        System.out.println("========================");
        System.out.println("Masukkan Pilihan Anda! (1/2): ");
        int Pilihan = sc.nextInt();


        switch (Pilihan) {
            case 1:
            System.out.println("HASIL PANGKAT - BRUTE FORCE");
            for (int i = 0; i < elemen; i++) {
                System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                        + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }
                break;
            case 2:
            System.out.println("HASIL PANGKAT - DEVIDE CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
        break;
            default:
     System.out.println("Pilihan Tidak Valid!");           
    }
    sc.close();
    }
}
