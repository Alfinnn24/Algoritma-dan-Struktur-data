package Pertemuan13;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray16 bta = new BinaryTreeArray16();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxlast = 6;
        bta.populateData(data, idxlast);
        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");

    }    
}
