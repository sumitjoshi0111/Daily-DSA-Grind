public class Transpose2 {

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
    
    public static int[][] transpose(int[][] arr) {

           int  row=arr[0].length;
            int col=arr.length;

            int[][] brr= new int[row][col];

            for(int i=0;i<brr.length;i++)
        {
            for(int j=0;j<brr[0].length;j++)
            {
                brr[i][j]=arr[j][i];

            }
        }

        return brr;
        
    }

    public static void main(String[] args) {
        int[][] arr= {{2,8,3,4},{7,2,1,6},};

        System.out.println("Matrix Before transpose:");
        print(arr);
        System.out.println("Matrix After transpose:");
       print(transpose(arr)); 

    }
    
}
