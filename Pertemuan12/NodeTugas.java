package Pertemuan12;

public class NodeTugas {
    String nama;
    int nomor;
    NodeTugas prev;
    NodeTugas next;

    public NodeTugas() {

    }

    public NodeTugas(NodeTugas prev, int nomor, String nama, NodeTugas next) {
        this.prev = prev;
        this.nomor = nomor;
        this.nama = nama;
        this.next = next;
    }
}
