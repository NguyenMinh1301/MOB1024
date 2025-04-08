package Bai1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(42);
        list.add(3.14);
        list.add(true);
        list.add("I love Java!");

        for (Object item : list) {
            System.out.println(item);
        }
    }
}
