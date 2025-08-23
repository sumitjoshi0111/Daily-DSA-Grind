import java.util.*;


public class NonDecreasing {


    public static void inputArray(int[] arr, int n, Scanner kk)
    
    {
        System.out.println("Enter Array Elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=kk.nextInt();
        }
    }
     public static void printArray(int[] arr, int n )
    
    {
        
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void squareArray(int[] arr, int n)
    {
        for(int i=0;i<n;i++)
        {
            arr[i]*=arr[i];
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Length Of Array:");
        Scanner kk = new Scanner(System.in);
        int n=kk.nextInt();
        int[] arr= new int[n];
        inputArray(arr,n, kk);
        printArray(arr,n);
        squareArray(arr,n);
        printArray(arr,n);


    }
    
}
