package LinkedList;


class Node{
    int data;
    //here next contains the reference of the value.so its datatype is Node
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class insertFront {
    public static void main(String[] args) {
        Node head=new Node(2);
        head.next=new Node(3);
        head.next.next=new Node(4);
        head.next.next.next=new Node(5);

        //now take variable
        int x=1;
        //now run function
        head=insertAtFront(head,x);

        printdata(head);

    }

    public static Node insertAtFront(Node head,int x){
        Node newNode=new Node(x);
        newNode.next=head;
        if(head==null){return head;}
        return newNode;
        

    }
     //printing the data
    public static void printdata(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("->");
            }
            temp=temp.next;
        }
        System.out.println( );

    }
}
