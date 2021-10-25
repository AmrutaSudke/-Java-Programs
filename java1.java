// BINARY NUMBER RECTANGLE PATTERN
import java.util.Scanner;

public class java1

{

    public static void main(String[] args) 

    {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the number of rows: ");

        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) 

        {

            int num;

            if(i%2 == 0)

            {

                num = 0;

                for (int j = 1; j <= rows; j++)

                {

                    System.out.print(num);

                    num = (num == 0)? 1 : 0;

                }

            }

            else

            {

                num = 1;

                for (int j = 1; j <= rows; j++)

                {

                    System.out.print(num);

                    num = (num == 0)? 1 : 0;

                }

            }

            System.out.println();

        }

        sc.close();

    }

}

// Output:
// PS E:\Felix-It\java> java java1      
//  Enter the number of rows: 
// 4
// 1010
// 0101
// 1010
// 0101
// PS E:\Felix-It\java> 