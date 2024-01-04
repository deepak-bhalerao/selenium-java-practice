package Strings_Arrays_Streams;

public class FibonacciSeries {
    public static void main(String args[]) {
      
      int num=10 , a=0 , b=1 , c;
      System.out.print(a+" "+b);
      for(int i=0 ; i<=num ; i++)
      {
          c=a+b;
          System.out.print(" "+c);
          a=b;
          b=c;
      }
    }
}
