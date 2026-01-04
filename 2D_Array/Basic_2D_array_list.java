import java.util.*;



public class Basic_2D_array_list {

    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> arr= new ArrayList<>();

        ArrayList<Integer> a= new ArrayList<>();
        a.add(1);a.add(2);a.add(3);

         ArrayList<Integer> b= new ArrayList<>();
        b.add(2);b.add(9);b.add(8);

         ArrayList<Integer> c= new ArrayList<>();
        c.add(4);c.add(5);c.add(3);

        arr.add(a);
        arr.add(b);
        arr.add(c);

        //print array
        // System.out.println(a);
        //   System.out.println(b);
        //     System.out.println(c);


        for(int i=0;i<arr.size();i++)
        {
            for(int j=0;j<arr.size();j++)
            {
                System.out.print(arr.get(i).get(j));
         
            }
            System.out.println(" ");
        }

    
    }
    
}

