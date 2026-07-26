package LOOPS;

import java.util.Scanner;
public class looptry
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int num = sc.nextInt();

        int result;
        System.out.println("the multiplication table is:");
        for(int i = 1 ; i <= 10 ; i++ )
        {
            result = num * i;
            System.out.println(num +  " * " + i + " = " + result);
        }
    }
}
