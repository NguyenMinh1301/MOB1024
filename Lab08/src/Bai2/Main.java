package Bai2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myarr = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            myarr.add(i);
        }

        for (Integer num : myarr) {
            System.out.println(num);
        }
    }
}
