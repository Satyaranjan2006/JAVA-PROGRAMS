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
public class insertBeforeSelNodeElem {
    public static void main(String[] args) {
        Node head=new Node(2);
        head.next=new Node(3);
        head.next.next=new Node(4);
        head.next.next.next=new Node(5);

        //now take variable
        int x=1;
        //now run function
        head=insertBeforeNodeElem(head,4,x);

        printdata(head);

    }
    public static Node insertBeforeNodeElem(Node head,int key,int x){
       //first the exception
       if(head==null){
        return null;
       }
       //if the key is the first node's data that means we have to add the x before first node
      if(head.data==key){
         Node newNode=new Node(x);
        newNode.next=head;
        return newNode;
      }
      Node temp=head;
      Node prev=null;
      while(temp!=null &&temp.data!=key){
        prev=temp;
        temp=temp.next;
      }
      //last main operation
      while(temp!=null){
         Node newNode=new Node(x);
         newNode.next=temp;
         prev.next=newNode;
      }
        return head;

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
