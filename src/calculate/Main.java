package calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char conti ;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter the First Number");
            int a = sc.nextInt();
            System.out.println(" Enter the Second Number");
            int b = sc.nextInt();
            System.out.println("Please Enter any symbol  +,-,*, /: ");
            char ch = sc.next().charAt(0);
            calculateResults(a,b,ch);
            System.out.println("Would you like to do more calculations ");
             conti = sc.next().charAt(0);
        } while (conti  == 'Y' || conti  == 'y');
    }

    public static void calculateResults(int a, int b, char ch) {

        Calculator cal = new Calculator();
if(ch=='+') {
    cal.addition(a, b);
}else if(ch=='-') {
    cal.subtraction(a, b);
}else if(ch=='*') {
    cal.multiplication(a, b);
}else if(ch=='/') {
    cal.division(a, b);
}

    }


}
