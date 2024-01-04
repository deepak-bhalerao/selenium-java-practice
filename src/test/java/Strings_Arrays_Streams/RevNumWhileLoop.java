package Strings_Arrays_Streams;

public class RevNumWhileLoop {
    public static void main(String args[]) {
     
      int num=123 , rem , rev=0;
      while(num>0)
      {
          rem=num%10;  // return last digit
          rev=rev*10+rem;
          num=num/10;  // remove last digit
      }

      System.out.println(rev);
    }
}
