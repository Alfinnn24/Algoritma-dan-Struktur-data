package Pertemuan3;

public class Kerucut16 {
    double jarijari, sisiMiring;

    public Kerucut16(double jj, double sm) {
        jarijari = jj;
        sisiMiring = sm;
    }
    public double hitungLuasPermukaan() {
        return Math.PI * jarijari * jarijari + sisiMiring;
    }
    public double hitungVolume() {
        double tinggi = tinggi = 2;
        return 1/3 * Math.PI * Math.pow(jarijari, jarijari) * tinggi;

    }
    
}
