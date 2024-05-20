package QUIZ2;

public class MotoGPSLL {
    Node head, tail;

    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(String nama, int point) {
        Node newNode = new Node(nama, point, null);

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void print() {
        Node current = head;
        System.out.println("Klasemen MotoGP:");
        int posisi = 1;
        while (current != null) {
            System.out.println(posisi + ". " + current.nama + " - " + current.point);
            current = current.next;
            posisi++;
        }
    }
    public void bubbleSort() {
        boolean sort = false;
        Node currentNode, nextNode;

        while (!sort) {
            sort = true;
            currentNode = head;
            nextNode = currentNode.next;

            while (nextNode != null) {
                if (currentNode.point < nextNode.point) {
                    int tempPoint = currentNode.point;
                    String tempNama = currentNode.nama;
                    currentNode.point = nextNode.point;
                    currentNode.nama = nextNode.nama;
                    nextNode.point = tempPoint;
                    nextNode.nama = tempNama;
                    sort = false;
                }
                currentNode = nextNode;
                nextNode = nextNode.next;
            }
        }
    }
}