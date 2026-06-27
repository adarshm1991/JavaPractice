package org.example.LinkedList;

class Node  {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedListTraversal {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Non-Recursive Print Linked List");
        printList(head);
        System.out.println("Recursive Print Linked List");
        recursivePrintList(head);
    }

    static void printList(Node head){
        while(head != null){
            System.out.println(head.data);
            head =head.next;
        }
    }

    static void recursivePrintList(Node head){
        if( head == null)
            return;
        System.out.println(head.data);
        recursivePrintList(head.next);
    }
}
