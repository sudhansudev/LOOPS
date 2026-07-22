package LOOPS;

import java.util.Scanner;
public class factor_calculate
{
    public static int factor(int num)
    {
        for(int i = 1; i <= num ; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
        return num;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
        factor(n);




    }
}
