package Pertemuan3;

public class LimasSegiEmpat16 {
    double panjangSisiAlas, tinggiLimas;

    public LimasSegiEmpat16(double psa, double tl) {
        panjangSisiAlas = psa;
        tinggiLimas = tl;
    }
    public double hitungLuasPermukaan() {
        return panjangSisiAlas*panjangSisiAlas+4+1/2*panjangSisiAlas*tinggiLimas;
    }
    public double hitungVolume() {
        return 1/3*panjangSisiAlas*panjangSisiAlas*tinggiLimas;
    }
}

