package UTS;

public class nilaiMahasiswa {
    mahasiswa[] listnilai;
    int idx;

    public nilaiMahasiswa() {
        listnilai = new mahasiswa[17];
        idx = 0;
    }
    //method tampil()
    void tampil() {
        for (int i = 0; i < listnilai.length; i++)
            listnilai[i].tampildata();
    }
    //method tambah()
    void tambah(mahasiswa m) {
        if (idx < listnilai.length) {
            listnilai[idx] = m;
            idx++;
        } else
            System.out.println("Array penuhu");
    }
    //method binarysearchasce()
    public int FindBinarySearchascen(int cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (cari == listnilai[mid].nilai) {
                return mid;
            }
            if (cari < listnilai[mid].nilai) {
                return FindBinarySearchascen(cari, left, mid - 1);
            }
            return FindBinarySearchascen(cari, mid + 1, right);
        }
        return -1;
    }
    //method binarysearchdescen()
    public int FindBinarySearchdescen(int cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (cari == listnilai[mid].nilai) {
                return mid;
            }
            if (cari > listnilai[mid].nilai) {
                return FindBinarySearchdescen(cari, left, mid - 1);
            }
            return FindBinarySearchdescen(cari, mid + 1, right);
        }
        return -1;
    }
    //method tampilposisi()
    public void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data: " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data: " + x + " tidak ditemukan!");
        }
    }
    //method selectionsortascen()
    void selectionSortAscen() {
        for (int i = 0; i < listnilai.length; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listnilai.length; j++) {
                if (listnilai[j].nilai < listnilai[idxMin].nilai) {
                    idxMin = j;
                }
            }
            //swap
            mahasiswa temp = listnilai[idxMin];
            listnilai[idxMin] = listnilai[i];
            listnilai[i] = temp;
        }
    }
    //method selectionsortdescen
    void selectionSortDescen() {
        for (int i = 0; i < listnilai.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < listnilai.length; j++) {
                if (listnilai[j].nilai > listnilai[idxMax].nilai) {
                    idxMax = j;
                }
            }
            //swap
            mahasiswa tmp = listnilai[idxMax];
            listnilai[idxMax] = listnilai[i];
            listnilai[i] = tmp;
        }
    }

}
