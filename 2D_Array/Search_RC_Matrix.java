import java.util.*;
public class Search_RC_Matrix {


    public static boolean search_sorted_RC_Matrix(int[][] arr, int target)
    {
        int m=arr.length;
        int n=arr[0].length;

        int i=0, j=n-1;
        while(i<m && j>=0)
        {
            if(arr[i][j]>target) j--;
            else if(arr[i][j]<target)i++;
            else return true;

        }
        return false;
    }

    
    public static void print_Array(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)

                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[][] arr= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26}};
        System.out.println("Given Array");
        print_Array(arr);
        System.out.println("Enter Number to search:");
        Scanner kk =  new Scanner(System.in);
        int target=kk.nextInt();

        if(search_sorted_RC_Matrix(arr,target))
        {
            System.out.println("Element Found in array");
        }
    }
    
}

