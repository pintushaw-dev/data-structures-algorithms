package LinkedList;

import java.util.List;

class Node{
    int val;
    Node  next;
    Node(int val) {
        this.val = val;
        this.next=null;
    }
}
class LinkedList {
    Node head;
   static   Node getintersect(Node head1,Node head2){
     int len1=0;
     Node temp1=head1;
     while (temp1!=null){
         temp1=temp1.next;
         len1++;
     }
     int len2=0;
     Node temp2=head2;
     while (temp2!=null){
         temp2=temp2.next;
         len2++;
     }
     temp1=head1; temp2=head2;
     if(len1>len2){
         for(int i=1;i<=len1-len2;i++){
             temp1=temp1.next;
         }
     }
     else{
         for(int i=1;i<=len2-len1;i++){
             temp2=temp2.next;
         }
     }
     while(temp1!=temp2){
         temp1=temp1.next;
         temp2=temp2.next;

     }
     return temp1;
 }
//    void insert(int val){
//        Node newNode=new Node(val);
//        if(head==null) {
//            head=newNode; return;}
//        Node temp=head;
//        while (temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next=newNode;
//
//    }
//    void display(){
//        if(head==null) return;
//        Node temp=head;
//        while (temp !=null) {
//            System.out.print(temp.val + " ");
//            temp=temp.next;
//        }
//        System.out.println();
//    }

}
public class intersection {
    public static void main(String[] args) {
       Node common=new Node(30);
       common.next=new Node(40);
       common.next.next=new Node(50);

       Node headA=new Node(10);
       headA.next=new Node(20);
       headA.next.next=common;

       Node headB=new Node(15);
       headB.next=new Node(25);
       headB.next.next=common;
        Node result=LinkedList.getintersect(headA,headB);
        System.out.println(result.val);



    }
}
