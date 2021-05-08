import java.util.Scanner;
import java.lang.Math;
public class Program_25 {
    public static void main(String[] args){
        int index=0;
        int i=8,decimal_num = 0;
        int reminder=0;
        int j=0,z=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");

        int num = scan.nextInt();

        while(num>0)
        {
            reminder = (int) (num%10);
            num /=10;
            decimal_num= decimal_num+(int) (reminder*(Math.pow(i,j++)));

        }

        System.out.println("Decimal number is "+decimal_num);


    }
}
