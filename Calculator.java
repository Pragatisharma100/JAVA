// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        {
           Scanner sc = new Scanner(System.in);
            int a= sc.next.Int();
            int b = sc.next.Int();
            int sum = a+b;
            int sub = a-b;
            int Multiplication = a*b;
            int Division= a/b;
            int Modulo = a%b;
            System.out.println(sum);
            System.out.println(sub);
            System.out.println(Multiplication);
            System.out.println(Division);
            System.out.println(Modulo);

        }
    }
}
