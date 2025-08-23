import java.util.*;


public class MaxCount {
    
    public static void main(String[] args) {
        
        Scanner kk=new Scanner(System.in);
        int[] arr= new int[10];

        System.out.println("Enter Array Elements:");

         for(int i=0;i<arr.length;i++)
    {
        arr[i]=kk.nextInt();
    }

        System.out.println("Enter The value Of X:");
        int x= kk.nextInt();
        int count=0;

        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]>x)
             count++; 
        }

        System.out.println("The Count of Number After X are:"+count);




    }
}
