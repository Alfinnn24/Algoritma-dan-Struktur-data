package Pertemuan11;

public class SLLMainQueue {
    public static void main(String[] args) {
        SLLQueue SLLQ = new SLLQueue();

        SLLQ.addLast(new Tugas2(111, "Anton"));
        SLLQ.addLast(new Tugas2(112, "Prita"));
        SLLQ.addLast(new Tugas2(113, "Yusuf"));
        SLLQ.addLast(new Tugas2(114, "Doni"));
        SLLQ.addLast(new Tugas2(115, "Sari"));
        System.out.println("================================");
        SLLQ.displayQueue();
        System.out.println("================================");
        System.out.println("Dequeue: ");
        SLLQ.Dequeue();
        SLLQ.Dequeue();
        System.out.println("================================");
        SLLQ.displayQueue();
        System.out.println("================================");
    }
}
