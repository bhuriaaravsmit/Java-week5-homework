
/*11. Declare following two arraylist and compare it.
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");*/

import java.util.ArrayList;

public class ArrayList_Compare_11 {


    public static void main(String[] args) {

        ArrayList<String> c1=new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");


        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        //display both Arraylist

        System.out.println("ArrayList" +c1);
        System.out.println("ArrayList2"+c2);

        //compare arraylist 1 with arraylist 2

        if(c1.equals(c2)==true) {

            System.out.println("Array List are Equal");
        }

    else {

            System.out.println("Array List are  not Equal");

        }



    }












}
