package Pertemuan6;

public class DaftarMahasiswaBerprestasi16 {
    Mahasiswa16 listMhs[] = new Mahasiswa16[5];
    int idx;

    //method tambah()
    void tambah(Mahasiswa16 m){
        if (idx<listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
    //method tampil()
    void tampil(){
        for (Mahasiswa16 m: listMhs) {
            m.tampil();
            System.out.println("================================");
        }
    }
    //method bubblesort()
    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    //dibawah ini proses swap atau penukaran
                    Mahasiswa16 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
    //method selectionsort()
    void selectionSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin = 1;
            for (int j = i+1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            //swap
            Mahasiswa16 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }

    }
    //method insertionsort()
    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa16 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].ipk < temp.ipk) { //perubahannya disini
                listMhs[j] = listMhs[j- 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

}
