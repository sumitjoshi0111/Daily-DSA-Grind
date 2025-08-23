import java.util.*;

public class sort_zero_one_array {

    public static  void inputArray(int[] arr, int n)
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter The Array Which Consist Only 0s & 1s:");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }  
    }

    public static void swap_process(int[] arr, int left, int right)
    {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;


    }
    public static void sort_array(int[] arr, int n)
    {
        int left=0, right=n-1;
        while(left<right)
        {
            if(arr[left]==1 && arr[right]==0)
            {
                 swap_process(arr,left,right);
                left++;
                right--;

            }

            if(arr[left]==0)
            {
                left++;
            }
            if(arr[right]==1)
            {
                right--;
            }
        }

    }

    // public static void sort_Array(int[] arr ,int n)
    // {
       
    //     int countZero=0;

    //     //Count the zeroes in array:

    //     for(int i=0;i<n;i++)
    //     {
    //         if(arr[i]==0)
    //         {
    //             countZero++;
    //         }
    //     }

    //     //Set Element like:
    //     // 0= 0th to count-1
    //     //1= count to n-1;

    //     for(int i=0; i<n;i++)
    //     {
    //         if(i<countZero)
    //         {
    //             arr[i]=0;
    //         }
    //         else
    //         {
    //             arr[i]=1;
    //         }
    //     }
    // }

    public static void PrintArray(int[] arr, int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

public static void main(String[] args)
 {
    Scanner sc= new Scanner(System.in);
    
    
    System.out.println("Enter The length Of Array:");
    int n=sc.nextInt();

    int[] arr= new int[n];
    inputArray(arr,n);
    System.out.println("Array Before Sorting:");
    PrintArray(arr,n);
    //Sorting funtion:
    sort_array(arr, n);
    // sort_Array(arr,n);
    System.out.println("Array After Sorting:");
    PrintArray(arr,n);



    
}

    
}
