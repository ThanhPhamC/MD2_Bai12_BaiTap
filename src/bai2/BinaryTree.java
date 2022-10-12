package bai2;

public class BinaryTree {
    private TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode insertNode(TreeNode current, int value) {
        if (current == null) {
            current = new TreeNode(value);
            return current;
        } else {
            if (value < current.getValue()) {
                current.setLeft(insertNode(current.getLeft(), value));
                return current;
            } else if (value > current.getValue()) {
                current.setRight(insertNode(current.getRight(), value));
                return current;
            }else {
                return current;
            }
        }
    }
    public void insert(int value){
        this.root=insertNode(this.root,value);
    }
    public void postOder(TreeNode node){
        if (node!=null){
            postOder(node.getLeft());
            postOder(node.getRight());
            System.out.println(node.getValue()+"");
        }
    }

    public TreeNode searchNode(TreeNode node, int key){
        if (node==null) {
            return null;
        } if (key==node.getValue()) {
            return node;
        } else if (key>node.getValue()) {
            return searchNode(node.getRight(),key);
        } else {
            return searchNode(node.getLeft(),key);
        }
    }
    public void delete(int key){
        deleteNode(this.root,key);
    }

    private void deleteNode(TreeNode node, int key) {
        searchNode(node,key);
        if (node.getLeft()==null && node.getRight()==null) {
            delete(key);
        }
    }
}
