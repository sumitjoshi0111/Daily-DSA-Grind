import java.util.*;

public class Inputelements
{

public static void main(String args[])
{

    Scanner kk = new Scanner(System.in);
    System.out .println("Enter Size of Array");
    int n=kk.nextInt();

    int[] arr= new int[n];

    System.out.println("Enter Array Elements");

    for(int i=0;i<n;i++)
    {
        arr[i]=kk.nextInt();
    }

    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum=sum+arr[i];
    }

    System.out.println("sum of Elements is:"+sum);
}


}

