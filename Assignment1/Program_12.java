import java.util.Scanner;

public class Program_12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number :");
        int num1 = scan.nextInt();
        System.out.println("enter second number :");
        int num2 = scan.nextInt();
        System.out.println("enter third number :");
        int num3 = scan.nextInt();

        int average =(num1+num2+num3)/3;
        System.out.println("Average of these numbers : "+average);


    }
}
