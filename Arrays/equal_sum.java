import java.util.Scanner;

public class equal_sum {

    
    public static  void inputArray(int[] x, Scanner sc)
    {
        System.out.println("Enter Array Elements:");
        for(int i=0;i<x.length;i++)
        {
            x[i]=sc.nextInt();

        }
        //System.out.println("Elements Entered Successfully");
    }
     public static  void printArray(int[] x)
    {
        
        for(int i=0;i<x.length;i++)
        {
             System.out.print(x[i]+" ");

        }
       
    }

    public static int findarraySum(int[] arr)
    {
        int totalsum= 0;
        for(int i=0;i<arr.length;i++)
        {
            totalsum+=arr[i];
        }

        return totalsum;

    }

    public static boolean equalsumPartition(int[] arr)
    {
        int totalsum= findarraySum(arr);

        int prefixSum=0;

        for(int i=0;i<arr.length;i++)
        {
            prefixSum+=arr[i];

            int suffixSum=totalsum-prefixSum;

            if(suffixSum==prefixSum)
            {
                return true;

            }

        }
        return false;


    }

    public static void main(String[] args) {
        
        Scanner kk = new Scanner(System.in);
        System.out.println("Enter Length of Array");
        int n=kk.nextInt();

        int[] arr =new int[n];

        inputArray(arr, kk);

        System.out.println("Original Array:");
        printArray(arr);

      boolean  Result= equalsumPartition(arr);

      System.out.println("Is Array Can be Partitioned into two subarray with equal Sum:  "+ Result);


    }
    
}
