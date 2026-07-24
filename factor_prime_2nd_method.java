package LOOPS;

import java.util.Scanner;
public class factor_prime_2nd_method
{
    public static void main(String[] args)
    {
        Scanner ft = new Scanner(System.in);
        System.out.print("enter the number:");
        int num = ft.nextInt();
        int count = 0;
        for(int i = 1 ; i <= num; i++)
        {
            if(num % i == 0)
            {
//              System.out.println("the factor of " + num  +" are :" + i);
                count++;
            }

        }
        if(count > 2)
        {
            System.out.println(num + " is not CONDITIONAL.prime.");
        }
        else
        {
            System.out.println(num + " is CONDITIONAL.prime.");
        }
    }
}
