package Pertemuan3;

public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
    public double hitungKeliling() {
        return alas+tinggi;
    }

    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[4];

        for (int i = 0; i < 4; i++) {
            
        }
    }
    
}
