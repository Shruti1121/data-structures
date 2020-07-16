import java.util.Scanner;

public class SinglyLS {
    Node start;
    class Node{
        int val;
        Node next;
       public void Node(int d){
            val=d;
            next= null;
        }
    }
  public void SinglyLS(){
        start= null;
    }
    public void addBeg(int val)
    {
        Node p;
        if(start== null)
            {
                start= new Node();
                start.val= val;
                start.next= null;
            }
            else {
                p= new Node();
                p.val=val;
                p.next= start;
                start=p;
            }
        }
        public void addLast(int val){
            Node p;
            if(start== null)
            {
                start= new Node();
                start.val= val;
                start.next= null;
            }
            else{
                Node i;
                Node q = new Node();
                i= start;
                while(i.next!=null){
                    i= i.next;
                }
                q.val= val;
                q.next= null;
                i.next= q;

            }
        }
public void addMid(int val, int pos ){
    Node j, p;
    p= new Node();
    if(start== null)
    {
        start= new Node();
        start.val= val;
        start.next= null;
    }
    else{
        Node runner= start;
        for (int i = 0; i < pos-1; ++i) {
            runner = runner.next;
        }
        p.val=val;
        p.next= runner.next;
        runner.next= p;

    }
}
public void del(int val){
        Node i= start, preTemp= start,p;
        if(start== null)
            System.out.println("LIST IS EMPTY");
        else if(start.val== val)
        {
         p=start;
         start=start.next;
         p=null;
        }
        else {
            while (i.val != val) {
                preTemp = i;
                i = i.next;
            }
            preTemp.next = i.next;
            i = null;
        }
}
public void search(int s){
        Node i= start;
        while(i!= null)
            if(i.val==s)
            {
                System.out.println("Found");
                break;
            }
        if(i==null)
            System.out.println("NUMBER NOT FOUND");
}
    public void display() {
        Node current = start;

        if(start == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            System.out.print(current.val+ " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
       SinglyLS ob= new SinglyLS();

       ob.addBeg(12);
       ob. addBeg(11);
       ob.addLast(13);
       ob.addMid(14,1);
       ob.addLast(21);
       ob.del(13);
       ob.search(13);
       ob.display();
    }
}
