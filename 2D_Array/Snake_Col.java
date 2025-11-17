public class Snake_Col {
    
    public static void main(String[] args) {
        int[][] num= {{10,20,25,16,8},{57, 9,13,56,76},{8,7,2,1,11}};

        for(int j=0;j<num[0].length;j++)
        {
            if(j%2==0)
            {
                for(int i=0;i<num.length;i++)
            {
                System.out.print(num[i][j]+" ");
            }
            }
            else
            {
                for(int i=num.length-1;i>=0;i--)
            {
                System.out.print(num[i][j]+" ");
            }
            }
            System.out.println("");
        }
    }
}
