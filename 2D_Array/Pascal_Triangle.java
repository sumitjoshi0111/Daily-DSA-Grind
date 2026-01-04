import java.util.*;

class Pascal_Triangle {
    public  static ArrayList<ArrayList<Integer>> generate(int numRows) {

        ArrayList <ArrayList<Integer>> ans = new ArrayList<>();

        for(int i=0;i<numRows;i++)
        {
            ArrayList<Integer> row= new ArrayList<>();

            for(int j=0;j<=i;j++)
            {
                if(j==0 ||j==i)
                {
                    row.add(1);
                }
                else
                {
                    int val=ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                    row.add(val);
            }
            
        }
        ans.add(row);
    }

        return ans;
    
        
     }
    public static void main(String[] args) {
        int numRows=5;
        generate(numRows);

    }
}

