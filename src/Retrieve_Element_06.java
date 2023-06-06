/*Write a Java program to retrieve an element (at a specified index) from a given array list*/

import java.util.Scanner;
import java.util.ArrayList;

public class Retrieve_Element_06 {


    public static void main(String[] args) {
        int i;

        ArrayList<String> list = new ArrayList<String>();
        list.add("BMW");
        list.add("Audi");
        list.add("Mercedez");
        list.add("Maruti");
        list.add("Vauxhall");
        list.add("Ranger Rover");
        //Getting the specified value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number between 0 to 5 ");
        int num = sc.nextInt();
        System.out.println("Array list is" + list);

        System.out.println(num + "th element of array list : " + list.get(num));


    }
}