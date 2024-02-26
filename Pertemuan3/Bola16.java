package Pertemuan3;

public class Bola16 {
    double jarijari;

    public Bola16(double jj) {
        jarijari = jj;
    }
    public double hitungLuasPermukaan() {
        return 4*Math.PI*Math.pow(jarijari, jarijari);
    }
    public double hitungVolume() {
        return 4/3*Math.PI*Math.pow(jarijari, 3);
    }
}
