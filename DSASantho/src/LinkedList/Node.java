package LinkedList;

public class Node {
    int value ;
    Node next;

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }

    public Node(int value) {
        this.value = value;
    }
}
