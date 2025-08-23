import java.util.*;

public class MaxElement {
    
    public static void main(String[] args) {
        
    Scanner kk= new Scanner(System.in);

    // System.out.println("Enter Size Of array:");
    // int n=kk.nextInt();

    // System.out.println("Enter Array Elements");
    // int[] arr1 = new int[n];

    //  for(int i=0;i<n;i++)
    // {
    //     arr1[i]=kk.nextInt();
    // }
 
    int[] arr= {10,20,50,30,40,};

    int max=arr[0];

    for(int i=1;i<arr.length;i++)
    {
        if(arr[i]>max)
        {
            max=arr[i];

        }
    }

    System.out.println("The Maximum Nunber is="+max);


  
    
}

}