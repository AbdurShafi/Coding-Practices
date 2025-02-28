package Tree;

public class Tree {

    public Node root;

    public void insertNode(int value, Node root){
        if(this.root==null){
            Node newNode = new Node(value);
            this.root = newNode;
        }
        else{
            if(value < root.value){
               if(root.left == null){
                   Node newnode = new Node(value);
                   root.left =  newnode;
               }
               else{
                   insertNode(value,root.left);
               }
            }
            else{
                if(root.right == null){
                    Node newNode = new Node(value);
                    root.right = newNode;
                }
                else{
                    insertNode(value,root.right);
                }
            }
        }
    }
    private Node delete(int value, Node root){
        if(root == null){
            System.out.println("No element found");
            return root;
        }
        if(value < root.value){
            root.left = delete(value, root.left);
        } else if (value > root.value) {
            root.right = delete(value, root.right);
        }
        else{
            if(root.left == null && root.right == null) return null;
            if(root.left == null)   return root.right;
            if(root.right == null)   return root.left;
            Node replaceValue = root.left;
            while(replaceValue.right != null)   replaceValue = replaceValue.right;
            root.value = replaceValue.value;
            root.left = delete(root.value, root.left);
        }
        return root;
    }
    public void deleteNode(int value){
        this.root = delete(value, this.root);
    }

    public void print(){
        System.out.println(root);
    }
    public void inorder(){
        inOrderInternal(this.root);
        System.out.println();
    }

    private void inOrderInternal(Node root) {
        if(root == null)    return;
        inOrderInternal(root.left);
        System.out.print(root.value + " ");
        inOrderInternal(root.right);
    }
    public void preOrder(){
        preOrderInternal(this.root);
        System.out.println();
    }

    private void preOrderInternal(Node root) {
        if(root == null)    return;
        System.out.print(root.value + " ");
        preOrderInternal(root.left);
        preOrderInternal(root.right);
    }
    public void postOrder(){
        postOrderInternal(this.root);
        System.out.println();
    }

    private void postOrderInternal(Node root) {
        if(root == null)    return;
        postOrderInternal(root.left);
        postOrderInternal(root.right);
        System.out.print(root.value + " ");
    }
    public void MaxDepthFind(){
        int n =MaxDepth(this.root);
        System.out.println(n);
    }
    private int MaxDepth(Node root){
         if(root == null) return 0;

         int maxlt = MaxDepth(root.left);
         int maxrt = MaxDepth(root.right);

         return 1+Math.max(maxlt,maxrt);
    }

}
