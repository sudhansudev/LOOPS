package LOOPS;

public class loops
{
    public static void main(String[] args) {
        // for loop
//        for(int i = 1, j = 1; i <= 10 && j <= 10; i++ ,j+=2 )
//        {
//            System.out.println("i = "+i+" j = "+j);
//        }
        //System.out.println(i);//i cant bew defined outside the for block .
//            System.out.println("\n");
//        for( ; ;)
//        {
//            System.out.println("hello");
//            break;
//        }
//         while loop
//        int b = 1;
//        while(b <=10)
//        {
//            System.out.print(b +" ");
//            b = b + 1;
//        }
//        System.out.println("\n");
//        // do-while loop
//        int k = 1;
//        do
//        {
//            System.out.print(k + " ");
//            k++;
//        }while(k <= 10);
//        int n = 5;
//        for(int i = n; i >= 1;i--)
//        {
//            System.out.println(i);
//        }
//        int sum = 0 ;
//        int n = 10;
//        for(int i = 0 ; i <= n; i++)
//        {
//            System.out.println("i = " +i);
//            sum = sum + i;
//
//        }
//        System.out.println("sum is :" + sum);

//        int fact = 1;
//        Scanner sc  =new Scanner(System.in);
//        System.out.print("enter the number :");
//        int num = sc.nextInt();
//        for(int i = num; i >= 1; i--)
//        {
//            fact = fact * i;
//            System.out.println("fact become :" + fact);
//        }
//        System.out.println("factorial of the number :" + num + " is " + fact);
        int sum = 0;
        int num = 123;
        int copy = num;

        while (num > 0) {
            int fact = 1;
            int lastdigit = num % 10;
            //factorial of lastdigit
            for(int i = 1; i <= lastdigit; i++)
            {
                fact *= i;
            }
            sum += fact;
            System.out.println(lastdigit);


            num /= 10;


        }
        System.out.println(sum);
//
//        }
//        System.out.println("sum of digits   = " +sum);
//        int num = 1221;
//        int copy = num;
//        System.out.println("the number is :" + num);
//        int rev = 0;
//        while(num > 0)
//        {
//            int lastdigit = num % 10;
//            rev = (rev * 10) + lastdigit;
//            num /= 10;
//        }
//        if(copy == rev)
//        {
//            System.out.println("palindrome");
//        }
//        else {
//            System.out.println("not palindrome");
//        }
//        System.out.println("reverse number is : " + rev);
//    }
        }
    }
