package Leetcode_Spetember;

//public class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int val){
//        this.val=val;
//    }
//
//
//    public class LinkedList{
//        ListNode head;
//
//        public LinkedList(){
//            head=null;
//        }
//    }
//
//    public void insertAtBeginning(int val) {
//        ListNode newNode = new ListNode(val);
//        newNode.next = head;
//        head = newNode;
//    }
//}



class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Day_08_LinkedList {
    ListNode head;

    public  Day_08_LinkedList() {
        head = null;
    }

    // Method to insert a new node at the beginning
    public void insertAtBeginning(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    // Method to insert a new node at the end
    public void insertAtEnd(int val) {
        if (head == null) {
            head = new ListNode(val);
            return;
        }

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(val);
    }

    // Method to print the linked list
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
}
