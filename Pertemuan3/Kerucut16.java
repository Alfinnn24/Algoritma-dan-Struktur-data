package Pertemuan3;

public class Kerucut16 {
    public double jarijari, sisiMiring;

    public Kerucut16(double jj, double sm) {
        jarijari = jj;
        sisiMiring = sm;
    }
    public double hitungLuasPermukaan() {
        return Math.PI * jarijari * (jarijari + sisiMiring);
    }
    public double hitungVolume() {
        double tinggi = Math.sqrt((sisiMiring * sisiMiring) - (jarijari * jarijari));
        return 0.33 * Math.PI * jarijari * jarijari * tinggi;

    }
    
}
