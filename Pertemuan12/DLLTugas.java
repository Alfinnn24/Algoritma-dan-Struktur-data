package Pertemuan12;

public class DLLTugas {
    NodeTugas head;
    int size;

    public DLLTugas() {
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void add(int nomor, String nama) throws Exception {
        if (isEmpty()) {
            head = new NodeTugas(null, nomor, nama, null);
            size++;
        }else {
            NodeTugas current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeTugas newNode = new NodeTugas(current, nomor, nama, null);
            current.next = newNode;
            size++;
        }
    }

    public void remove() throws Exception{
        if (isEmpty()) {
            throw new Exception("Antrian kosong");
        }else if (head.next == null) {
            System.out.println(head.nama + " sudah divaksinasi");
            head = null;
            size--;
        }else{
            NodeTugas current = head;
            System.out.println(current.nama + " sudah divaksinasi");
            current = current.next;
            current.prev = null;
            head = current;
            size--;
        }

}

public void print(){
    if (!isEmpty()) {
        NodeTugas current = head;
        System.out.println("|" + "No." + "\t | " + "Nama" +  "\t|" );
        while (current != null) {
            System.out.println("|" + current.nomor + "\t | " + current.nama + " |" );
            current = current.next;
        }
        System.out.println("sisa antrian : " + size);
    }else{
        System.out.println("Linked list kosong");
    }
}
    public static void menu() {
        System.out.println("\n++++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("++++++++++++++++++++++++++++++\n");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("++++++++++++++++++++++++++++++");
    }
}