package ImplementsLinkesListMethod;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>(10);
        linkedList.add(1,1);
        linkedList.add(2,2);
        linkedList.add(3,3);
        linkedList.add(4,4);
        linkedList.add(5,5);
        System.out.println(linkedList.getLast().data);

        linkedList.clear();

        linkedList.printList();

    }
}
