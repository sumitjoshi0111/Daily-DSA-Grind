

public class Row_Sum {

    public static void main(String[] args) {
        
         int[][] num= {{10,20,25,16,8},{57, 9,13,56,76},{8,7,2,1,11}};

        int max_sum=Integer.MIN_VALUE;
        int row=-1;


        for (int i=0;i<num.length;i++)
        { int sum=0;
          

            for(int j=0;j<num[0].length;j++)
            {
                sum+=num[i][j];

            }

            if(sum>max_sum)
            {
                max_sum=sum;
                row=i;
            }


        }

        System.out.println(row+"->"+max_sum);
    }
    
}
