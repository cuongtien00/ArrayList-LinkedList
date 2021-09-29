package ImplementsArrayListMethod;

import java.awt.*;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> integerList = new MyList<>();
      integerList.add(0,1);
      integerList.add(1,2);
      integerList.add(2,3);
      integerList.add(3,4);
      integerList.add(4,5);



        System.out.println(integerList.get(0));
        System.out.println(integerList.get(1));
        System.out.println(integerList.get(2));
        System.out.println(integerList.get(3));
        System.out.println(integerList.get(4));

        System.out.println(integerList.indexOf(5));

        System.out.println(integerList.contains(3));

        integerList.clear();

        System.out.println(integerList.get(0));
        System.out.println(integerList.get(1));
        System.out.println(integerList.get(2));
        System.out.println(integerList.get(3));
        System.out.println(integerList.get(4));

    }
}
