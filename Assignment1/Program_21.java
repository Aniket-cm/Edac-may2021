import java.util.Scanner;
public class Program_21 {
    public static void main(String[] args){
        int index=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int arr[] = new int[5];


        int num = scan.nextInt();

        while(num>0)
        {
            arr[index++] = num%8;
            num /= 8;
        }

        for(int i=index-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }

    }

}
