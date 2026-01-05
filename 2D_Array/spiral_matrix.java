import java.util.ArrayList;

public class spiral_matrix {

    public static ArrayList<Integer> Spirally_Print(int[][] arr)
    { 
        ArrayList<Integer>ans = new ArrayList<>();

        int m=arr.length, n=arr[0].length;
        int fr=0, lr=m-1;
        int fc=0, lc=n-1;
        

        while(fr<=lr && fc<=lc)
        {
            for(int j=fc;j<=lc;j++)
            {
                ans.add(arr[fr][j]);
            }
            fr++;
            if(fr>lr ||fc>lc) break;
            for(int i=fr;i<=lr;i++)
            {
                ans.add(arr[i][lc]);
            }
            lc--;
            if(fr>lr ||fc>lc) break;
            for(int j=lc;j>=fc;j--)
            {
                ans.add(arr[lr][j]);
            }
            lr--;
            if(fr>lr ||fc>lc) break;
            for(int i=lr;i>=fr;i--)
            {
                ans.add(arr[i][fc]);
            }
            fc++;
        }

        return ans;
    }
    public static void main(String[] args) {

        int[][] arr={{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30}};
        System.out.println(Spirally_Print(arr));
        
    }
    
}
