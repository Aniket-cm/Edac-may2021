public class starpattern16 {
    public static void main(String args[])
    {
        for(int row=1; row<=5;row++)
        {
			/*for(int space=4; space>=row; space--)
			{
				System.out.print(" ");
			}*/
            for(int col=1; col<=5; col++)
            {
                if(row==5|col==5-row+1|col==5)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println( );
        }
    }
}
