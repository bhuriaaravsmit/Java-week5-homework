/*5. Write a Java program to iterate through all elements in an array list using
Iterator.*/


import java.util.ArrayList;
import java.util.Iterator;

public class Array_Iterator_05 {


    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("one");
        al.add(2);
        al.add("OOPS concept");
        al.add(2.5);
        al.add("Java");
        al.add("C");
        System.out.println("ArrayList " + al);
        //Using Iterator to print the list

        Iterator iterate = al.iterator();
        System.out.println("Iterating over Arraylist ");

        while (iterate.hasNext())
        {
            System.out.println(iterate.next());//
        }

    }
}