class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}


public class middle_of_LL {
    
    public static Node deleteMiddle(Node head)
    {
        /*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/


        Node s=head;
        Node f= head;
        if(head==null) 
        {
            return head;
        }
        if(head.next==null)
        {   head=null;
            return head;
        }
        if(head.next.next==null)
        {
            head.next=null;
            return head;
        }
        
        while(f!=null && f.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        
        
        s.data=s.next.data;
        s.next=s.next.next;
        return head;
        // This is method only submission.
        // You only need to complete the method.
    
}
    

    public static Node middleNode(Node head) {
        //find size
        Node current=head;
        int size=0;
        Node temp=head;
        while(current!=null)
        {   size++;
            current=current.next;
        }

        int mid=(0+(size-1))/2;
        for(int i=1;i<=mid;i++)
        {
            temp=temp.next;
        }
        if((size-1)%2==0) return temp;
        else return temp.next;

        //slow fast approach
       /* ListNode s=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            s=s.next;
            fast=fast.next.next;
        }
        return s;*/ 
        
        
    }
    public static void printlist(Node head)
    {
        Node temp=head;

        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;

        }
        System.out.println();


    }
    public static void main(String[] args) {
         Node n1= new Node(10);
        Node n2= new Node(20);
        Node n3= new Node(30);
        Node n4= new Node(40);
        Node n5= new Node(50);
        Node n6= new Node(60);
        n1.next=n2; n2.next=n3;n3.next=n4;n4.next=n5;n5.next=n6;n6.next=null;
        printlist(n1);
        System.out.println(" ");
        // Node n= middleNode(n1);
        // System.out.println(n.data);
        Node n=deleteMiddle(n1);
        System.out.println(n);
        printlist(n);
    }

    
}
