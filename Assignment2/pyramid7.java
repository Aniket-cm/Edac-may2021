public class pyramid7 {
    public static void main(String args[])
    {
        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=9;k>=i;k--)
            {
                System.out.print(10-i+" ");
            }
            System.out.println();


        }

    }
}
