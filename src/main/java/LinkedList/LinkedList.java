package LinkedList;

public class LinkedList {

   // Java program to insert a new node at the end of the singly linked list
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

        Node head = null;
        Node tail = null;

        public void addNode(int data){
            Node newNode = new Node(data);

            if(head == null){

                head = newNode;
                tail = newNode;

            }else{
                tail.next = newNode;
                tail = newNode;
            }

        }
   }

   // write a method to reverse a linkedList
    public static void reverseLinkedList(Node head){
         Node current = head;
         Node prev = null;
         Node next = null;

         while(current != null){
              next = current.next;
              current.next = prev;
              prev = current;
              current = next;
         }
         head = prev;
    }


       
    
}