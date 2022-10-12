package bai2;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.insert(8);
        binaryTree.insert(3);
        binaryTree.insert(10);
        binaryTree.insert(9);
        binaryTree.insert(15);
        binaryTree.postOder(binaryTree.getRoot());
    }
}
