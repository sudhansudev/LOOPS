package LOOPS;

public class dgcount
    {
        public static void main(String[] args)
        {
          int num = 1000000;
          int count = 0;
          if(num == 0)
              count = 1;

          do
          {
              num = num / 10;
              count++;
          }while(num != 0);

          System.out.println("count is :" +count);

        }
    }
