import java.util.Scanner;


 public class PrefixSumWithoutNewArray {
 

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

    public static void makesPrifixSum(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {   
            arr[i]=arr[i]+ arr[i-1];

        }

       
    }
    public static void main(String[] args) {
        
        Scanner kk = new Scanner(System.in);
        System.out.println("Enter Length of Array");
        int n=kk.nextInt();

        int[] arr =new int[n];

        inputArray(arr, kk);

        System.out.println("Original Array:");
        printArray(arr);
        System.out.println("Array After PrefixSum \n");
        makesPrifixSum(arr);
        printArray(arr);


        }
}
