package Pertemuan3;

public class Bola16 {
    double jarijari;
    double phi = 3.14;

    public Bola16(double jj) {
        jarijari = jj;
    }
    public double hitungLuasPermukaan() {
        return 4*Math.PI*jarijari*jarijari;
    }
    public double hitungVolume() {
        return 4/3*Math.PI*jarijari*jarijari*jarijari;
    }
}
