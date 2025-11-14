

public class Max_2d {
    public static void main(String[] args) {
        
        int[][] num= {{10,20,25,16,8},{57, 9,13,56,76},{8,7,2,1,11}};

        int max=num[0][0];
        
        for(int i=0; i<num.length;i++)
        {
            for(int j=0;j<num[0].length;j++)
            {
                if(max<num[i][j])
                {
                    max=num[i][j];
                }
            }
            
        }

        System.out.println("Maximum Element in Array:"+max);

        for(int i=0; i<num.length;i++)
        {
            for(int j=0;j<num[0].length;j++)
            {
                System.out.print(num[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
}
