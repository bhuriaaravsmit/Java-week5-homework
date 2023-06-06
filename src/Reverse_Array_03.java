
/*3. Write a Java program to reverse an array of integer values.*/


import java.util.Arrays;

public class Reverse_Array_03 {


    public static void main(String[] args) {
        int i;
        int a[] = new int[]{10, 15, 20, 25, 30, 35, 40};

        System.out.println(" Original array " +Arrays.toString(a));

        for (i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            int index = a.length - i - 1;
            a[i] = a[index];
            a[index] = temp;

        }
        System.out.println(" Reverse Array  " + Arrays.toString(a));


    }



}
