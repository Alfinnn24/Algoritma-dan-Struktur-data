package Pertemuan5;

import java.util.Scanner;

public class MainSum {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("Program menghitung keuntungan total (Satuan juta. Misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc.nextInt();

        

        Sum16 sm = new Sum16(elm);
        System.out.println("============================================================");
        for (int i = 0; i < elm; i++) {
            System.out.print("Masukkan untung bulan ke -"+(i+1)+" = ");
            sm.keuntungan[i] = sc.nextDouble(); 
           
        }
        System.out.println("====================================================");
        System.out.println("Algoritma Brute Force");
        for (int i = 0; i < elm; i++) {
            System.out.println("Total keuntungan perusahaan selama "+sm.elemen+"bulan adalah = "+sm.totalBF(sm.keuntungan)); 
        }
        System.out.println("====================================================");
        System.out.println("Algoritma Devide Conquer");
        for (int i = 0; i < elm; i++) {
            System.out.println("Total keuntungan perusahaan selama "+sm.elemen+"bulan adalah = "+sm.totalDC(sm.keuntungan, 0,sm.elemen-1));    
        }
        
        sc.close();
        
    }
}
