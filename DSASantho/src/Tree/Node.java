package Tree;

public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  value +
                " " + left +
                "  " + right;
    }
}
