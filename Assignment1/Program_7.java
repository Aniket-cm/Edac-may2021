import java.util.Scanner;

public class Program_7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a First Number :");

        int num1 = scan.nextInt();

        for(int i=1;i<=3;i++) {
            System.out.println("multiplicarion :"+(i*num1));
        }


    }
}
