package LinkedList;

public class LinkedList {
    Node head ;
    int size;


    public void insertAtBeg(int value){
        Node newNode = new Node(value);
        newNode.next=head;
        head = newNode;
        size++;
    }

    public void insertAtEnd(int value){
        Node newNode = new Node(value);
        Node temp = head;
        if(head==null){
            head = newNode;

        }
        else {
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }
    public void inserAt(int value , int position){
        Node temp = head;
        int count =1;
        while(temp != null && count < position){
            count++;
            temp = temp.next;
        }
        if(temp==null){
            System.out.println("Invalid Position");
        }
        else{
            Node newNode = new Node(value);
            newNode.next = temp.next;
            temp.next=newNode;
        }

    }
    public void deleteAtBeg(){
        if(head!=null){
            head = head.next;
        }
        else{
            System.out.println("OOPS");
        }

    }

    public void deleteAtEnd(){
        Node temp = head;
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        if(head.next == null){
            head=null;
            return;
        }
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
    public void deleteAt(int pos){
        Node temp = head;
        int count =1;
        if(pos == 0){
            deleteAtBeg();
            return;
        }
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        while(temp.next!=null && count < pos){
            temp = temp.next;
            count++;
        }
        if(temp.next == null){
            System.out.println("Invalid Position");
            return;
        }
        temp.next = temp.next.next;

    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
