public class Transpose {


    public static void print(int[][] arr)
    {
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        int[][] arr= {{2,8,3,4},{7,2,1,6},{5,5,4,1},{3,1,8,2}};
        System.out.println("Matrix Before Transpose:");
        print(arr);
        // Transpose

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }

        System.out.println("Matrix after Transpose:");
        print(arr);

    }
    
}
