package org.example.LinkedList;

class NodeCircular{
    int data;
    NodeCircular next;

    NodeCircular(int data){
        this.data = data;
        this.next = null;
    }
}
public class CircularLinkedList {

    public static void main(String[] args){

        NodeCircular head = null;

        head = insertAtBeginning(head,30);
        head = insertAtBeginning(head,40);
        head = insertAtLast(head,50);
        printCircularLinkedList(head);
        head = deleteAtBegining(head);
        printCircularLinkedList(head);
    }

    static NodeCircular insertAtBeginning(NodeCircular head,int data){
        NodeCircular current = head;

        NodeCircular temp = new NodeCircular(data);

        if(head == null) {
            temp.next = temp;
            head = temp;
            return head;
            //return head;
        } else {

        temp.next =head.next;
        head.next = temp;
        int swap = head.data;
        head.data = temp.data;
        temp.data = swap;

        return head;
       }
    }

    static NodeCircular insertAtLast(NodeCircular head,int data){
        NodeCircular current = head;

        NodeCircular temp = new NodeCircular(data);

        if(head == null) {
            temp.next = temp;
            head = temp;
            return head;
            //return head;
        } else {

            temp.next =head.next;
            head.next = temp;
            int swap = head.data;
            head.data = temp.data;
            temp.data = swap;

            return temp;
        }
    }

    static void printCircularLinkedList(NodeCircular head) {

         NodeCircular current = head;
        if( head == null) {
            System.out.println("Circular LinkedList is empty");
        }

        System.out.println("Circular LinkedList is :");
        //if(head.next == head){
        //    System.out.println(head.data);
        //}

        do{
            System.out.println(current.data);
            current = current.next;
        } while(current != head);

    }

    static NodeCircular deleteAtBegining(NodeCircular head) {
        NodeCircular current = head;

        if(head == null || head.next == head) {
            return  null;
        }

        while(current.next != head) {
            current = current.next;
        }
          current.next = head.next;

        return current.next;
    }

}
