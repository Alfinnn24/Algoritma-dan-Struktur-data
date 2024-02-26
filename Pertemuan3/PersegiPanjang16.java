package Pertemuan3;

import java.util.Scanner;

public class PersegiPanjang16 {
    public int panjang;
    public int lebar;
    static int i;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang16[] ppArray = new PersegiPanjang16[3];

        for (int i = 0; i < 3; i++) {
            ppArray[i] = new PersegiPanjang16();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }

}
