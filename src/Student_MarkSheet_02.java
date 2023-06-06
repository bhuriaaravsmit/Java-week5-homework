import java.util.Scanner;

public class Student_MarkSheet_02 {


    public static void main(String[] args) {
char conti;
//Scanner declaration for reading the input from console

        Scanner scanner = new Scanner(System.in);
        do {

            System.out.print("\n Enter student name   \t\t:\t");
            String name = scanner.next();
            System.out.print(" Enter Student Roll Number \t\t:\t");
            int rollNum = scanner.nextInt();
            System.out.print("Enter Marks of subject Maths \t:\t");
            int mathMarks = scanner.nextInt();
            if (mathMarks < 0 || mathMarks > 100) {
                System.out.print("\n Invalid input,Marks should between 0 to 100");
                System.out.print("\n Please enter correct marks \t\t:\t");
                mathMarks = scanner.nextInt();

            }
            System.out.print("Enter Marks of Subject Science\t:\t");
            int scienceMarks = scanner.nextInt();
            if (scienceMarks < 0 || scienceMarks > 100) {
                System.out.print("\nInvalid input, Marks should between 0 to 100");
                System.out.print("\nPlease enter correct marks\t\t:\t");
                scienceMarks = scanner.nextInt();
            }

            System.out.println("Enter Marks of Subject English \t:\t");
            int englishMarks = scanner.nextInt();

            if (englishMarks < 0 || englishMarks > 100) {

                System.out.print(" \n Invalid input, Marks should between 0 to 100");
                System.out.print(" \n Please Enter correct marks \t\t:\t");
                englishMarks = scanner.nextInt();

            }

            int total = sum(mathMarks, scienceMarks, englishMarks);
            int percentage = (total * 100) / 300;
            String result = calculateResult(mathMarks, scienceMarks, englishMarks);
            String grade = calculateGrade(percentage, result);
            printTheMarkSheet(name, rollNum, mathMarks, scienceMarks, englishMarks, total, percentage, result, grade);
            System.out.println("Would you like to do more calculations ");
           conti = scanner.next().charAt(0);
        }while(conti=='Y' || conti=='y');
//closing the scanner object
        scanner.close();

    }

    //calculating the sum
    public static int sum(int a, int b, int c) {

        return a + b + c;


    }

    //calculating the results on subject marks
    public static String calculateResult(int mathMarks, int scienceMarks, int englishMarks) {

        if (mathMarks < 35 || scienceMarks < 35 || englishMarks < 35) {


            return "Fail";


        } else {

            return "pass";
        }

    }

    //calculating the grade on percentage and result
    public static String calculateGrade(int percentage,String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                grade = "A + ";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            } else {
                grade = "- ";
            }

        }
        return grade;
    }

    // Printing the Marks sheet
    public static void printTheMarkSheet(String name, int rollNum,int mathMarks, int scienceMarks,
                                         int englishMarks, double total, double percentage, String result,
                                         String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");
    }
}

