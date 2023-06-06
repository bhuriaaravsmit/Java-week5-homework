

import java.util.HashSet;

import java.util.Scanner;
public class HashSet_08 {

    public static void main(String[] args) {

        //create a Hashset object called numbers

        HashSet<Integer> numbers = new HashSet<Integer>();

Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number between 0 10 10 ");
int n= sc.nextInt();
        //Add Values to te set

        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        //show which numbers between 1 to 10 are in set

        for(int i=0;i<=10;i++) {

            if (numbers.contains(n)) {
                System.out.println(n + "was found in the set");
            } else {
                System.out.println(n + "was not found in the set");
            }
        }

    }

}
