public class insertionathead{
    static Node head;

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void insertathead(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    public void insertattail(int data){
        Node newnode=new Node(data);
        if(head==null){
            head = new Node(data);
            return;
        }
        newnode.next=null;
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=newnode;

    }

    public static void main(String[] args) {
        insertionathead l1=new insertionathead();
        l1.insertathead(56);
        l1.insertathead(67);
        l1.print(head);
        l1.insertattail(78);
        l1.print(head);
    }
}
    