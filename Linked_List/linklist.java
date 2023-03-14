package Linked_List;

public class linklist {

    public static class node{
        int data;
        node next;

        public node (int data){
            this.data=data;
            this.next=null;
        }
    }

    public static node head;
    public static node tail;

    public void addFirst(int data){
        node newnode= new node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;

    }

    public void lasadd(int data) {
        node newnode = new node(data);
        if(head==null){
            head=tail=newnode;
            return;

        }
        tail.next=newnode;
        tail=newnode;
    }

    public void printt(){
        node tmp = head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        while (tmp!=null){
            System.out.print(tmp.data+"->");
            tmp=tmp.next;
        }
        System.out.println("null");
    }



    public static void main(String[] args) {
        linklist ls = new linklist();
        ls.addFirst(6);
        ls.addFirst(5);
        ls.addFirst(4);
        ls.lasadd(7);
        ls.lasadd(8);
        ls.lasadd(9);
        ls.printt();
    }
}
