package Pertemuan15;

public class DoubleLinkedList {
    Node16 head;
    int size;

    public DoubleLinkedList(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int item, int jarak){
        if (isEmpty()) {
            head = new Node16(null, item, jarak, null);
        } else {
            Node16 newNode = new Node16(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int getJarak(int index)throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("NIlai index di luar batas");
        }
        Node16 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public void remove(int index){
       Node16 current = head;
       while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
       }
        size--;
    }

    public int size(){
        return size;
    }

    public int get(int index)throws Exception{
        if (index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        Node16 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void clear(){
        head = null;
        size = 0;
    }
    public void updateJarak(int tujuan, int jarakBaru) throws Exception {
        Node16 current = head;
        boolean cek = false;
        while (current != null) {
            if (current.data == tujuan) {
                current.jarak = jarakBaru;
                cek = true;
                break;
            }
            current = current.next;
        }
        if (!cek) {
            throw new Exception("Tujuan tidak ditemukan dalam daftar");
        }
    }
}
