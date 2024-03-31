 import java.util.Scanner;
 class ScannerInput {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter two number to find the maximum of two");
        int a = input.nextInt();
        int b = input.nextInt();
        if (a>b){
            System.out.printf("between %d and %d , maximum is %d \n", a,b,a);
        }
        else{
            System.out.printf("between %d and %d , maximum is %d \n", a,b,b);
        }
    }
}
