package LinkedList;
//class Node{
//    int val;
//    Node  next;
//    Node(int val) {
//        this.val = val;
//        this.next=null;
//    }
//}
//class LinkedList {
//    Node head;
//
//    int getkth(int k){
//        if(head==null) return -1;
//        Node slow = head;
//        Node fast = head;
//       for(int i=1; i<=k;i++){
//           if(fast==null) return -1;
//           fast=fast.next;
//       }
//       while (fast!=null){
//           slow=slow.next;
//           fast=fast.next;
//       }
//        return slow.val;
//    }
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
//
//}
//
//public class KthFromEnd {
//    public static void main(String[] args) {
//        LinkedList  ll= new LinkedList();
//        ll.insert(20);
//        ll.insert(30);
//        ll.insert(40);
//        ll.insert(50);
//        ll.insert(60);
//        ll.display();
//        int ans =ll.getkth(3);
//        System.out.println(ans);
//    }
//}