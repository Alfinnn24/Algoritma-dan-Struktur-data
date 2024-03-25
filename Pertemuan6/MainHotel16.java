package Pertemuan6;

public class MainHotel16 {
    public static void main(String[] args) {
        
        HotelService16 rooms = new HotelService16();
        Hotel16 H1 = new Hotel16("alfin jaya" , "probolinggo", 500000, 5);
        Hotel16 H2 = new Hotel16("sari indah", "malang", 200000, 4);
        Hotel16 H3 = new Hotel16("sari baru", "malang", 50000, 2);
        Hotel16 H4 = new Hotel16("sumber rejeki", "probolinggo", 150000, 3);
        Hotel16 H5 = new Hotel16("putra garam", "surabaya", 350000, 4);

        rooms.tambah(H1);
        rooms.tambah(H2);
        rooms.tambah(H3);
        rooms.tambah(H4);
        rooms.tambah(H5);

        System.out.println("Harga hotel sebelum sorting = ");
        rooms.tampilAll();

        System.out.println("Data hotel setelah disorting asc berdasarkan harga");
        rooms.bubbleSort();
        rooms.tampilAll();

        System.out.println("Data hotel setelah disorting desc berdasarkan bintang");
        rooms.selectionSort();
        rooms.tampilAll();
    }
}
