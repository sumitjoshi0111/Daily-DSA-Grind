public class Snake_pattern {

    public static void main(String[] args) {
        
        int[][] num= {{10,20,25,16,8},{57, 9,13,56,76},{8,7,2,1,11}};

        for(int i=0;i<num.length;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<num[i].length;j++)
                {
                    System.out.print(num[i][j]+" ");
                }

            }
            else{

                for(int j=num[0].length-1;j>=0;j--)
                {
                    System.out.print(num[i][j]+" ");
                }
            }

            System.out.println("");
        }

        
    }
    
}
