package stack;

public class Stack {

    Node top;

    public void push(int value){
            Node newNode = new Node(value);
            newNode.next=top;
            top = newNode;
    }
    public int pop(){
        Node temp = top;
        top = top.next;
        return temp.value;
    }
    public int peek(){
        return top.value;
    }
    public void printStack(){
        System.out.println(top);
    }

}
