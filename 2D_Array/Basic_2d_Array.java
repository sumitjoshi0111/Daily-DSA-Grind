import java.util.*;

class Basic_2d_Array
{
    public static void main(String[] args) {
        
        int[][] num=new int[5][5];
        Scanner sc= new Scanner(System.in);


        //input

        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[0].length;j++)
            {
                num[i][j]=sc.nextInt();

            }
        }

        //output


        
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[0].length;j++)
            {
                System.out.println("My_Array["+i+"]["+j+"]:"+num[i][j]);
                
            }
        }
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[0].length;j++)
            {
                System.out.print(num[i][j]+" ");
                
            }
            System.out.println("");
        }



    }
}