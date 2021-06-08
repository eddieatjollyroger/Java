package org.academiadecodigo.bootcamp.containers;

public class LinkedList {

    private Node head;
    private int length = 0;

    public LinkedList() {
        this.head = new Node(null);
    }

    public int size() {
        return length;
    }

    /**
     * Adds an element to the end of the list
     * @param data the element to add
     */
    public void add(Object data)  {

        Node node = new Node(data);
        Node iterator = head;
        while (iterator.getNext() != null){
            iterator = iterator.getNext();
        }
        iterator.setNext(node);
        length++;

    }

    /**
     * Obtains an element by index
     * @param index the index of the element
     * @return the element
     */
    public Object get(int index) {
        int counter = -1;
       Node iterator = head;
        while (iterator.getNext() != null && counter < index){
       iterator = iterator.getNext();
       counter++;
    }
        if (counter != index){
            return null;
        }
        return iterator.data;
    }

    /**
     * Returns the index of the element in the list
     * @param data element to search for
     * @return the index of the element, or -1 if the list does not contain element
     */
    public int indexOf(Object data) {
        int counter = -1;
        Node iterator = head;

        while (iterator.getNext() != null && iterator.getData() != data) {
            iterator = iterator.getNext();
            counter++;
            }
        if (iterator.getData() != data){
            return -1;
        }
        return counter++;
        }


    /**
     * Removes an element from the list
     * @param data the element to remove
     * @return true if element was removed
     */
    public boolean remove(Object data) {
        Node iterator = head;
        while (iterator.getNext() != null && iterator.next.getData() != data){
            iterator = iterator.getNext();
        }
        if(iterator.getNext() != null && iterator.next.getData() == data) {
        iterator.setNext(iterator.next.getNext());
        length--;
            return true;
        }
        if (iterator.getNext() == null){

            return false;
        }
        return false;
    }

    private class Node {

        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            next = null;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setNext() {
        }
    }

}
