package Pertemuan3;

import java.util.Arrays;
import java.util.Scanner;

public class MainMhs16 {
    
    static double ipkTerbesar(double nilai[]) {
        Arrays.sort(nilai);
        return nilai[nilai.length - 1];
    }
    static double rataIpk(double ipk[]) {
        double jml = 0;
        for (int i = 0; i < 3; i++) {
            jml += ipk[i];
        }
        return jml/3;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        double[] nilai = new double[3];
        Mahasiswa16[] mhs = new Mahasiswa16[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Mahasiswa ke-" +(i+1));
            System.out.print("Masukkan nama: ");
            String nm = input.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();
            System.out.print("Masukkan Jenis Kelamin (L/P): ");
            String jk = input.nextLine();
            System.out.print("Masukkan IPK: ");
            double ipk = input.nextDouble();
            System.out.println();

            mhs[i] = new Mahasiswa16(nm, nim, jk, ipk);
            nilai[i] = mhs[i].ipk;

            input.nextLine();
        }
        System.out.println("============================");
        System.out.println("||  Rekap Data Mahasiswa  ||");
        System.out.println("============================");

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("Nama\t\t: "+ mhs[i].nama +"\nNIM\t\t: "+ mhs[i].nim +"\nJenis Kelamin\t: "+ mhs[i].jenisKelamin.toUpperCase() +"\nIPK\t\t: "+mhs[i].ipk);
            System.out.println();
        }
        System.out.println("========================");
        System.out.printf("||Rata-Rata IPK\t= %.2f||", rataIpk(nilai));
        System.out.println("\n||IPK Tertinggi\t= "+ ipkTerbesar(nilai) + " ||");
        System.out.println("========================");
    }
}
