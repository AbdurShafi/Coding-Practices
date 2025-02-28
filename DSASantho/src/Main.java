import Tree.Tree;

public class Main {
    public static void main(String[] args) {
         Tree bst = new Tree();
         bst.insertNode(5, bst.root);
         bst.insertNode(3, bst.root);
         bst.insertNode(2, bst.root);
         bst.insertNode(4, bst.root);
         bst.insertNode(7, bst.root);
         bst.insertNode(6, bst.root);
         bst.insertNode(8, bst.root);
        bst.inorder();
        bst.preOrder();
        bst.postOrder();
        bst.deleteNode(2);
        bst.deleteNode(5);
        bst.print();
        bst.MaxDepthFind();
    }
}