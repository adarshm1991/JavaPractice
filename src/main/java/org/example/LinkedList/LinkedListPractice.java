package org.example.LinkedList;

class Node  {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedListPractice {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head = insertAtBegining(head,50);
        head = insertAtEnd(head,60);
        head = insertAtPosition(head,70,4);
        System.out.println("Non-Recursive Print Linked List");
        printList(head);
        System.out.println("Recursive Print Linked List");
        recursivePrintList(head);
        int pos = searchNode(head,50);

        System.out.println("The position of searched Node is "+pos);

        pos = recursiveSearchNode(head,70);

        System.out.println("The position of searched Node using recursive search is "+ pos);;
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

    static Node insertAtBegining(Node head,int data){
        Node temp = new Node(data);
        temp.next =head;
        return temp;
    }

    static Node insertAtEnd(Node head, int data){
         Node temp = new Node(data);
         Node current = head;

         if(head == null)
             return head;


         while(current.next != null) {
             current = current.next;
         }

         current.next = temp;
         temp.next = null;

         return head;
    }

    static Node insertAtPosition(Node head, int data, int position) {
        Node temp = new Node(data);
        Node current = head;

        for(int i =0;i < position -2 ; i++ ) {
            current = current.next;
        }

        temp.next = current.next;
        current.next = temp;

        return head;
    }

    static Node deleteFirstNode(Node head){
        if ( head == null) {
            return null;
        }

        return head.next;
    }

    static Node deleteLastNode(Node head){
        if(head == null || head.next == null) {
            return null;
        }

        Node current = head;

        while(current.next.next != null) {
            current = current.next;
        }

        current.next = null;
        return head;

    }

    static int searchNode(Node head, int data){
        Node current =head;
        int position = -1;

        if(head == null) {
            return position;
        }

        if( head.data == data) {
            return 1;
        }

        position = 1;
        while(current != null) {
            if(current.data == data){
                return position;
            }
            current = current.next;
            ++position;
        }

        return -1;


    }

    static int recursiveSearchNode(Node head, int data) {
        Node current =head;

        if(head == null){
            return -1;
        }
        if(head.data == data) {
            return 1;
        }

        int res = recursiveSearchNode(head.next, data);
        if(res == -1) return -1;
        else return res+1;
    }
}
