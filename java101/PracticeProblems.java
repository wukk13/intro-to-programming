public class PracticeProblems {
	public static int countOccurences (int[] arr, int n){
              int count=0;
             for (int x=0 ; x < arr.length; x++ ){
              if (arr[x]==n){
                    count++; 
                  }
             }
                    return count; 
              }
                  
          }
        
public class PracticeProblems {
       public static int reverseArray (int[]arr){
              int[] reversed = new int[arr.length];
              for (int x=0; x< arr.length; x++){
                     reversed[x]= arr[arr.length-1-x];
              }
       return reversed;
       }
}

public class PracticeProblems {  
       public static double sumGrid (double[][]grid){
           double sum= 0;
       for (int x=0; x<arr.length; x++){
       for (int y=0; y<arr.length; y++){
        sum+=grid[x][y];
       }
       }
       return sum;
}
}

public class PracticeProblems{
       public static int fib(int n){
       int x= 0;
       int y= 1;
       for (int p=0; p<=n; p++){
              fib=x+y;
              n=fib+y;
       }
       return fib;
}
}




        



