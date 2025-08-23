import java.util.*;

public class LinearSearch
{
    public static void main(String arg[])
    {
        Scanner kk = new Scanner(System.in);
        int[] arr= new int[100];

        System.out.println("Enter Size of Array");
        int n=kk.nextInt();
        System.out.println("Enter Array Elements");

    for(int i=0;i<n;i++)
    {
        arr[i]=kk.nextInt();
    }
    
    System.out.println("Enter Element To Search");
    int x=kk.nextInt();
    boolean flag=false;
    for(int j=0;j<n;j++){

         if(arr[j]==x)
         {
             flag=true;
            break;

         }
    }


    if(flag==true)
    System.out.println("The element Found ");
    else
    System.out.println("Element Not Found.");
    }
}