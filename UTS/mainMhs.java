package UTS;

public class mainMhs {
    public static void main(String[] args) {    
        nilaiMahasiswa maha = new nilaiMahasiswa(); 
        int jumMaha=17;

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

        

        maha.tambah(m1);
        maha.tambah(m2);
        maha.tambah(m3);
        maha.tambah(m4);
        maha.tambah(m5);
        maha.tambah(m6);
        maha.tambah(m7);
        maha.tambah(m8);
        maha.tambah(m9);
        maha.tambah(m10);
        maha.tambah(m11);
        maha.tambah(m12);
        maha.tambah(m13);
        maha.tambah(m14);
        maha.tambah(m15);
        maha.tambah(m16);
        maha.tambah(m17);

        
        

        //Sebelum Sorting
        maha.tampil();
        int posisisebelum =maha.FindBinarySearchasce(5, 0, jumMaha -1);
        maha.tampilPosisi(5, posisisebelum );

        //Sorting ascending
        maha.selectionSortAscen();
        maha.tampil();
        int posisiAscending = maha.FindBinarySearchasce(5, 0, jumMaha -1);
        maha.tampilPosisi(5, posisiAscending);

        //Sorting Descendinf
        maha.selectionSortDescen();
        maha.tampil();
        int  posisiDescending= maha.FindBinarySearchdesce(5, 0, jumMaha-1);
        maha.tampilPosisi(5, posisiDescending);

        maha.selectionSortAscen();
        maha.tampil();
        int posisitidak = maha.FindBinarySearchasce(49, 0, jumMaha-1);
        maha.tampilPosisi(49, posisitidak);
       
        
    }
    
}

