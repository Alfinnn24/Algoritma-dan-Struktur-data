package Pertemuan12;

import java.util.Scanner;

public class DLLTugasMain {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        DLLTugas dll = new DLLTugas();

        do {
            dll.menu(); 
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("------------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("------------------------------");
                    System.out.println("Nomor Antrian: ");
                    int nomor = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nama Penerima: ");
                    String nama = sc.nextLine();
                    dll.add(nomor, nama);
                    break;

                case 2:
                    dll.remove();
                    break;

                case 3:
                    dll.print();
                    break;

                case 4:
                    System.exit(4);
                    break;
            
                default:
                    System.out.println("Pilihan yang anda masukkan salah, silahkan coba lagi\n");
                    break;
            }
        } while (true);
    }
}