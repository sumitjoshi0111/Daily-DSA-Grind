//created Node Stucture/class:
class Node
{
    int data;
    Node next;
    Node(int data)
    {   this.data=data;
        

    }

}

public class CreateOperation {
    public static void main(String[] args) {

        Node n1=new Node(10);
        Node n2 =new Node(20);
        Node n3=new Node(30);
        Node n4= new Node(40);
        Node n5=new Node(50);
        Node n6 =new Node(60);
        n1.next=n2; n2.next=n3;n3.next=n4;n4.next=n5;n5.next=n6;n6.next=null;

        System.out.println(n1);
         System.out.println(n1.next);//n2
          System.out.println(n1.next.next);//n3
           System.out.println(n1.next.next.next.data);//n4.data

           //Traversing

          
        
    }
    
}
