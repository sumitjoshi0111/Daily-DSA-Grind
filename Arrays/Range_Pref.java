import java.util.Scanner;

public class Range_Pref {

    public static  void inputArray(int[] x, Scanner sc)
    {
        try{

        System.out.println("Enter Array Elements:");
        for(int i=1;i<=x.length+1;i++)
        {
            x[i]=sc.nextInt();

        }
        }
        catch(Exception e)
        {
            System.out.println("  ");
        }
       
        //System.out.println("Elements Entered Successfully");
    }
     public static  void printArray(int[] x)
    {
        
       try {
         for(int i=1;i<=x.length+1;i++)
        {
             System.out.print(x[i]+" ");

        }
       } catch (Exception e) {
        System.out.println("  ");
       }
       
    }

    public static int[] makesPrifixSum( int[] arr)
    {
        try {
            for(int i=1;i<=arr.length+1;i++)
        {
            arr[i]=arr[i]+arr[i-1];
        }
        } catch (Exception e) {
            System.out.println("  ");
        }
        return arr;

    }
    
        public static void main(String[] args) {
        
        Scanner kk = new Scanner(System.in);
        System.out.println("Enter Length of Array");
        int n=kk.nextInt();

        int[] arr =new int[n];

        inputArray(arr, kk);

        System.out.println("Original Array:");
        printArray(arr);

        System.out.println("prefix Sum Array:");
         int[] pref=makesPrifixSum(arr);
         printArray(pref);

         System.out.println("Enter Number of queries:");
         int q= kk.nextInt();

         while(q-- >0)
         {
            System.out.println("Enter value Of L and R");
            int l=kk.nextInt();
            int r=kk.nextInt();
            int sum=pref[r]-pref[l-1];
            System.out.println("Sum is:"+ sum);
         }
    }
    
}
