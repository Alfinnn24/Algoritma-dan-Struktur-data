package Pertemuan6;

public class HotelService16 {
    Hotel16 rooms[] = new Hotel16[5];
    int idx;

    //method tambah()
    void tambah(Hotel16 H){
        if (idx<rooms.length) {
            rooms[idx] = H;
            idx++;
        }else{
            System.out.println("Hotel sudah penuh!!");
        }
        
    }
    //method tampil()
    void tampilAll(){
        for (Hotel16 H: rooms) {
            H.tampilAll();
            System.out.println("================================");
        }
    }
    //method bubblesort()
    void bubbleSort(){
        for (int i = 0; i < rooms.length-1; i++) {
            for (int j = 1; j < rooms.length-i; j++) {
                if (rooms[j].harga < rooms[j-1].harga) {
                    //dibawah ini proses swap atau penukaran
                    Hotel16 temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
    }
    //method selectionsort()
    void selectionSort(){
        for (int i = 0; i < rooms.length-1; i++) {
            int idxMin = 1;
            for (int j = i+1; j < rooms.length-i; j++) {
                if (rooms[j].bintang > rooms[idxMin].bintang) {
                    idxMin = j;
                }
            }
            //swap
            Hotel16 temp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = temp;
        }

    }

}
