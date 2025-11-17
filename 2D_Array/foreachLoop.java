public class foreachLoop {

    public static void main(String[] args) {
        int[][] num= {{10,20,25,16,8},{57, 9,13,56,76},{8,7,2,1,11}};

        for(int[] a: num){

            for(int ele:a)
            {
                System.out.print(" "+ele);
            }

            System.out.println();
        }
    }
    
}
