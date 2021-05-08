import java.util.Scanner;
import java.lang.Math;
public class Program_22 {
    public static void main(String[] args){

        int  decimal_num = 0;
        int j=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scan.nextInt();
        while(num>0)
        {
            decimal_num+=((num%10)*j);
            j*=2;
            num /= 10;
        }
        System.out.println("Decimal number is "+decimal_num);

    }
}
