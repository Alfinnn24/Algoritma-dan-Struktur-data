package Pertemuan3;

public class LimasSegiEmpat16 {
    public double panjangSisiAlas, tinggiLimas;

    public LimasSegiEmpat16(double psa, double tl) {
        panjangSisiAlas = psa;
        tinggiLimas = tl;
    }
    public double hitungLuasPermukaan() {
        double luasAlas = panjangSisiAlas*panjangSisiAlas;
        double luasSisiTegak = 0.5*panjangSisiAlas*tinggiLimas;
        return luasAlas + (4 *luasSisiTegak);
    }
    public double hitungVolume() {
        double luasAlas = panjangSisiAlas*panjangSisiAlas;
        return 0.33*luasAlas*tinggiLimas;
    }
}

