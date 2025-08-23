import java.util.Scanner;

public class Sortoddeven {


    public static  void inputArray(int[] arr, int n)
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter The Array Elements:");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }  
    }
    public static void PrintArray(int[] arr, int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static Boolean isEven(int[] arr, int x)
    {
        if(arr[x]%2==0)
        { 
             return true;
        }
       
        else
        {return false;}
        
    }
    public static void swap_process(int[] arr, int left, int right)
    {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;


    }
    public static void sort_Array(int[] arr, int n)
    {
        int left=0, right=n-1;

        while(left<right)
        {
            if(!isEven(arr,left) && isEven(arr, right))
            {
                swap_process(arr, left, right);
                left++;
                right--;
            }

            if(isEven(arr, left))
            {
                left++;
            }

            if(!isEven(arr,right))
            {
                right--;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    
   
    System.out.println("Enter The length Of Array:");
    int n=sc.nextInt();
    int[] arr= new int[n];
    inputArray(arr, n);
    //Print Before
    System.out.println("Array Before Sorting");
    PrintArray(arr,n);


    //sort Array Like Even & Then ODD.
        sort_Array(arr,n);
    System.out.println(" ");
    System.out.println("Array After Sorting");
    PrintArray(arr,n);


    }
    
}
