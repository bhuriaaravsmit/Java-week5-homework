
/*
7. Write a Java program to test if an array list is empty or not.*/

import java.util.ArrayList;

public class Arraylist_Empty_07 {


    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<String>();



        list.add("BMW");
        list.add("Audi");
        list.add("Mercedez");
        list.add("Maruti");
        list.add("Vauxhall");
        list.add("Ranger Rover");
        list.remove(1);

        if (list.isEmpty()) {
            System.out.println("The array list is empty" + list);

        } else {
            System.out.println("The array list is not empty" + list);

        }


        for(int i=0;i< list.size();i++) {
            list.remove(1);

                System.out.println("Array list removes 1 value " +list);

        }

    }
}