package Pertemuan5;

import java.util.Scanner;

public class MainFaktorial {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================");
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();

        Faktorial16[] fk = new Faktorial16[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial16();
            System.out.println("Masukkan nilai data ke-" + (i+1) + ":");
            int iNilai = sc.nextInt();
            fk[i].nilai = iNilai;
        }

        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah "+ fk[i].FaktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL - DEVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan Devide and Conquer adalah "+ fk[i].FaktorialDC(fk[i].nilai));
 }
}
}
