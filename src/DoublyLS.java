public class DoublyLS {
    Node start;
    class Node{
        int val;
        Node prev;
        Node next;
        public void Node(int val){
            val= val;
            next=null;
            prev=null;
        }
    }
    public void addBeg(int val){//Unshift
        if(start==null){
            start=new Node();
            start.val=val;
            start.next=null;
            start.prev=null;
        }
        else{
            Node p= new Node();
            p.val= val;
            p.next= start;
            start.prev= p;
            p.prev= null;
            start= p;
        }
    }
    public void display(){
        if(start== null)
            return;
        else{
            Node i= start;
            while(i!= null){
                System.out.println(i.val);
            i=i.next;}
        }
    }
    public void addEnd(int val){          // PUSH
     if(start== null){
         start= new Node();
         start.val=val;
         start.next= null;
         start.prev= null;
     }else{
         Node i=start;
         while(i.next!=null){
             i=i.next;
         }
         Node p= new Node();
         p.val= val;
         i.next= p;
         p.prev= i;
         p.next= null;
     }
    }
    public void addMid(int val, int index) {
        Node i = start, j= start;
        Node p= new Node();
        int len = 0;
        while (i.next != null) {
            if(len== index) {
                j = i.prev;
            }
            len++;
            i = i.next;
        }
        if(index<0 || index> len)
            return;
        else{
            p.val=val;
            i= j.next;
         j.next= p;
         p.next=i;
         p.prev= j;
            }
        }
        public void delLast() {  //POP
            if (start == null)
                return;
            if (start.next == null)
                start = null;
            else {
                Node i = start;
                while (i.next != null) {
                    i = i.next;
                }
                i = i.prev;
                i.next = null;
            }
        }
        public void delBeg(){//Shift
            Node i = start;
            if (start == null)
                return;
            if (start.next == null)
                start = null;
            else {
                start= start.next;
                start.prev= null;
            }
        }
    public static void main(String[] args) {
        DoublyLS ob= new DoublyLS();
        ob.addBeg(12);
        ob.addBeg(11);
        ob.addBeg(13);
        ob.addEnd(16);
        ob.addMid(34, 2);
        ob.delLast();
        ob.delBeg();
        ob.display();
    }
}
