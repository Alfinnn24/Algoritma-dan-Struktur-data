package Pertemuan3;

public class Balok16 {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok16() {
        
    }

    public Balok16(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume() {
        return panjang*lebar*tinggi;
    }
    public static void main(String[] args) {
        Balok16[] blArray = new Balok16[3];
        blArray[0] = new Balok16(100, 30, 12);
        blArray[1] = new Balok16(120, 40, 15);
        blArray[2] = new Balok16(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());
        }
    }
    
}
