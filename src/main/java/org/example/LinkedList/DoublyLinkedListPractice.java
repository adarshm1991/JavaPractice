package org.example.LinkedList;

import java.sql.SQLOutput;

class NodeDouble {
    int data;
    NodeDouble prev;
    NodeDouble next;

    NodeDouble(int data){
        this.data = data;
        this.next = this.prev = null;
    }
}
public class DoublyLinkedListPractice {
    public static void main(String[] args) {
        NodeDouble head = null;
        head = insertAtBegin(head, 20);
        head = insertAtEnd(head, 30);
        head = insertAtEnd(head,40);
        head = insertAtEnd(head , 50);
        printDoubleLinkedList(head);
        head = reverseDoubleLinkedList(head);
        printDoubleLinkedList(head);
        head = deleteAtBegining(head);
        printDoubleLinkedList(head);
        head = deleteLastNode(head);
        printDoubleLinkedList(head);
    }

    static NodeDouble insertAtBegin(NodeDouble head,int data){
        NodeDouble temp = new NodeDouble(data);

        if(head != null) {
            temp.next = head;
            head.prev = temp;
        }
        return temp;
    }
    static NodeDouble insertAtEnd(NodeDouble head, int data){
        NodeDouble temp = new NodeDouble(data);

        NodeDouble current = head;

        if( head == null) {
            return temp;
        } else {
            while(current.next != null) {
                current = current.next;
            }
              current.next = temp;
            temp.prev = current;
            temp.next =null;
        }
        return head;

    }
    static void printDoubleLinkedList(NodeDouble head){

        if( head == null){
            System.out.println("DoubleLinkedList is empty");
        }

        System.out.println("DoubleLinked List is :");
        while(head != null){

            System.out.println(head.data);
            head = head.next;
        }


    }

    static NodeDouble reverseDoubleLinkedList(NodeDouble head) {
         NodeDouble current =head ;
         NodeDouble temp = null;

         if( head == null ||head.next ==null) {
             return head;
         }

         while(current != null){

             temp = current.prev;
             current.prev = current.next;
             current.next = temp;
             current = current.prev;
         }

        System.out.println("DoubleLinkedList is reversed successfully");
         return temp.prev;
    }

    static NodeDouble deleteAtBegining(NodeDouble head) {
        NodeDouble current = head;

        if( (head == null) || (head.next ==null)) {
            return null;
        }

        head = head.next;
        head.prev =null;

        System.out.println("First Node has been deleted successfully");

        return head;
    }

    static NodeDouble deleteLastNode(NodeDouble head) {
        NodeDouble current = head;

        if (head == null || head.next == null) {
            return  null;
        }

        while(current.next != null){
            current = current.next;
        }
        current.prev.next = null;

        System.out.println("Last node has been deleted successfully");

        return head;
    }
}
