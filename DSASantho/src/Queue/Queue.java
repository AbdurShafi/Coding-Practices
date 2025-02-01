package Queue;

public class Queue {
    Node start;
    Node end;

     public void enqueue(int value){
         Node newNode = new Node(value);
         if(end==null){
             end = newNode;
             start = newNode;
         }
         else{
             end.next = newNode;
             end= newNode;
         }
     }
     public int dequeue(){
         if(start == null){
             System.out.println("Queue is Empty da ");
             return -1;
         }
         if(start == end){
             Node temp = start;
             start = null;
             end = null;
             return temp.value;
         }
         else{

             Node temp = start;
             start = start.next;
             return temp.value;
         }
     }
     public void printQueue(){
         System.out.println(start);
     }
     public int peek(){
         return start.value;
     }
}
