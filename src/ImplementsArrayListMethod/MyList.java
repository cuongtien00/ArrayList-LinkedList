package ImplementsArrayListMethod;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E elements[];

    public MyList() {
        elements =(E[]) new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapacity(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
//    public void add(E e) {
//
//        ensureCapa();
//        elements[size++] = e;
//    }


    public void add (int index, E element){
       if(index>=0 && index<=size){
           size +=1;
           ensureCapacity();
           for (int i = size-1; i >=index ; i--) {
               elements[i+1] = elements[i];
           }
           elements[index] = element;
       }
    }
    public E remove(int index){
        if(index>=0 && index <size){
            for (int i = index; i < size ; i++) {
                elements[i] = elements[i+1];
            }
        }
        size -= 1;
        return elements[index];
    }
    public E get(int index){
        if(index>=0 && index<size){
            return  elements[index];
        }
        return null;
    }
    public int getSize(){
        return size;
    }

//    public  E clone(){
//        MyList<E> clone = new MyList<>(elements.length);
//        for (E x : elements) {
//            clone.add(x);
//        }
//        return clone;
//    }
    public boolean contains (E e){
        for (E x: elements) {
            if(e.equals(x)){
                return  true;
            }
        }
        return false;
    }
    public int indexOf(E e){
        for (int i = 0; i < size; i++) {
            if(elements[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    public  void clear(){
        elements =  (E[])new Object[DEFAULT_CAPACITY];
        size=0;
    }
}
