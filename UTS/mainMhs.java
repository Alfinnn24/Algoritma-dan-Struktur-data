package UTS;

public class mainMhs {
    public static void main(String[] args) {    
        nilaiMahasiswa mhs = new nilaiMahasiswa(); 
        int JmlMhs=17;

        mahasiswa m1 = new mahasiswa(33);
        mahasiswa m2 = new mahasiswa(7);
        mahasiswa m3 = new mahasiswa(32);
        mahasiswa m4 = new mahasiswa(7);
        mahasiswa m5 = new mahasiswa(5);
        mahasiswa m6 = new mahasiswa(49);
        mahasiswa m7 = new mahasiswa(45);
        mahasiswa m8 = new mahasiswa(41);
        mahasiswa m9 = new mahasiswa(11);
        mahasiswa m10 = new mahasiswa(25);
        mahasiswa m11 = new mahasiswa(22);
        mahasiswa m12 = new mahasiswa(19);
        mahasiswa m13 = new mahasiswa(24);
        mahasiswa m14 = new mahasiswa(45);
        mahasiswa m15 = new mahasiswa(31);
        mahasiswa m16 = new mahasiswa(47);
        mahasiswa m17 = new mahasiswa(16);

        

        mhs.tambah(m1);
        mhs.tambah(m2);
        mhs.tambah(m3);
        mhs.tambah(m4);
        mhs.tambah(m5);
        mhs.tambah(m6);
        mhs.tambah(m7);
        mhs.tambah(m8);
        mhs.tambah(m9);
        mhs.tambah(m10);
        mhs.tambah(m11);
        mhs.tambah(m12);
        mhs.tambah(m13);
        mhs.tambah(m14);
        mhs.tambah(m15);
        mhs.tambah(m16);
        mhs.tambah(m17);

        
        

        //Sebelum Sorting
        mhs.tampil();
        int posisisebelum =mhs.FindBinarySearchasce(5, 0, JmlMhs -1);
        mhs.tampilPosisi(5, posisisebelum );

        //Sorting ascending
        mhs.selectionSortAscen();
        mhs.tampil();
        int posisiAscending = mhs.FindBinarySearchasce(5, 0, JmlMhs -1);
        mhs.tampilPosisi(5, posisiAscending);

        //Sorting Descendinf
        mhs.selectionSortDescen();
        mhs.tampil();
        int  posisiDescending= mhs.FindBinarySearchdesce(5, 0, JmlMhs -1);
        mhs.tampilPosisi(5, posisiDescending);

        mhs.selectionSortAscen();
        mhs.tampil();
        int posisitidak = mhs.FindBinarySearchasce(49, 0, JmlMhs -1);
        mhs.tampilPosisi(49, posisitidak);
       
        
    }
    
}

