public class SecondLargest {
    
    public static void main(String[] args) {
        int[] arr={10,20,30,5,45,16,4,9,1};
       
       //maximum Numfind kara:
        int max=Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>max)
        {
            max=arr[i];

        }
    }

    System.out.println("The Second Largest number:"+max);

    int smax=Integer.MIN_VALUE;

       for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>smax && arr[i]!=max )
        {
            smax=arr[i];

        }
    }

    System.out.println("The Second Largest number:"+smax);

    }
}
