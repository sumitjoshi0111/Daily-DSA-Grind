public class ReverseArray {

    public static void main(String[] args) {
        
        int[] arr= {10,20,45,3,5,6,29,27,46,12,34,22,111};
        

        System.out.println("Before Reversing array:");
         for(int x=0;x<arr.length;x++)
        {   
           System.out.print(arr[x]+" ");
            
        }

        int i=0;
        int j= arr.length- 1;
        for(i=0;i<arr.length/2;i++)
        {   
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
            
        }

        System.out.println("After Reversing array:");

        for( int x=0;x<arr.length;x++)
        {   
            System.out.print(arr[x]+" ");
            
        }
    }
    
}
