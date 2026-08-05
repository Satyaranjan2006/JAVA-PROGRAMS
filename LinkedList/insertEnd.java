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

public class insertEnd {
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);

        //now take variable
        int x=5;
        //now run function
        head=insertAtEnd(head,x);

        printdata(head);

    }

    public static Node insertAtEnd(Node head,int x){
        Node newNode=new Node(x);
        
        if(head==null){return head;}
        Node last=head;

        while(last.next!=null){
            last=last.next;
        }
        //main part
        last.next=newNode;
        return head;

        

    }

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
