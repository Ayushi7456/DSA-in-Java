package ArrayLists;

import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        System.out.println("size is-->" + list.size());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list + "size is-->" + list.size());
        list.remove(1); // index
        System.out.println(list);
        int val = list.get(2); // in array--> int val = list[i];
        System.out.println(val);
        list.set(2, 60); // in array--> int list[2] = 60;
        System.out.println(list);

        // ArrayList in strings
        ArrayList<String> str = new ArrayList<>();
        str.add("Hello");
        str.add("passionate");
        str.add("coder");
        System.out.println(str);

        // loops in arraylist
        for (int i = 0; i < list.size(); i++) {
            int val1 = list.get(i);
            System.out.println(val1);
        }
        for (String i : str) {
            System.out.println(i);
        }
    }
}
