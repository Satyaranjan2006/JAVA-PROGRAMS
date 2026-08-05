package LinkedList.doubleLinkedList.insertion;

class Node{
    int data;
    Node next,prev;

    Node(int x){
        data=x;
        next=prev=null;
    }
}

public class addAtFront {
    public static void main(String[] args) {
        // 8 <-> 3 <->2 <-> 5 
        Node head=new Node(8);
        head.next=new Node(3);
        head.next.prev=head;
        head.next.next=new Node(2);
        head.next.next.prev=head.next;
        head.next.next.next=new Node(5);
        head.next.next.next.prev=head.next.next;

        int x=1;
        head=addatFront(head,x);
        printData(head);

    }

    public static Node addatFront(Node head,int x){

        //new node created
        Node newNode=new Node(x);
        newNode.next=head;
        if(head!=null){
            head.prev=newNode;

        }
        return newNode;

    }

    public static  void printData(Node head){
         Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("<->");
            }
            temp=temp.next;
        }
        System.out.println( );
    }
}

