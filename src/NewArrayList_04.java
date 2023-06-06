/*4. Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.*/

import java.util.ArrayList;

public class NewArrayList_04 {


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Red");
        list.add("White");
        list.add("Black");
        list.add("Purple");
        list.add("Green");
        list.add("Blue");

        for( String  colour:list)
        {
            System.out.println(colour);
        }


    }


}
