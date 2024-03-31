// Write a program to sum three numbers in Java.
// class Sum{
// 	public static void main(String[] args) {
// 		int a,b,c;
// 	a=12;
// 	b=12;
// 	c=12;
// 	System.out.println(a+b+c);
// 	}
// }


// Write a program to calculate CGPA using marks of three subjects (out of 100)
// class CGPA{
// 	public static void main(String[] args) {
// 		float Math;
// 		float English;
// 		float Hindi,Percentage;
// 		Math=80;
// 		English=80;
// 		Hindi=90;
// 		Percentage = (Math+English+Hindi)/30;
// 		System.out.println(Percentage);
// 	}
// }


// Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.
// import java.util.Scanner;
// class Greeting{
// 	public static void main(String[] args) {
// 	System.out.println("this is my name");
// 	Scanner sc= new Scanner(System.in);
// 	String name = sc.next();
// 	System.out.println("Hello "+  name + " have a good day");
// 	}
// }


// Write a Java program to convert Kilometers to miles.
// import java.util.Scanner;
// class Convertor{
// 	 public static void main(String[] args) {
// 		System.out.println("Enter the number");
// 		float miles,kilometer;
// 		Scanner sc =new Scanner(System.in);
// 		kilometer = miles * 1000;
// 		System.out.println(kilometer);
// }
// }


// Write a Java program to detect whether a number entered by the user is an integer or not.
// import java.util.Scanner;
// class Convertor{
// 	public static void main(String[] args) {
// 		System.out.println("Enter the number");
// 		Scanner sc =new Scanner(System.in);
// 		System.out.println(sc.hasNextInt());
// 	}
// }


// What will be the result of the following expression:  float a = 7/4 * 9/2
// class datatypes{
// 	public static void main(String[] args) {
// 		float a = (7/4.0f) * (9/2.0f);
// 		System.out.println( a);
// 	}
// }


// Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
// class encrypt{
// 	public static void main(String[] args) {
// 		char grade ='A';
// 	grade = (char)(grade +8);
// 	System.out.println(grade);
// 	grade = (char)(grade -8);
// 	System.out.println(grade);
// 	}
// }

// Use comparison operators to find out whether a given number is greater than the user entered number or not.
// import java.util.Scanner;
// class operators{
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
// 		System.out.println(a>8);
// 	}
// }


// Write the following expression in a java program: (v^2-u^2)/2as
// import java.util.Scanner;
// class expression{
// 	public static void main(String[] args) {
// 		float v =4;
// 		float u =6;
// 		float a =5;
// 		float s =7;
// 		float k;
//         k = (v*v -u*u)/(2*a*s);
// 		System.out.println(k);
// 	}
// }


// Find the value of 'a' in expression given below : int x = 7 ;int a = 7*49/7 + 35/7
import java.util.Scanner;
class findValue{
	public static void main(String[] args) {
		int a =7*49/7 + 35/7;
		System.out.println(a);
	}
}
















//  DATATYPES


// public class A {
//    public A();
//     {System.out.println("hi");
// }}
// class main {
// public static void main(String[] args) {
//     A.v;
//     System.out.println("bye");
//     v=new A();

// }

// }

// class System {
//     static B outer;
// }

// class B {
//     void printjava()
// }

//     {
//         System.out.println("student");
//     }

// public class main {
//  public static void main(String[] args) {
//      System.out.println("hi");
//     System.outer.printjava();}
// }


// class datatypes {

	
// 	public static void main(String args[])
// 	{

//         long l = 12121;
		
// 		System.out.println("long: " + l);
// 	}
// }


	// // use byte and short
	// 	// if memory is a constraint
	// 	byte b = 4;

	// 	// this will give error as number is
	// 	// larger than byte range
	// 	// byte b1 = 7888888955;

	// 	short s = 56;

	// 	// this will give error as number is
	// 	// larger than short range
	// 	// short s1 = 87878787878;

	// 	// by default fraction value
	// 	// is double in java
	// 	double d = 4.355453532;

	// 	// for float use 'f' as suffix as standard
	// 	float f = 4.7333434f;

	// 	// need to hold big range of numbers then we need
	// 	// this data type
	// 	long l = 12121;


    //     	// Creating and initializing custom character
	// 

		// Integer data type is generally
		// used for numeric values

        // System.out.println("byte: " + b);
        // System.out.println("integer: " + i);
		// 
		// System.out.println("float: " + f);
		// System.out.println("double: " + d);
		// System.out.println("long: " + l);
        // System.out.println("char: " + a);