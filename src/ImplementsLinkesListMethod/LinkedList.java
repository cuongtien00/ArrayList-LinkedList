package ImplementsLinkesListMethod;

import SimpleLinkedListClass.MyLinkedList;

public class LinkedList<E> {
    private Node head;
    private int numNodes;
    private boolean flag;

    public LinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data) {
        if(head == null)
            addFirst(data);
        else {
            Node temp = head;
            while (temp.next !=null){
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }
    public void remove(int index){
        Node temp = head;
        for (int i = 0; i < index-1 && temp.next!=null; i++) {
            temp = temp.next;
        }
        temp.next=temp.next.next;
        numNodes--;
    }
    public int size(){
        Node temp = head;
        int i = 0;
        while (temp.next!=null){
            temp = temp.next;
            i++;
        }
        return i;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean contains(Object data) {
        Node temp = head;
        for (int i = 0; i <= numNodes; i++) {
            if ((temp.data).equals(data)) {
                flag = true;
                break;
            }
            else {
                flag = false;
                temp = temp.next;
            }
        }
        return flag;
    }
    public int indexOf(Object data) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if ((temp.data).equals(data)){
                return i;
            }
        }
        return -1;
    }
    public Node getFirst(){
        Node temp = head;
        return temp;
    }
    public Node getLast(){
        Node temp = head;
        Node last;
        while (temp.next!=null){
            temp = temp.next;
        }
       return temp;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void ensureCapacity(int minCapacity){
        minCapacity++;
    }
    public void clear(){
        head = null;
    }
}
