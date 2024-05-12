package Pertemuan11;

import javax.swing.plaf.SliderUI;

public class SLLMainTugas {
    public static void main(String[] args) {
        
        SingleLingkedList16 SLL = new SingleLingkedList16();
        SLL.print();;
        SLL.addFirst(new Mahasiswa16(111, "Anton"));
        SLL.print();;
        SLL.addLast(new Mahasiswa16(112, "Prita"));
        SLL.print();;
        SLL.insertAfter(112, new Mahasiswa16(113, "Yusuf"));
        SLL.print();;
        SLL.insertAfter(113, new Mahasiswa16(114, "Doni"));
        SLL.print();
        SLL.insertAt(4, new Mahasiswa16(115, "Sari"));
        SLL.print();
    }
}
