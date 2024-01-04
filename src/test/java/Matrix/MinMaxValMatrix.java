package Matrix;

public class MinMaxValMatrix {
    public static void main(String args[]) {
     
     int[][] matrix= { 
         {1,2,4},
         {5,6,7},
         {0,8,9} 
     };
     
     int max=Integer.MIN_VALUE;  // initialize max with lowest posible integer value
     int min=Integer.MAX_VALUE;  // initialize min with highest possible integer value
     
     for(int[] arr : matrix)
     {
         for(int value : arr)
         {
             if(value>max)
             max=value;
             if(value<min)
             min=value;
         }
     }
     
     System.out.println("Max value of matrix : "+max);
     System.out.println("Min value of matrix : "+min);
     
     
    }
}
