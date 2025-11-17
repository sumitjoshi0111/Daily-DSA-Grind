public class Print_Column {
    

    public static void main(String[] args) {
        int[][] num= {{10,20,25,16,8},{57, 9,13,56,76},{8,7,2,1,11}};

        for(int j=0;j<num[0].length;j++)
        {
            for(int i=0;i<num.length;i++)
            {
                System.out.print(num[i][j]+" ");
            }

            System.out.println("");
        }
    }
}
