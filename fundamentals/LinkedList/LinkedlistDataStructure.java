package LinkedList;
//class Node{
//    int val;
//    Node  next;
//
//    public Node(int val) {
//        this.val = val;
//    }
//}
//class Linkedlist {
//    Node head;
//    Node tail; int size;
//
//    void addAtHead(int val) {
//        Node temp = new Node(val);
//        if (head == null)
//            head = tail = temp;
//        else {
//            temp.next = head;
//            head = temp;
//        }
//        size++;
//    }
//    void addAtTail(int val) {
//        Node temp = new Node(val);
//        if (tail == null) head = tail = temp;
//        else {
//            tail.next = temp;
//            tail = temp;
//        }
//        size++;
//    }
//     void display(){
//        if(head==null) return;
//        Node temp=head;
//        while (temp !=null) {
//            System.out.print(temp.val + " ");
//            temp=temp.next;
//        }
//         System.out.println();
//     }
//     void deleteAtHead() {
//        if(head==null){
//            System.out.println("list is empty");
//            return;
//        }
//        head =head.next;
//        if(head==null) tail=null;
//        size--;
//    }
//
//     void insert(int val,int idx) {
//        if(idx<0 || idx>size) { System.out.println("invalid index");}
//        else if( idx==0)  addAtHead(val);
//        else if(idx==size) addAtTail(val);
//        else{
//            Node temp=head;
//            for(int i=1;i<idx-1;i++){
//                temp=temp.next;
//            }
//            Node s=new Node(val);
//            s.next=temp.next;
//            temp.next=s;
//        }
//        size++;
//     }
//
//     void delete(int idx) {
//         if (idx < 0 || idx > size) {
//             System.out.println("invalid index");
//             return;
//         }
//         if (idx == 0) {
//             deleteAtHead();
//             return;
//         }
//        Node temp =head;
//        for(int i=1;i<=idx-1;i++){
//            temp=temp.next;
//        }
//        temp.next=temp.next.next;
//        if(idx==size-1) tail=temp;
//
//    }
////
////     int getMiddle(Node head) {
////        Node slow=head; Node fast=head;
////        while(fast!=null && fast.next!=null){
////            slow= slow.next;
////            fast=fast.next.next;
////        }
////        return slow.val;
////    }
//}
//         public class LinkedlistDataStructure { public static void main(String[] args) {
////        Scanner sc=new Scanner(System.in);
//                 // Node a=new Node(sc.nextInt());
//                 Linkedlist ll = new Linkedlist();
//                 Node b = new Node(10);
//                 Node c = new Node(20);
//                 Node d = new Node(59);
//                 ll.addAtHead(10);
//                 ll.addAtHead(10);
//                 ll.addAtHead(10);
//                 ll.addAtHead(10);
//                 ll.addAtTail(50);
//                 ll.display();
//                 ll.deleteAtHead();
//                 ll.display();
//                 ll.insert(67, 2);
//                 ll.display();
//                 ll.delete(3);
//                 ll.display();
////        ll.getMiddle(b);
//                 ll.display();
//             }
//         }