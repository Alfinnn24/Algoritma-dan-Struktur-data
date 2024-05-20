package QUIZ2;

import java.util.Scanner;

public class MotoGPMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MotoGPSLL motoGP = new MotoGPSLL();

        System.out.println("Masukkan data rider:");
        while (true) {
            System.out.print("Nama Rider: ");
            String nama = scanner.nextLine();

            System.out.print("Poin Rider: ");
            int point = scanner.nextInt();
            scanner.nextLine();

            motoGP.addFirst(nama, point);

            System.out.print("Lanjutkan input data rider? (y/n): ");
            String pilih = scanner.nextLine();
            if (!pilih.equals("y")) {
                break;
            }
        }

        System.out.println("\nKlasemen awal:");
        motoGP.print();

        System.out.println("\nKlasemen setelah diurutkan berdasarkan poin:");
        motoGP.bubbleSort();
        motoGP.print();
    }
}