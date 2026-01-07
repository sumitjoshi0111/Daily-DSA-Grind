public class Sum_Substring {

    
    public static void main(String[] args) {

     String str="6759";
      int sum=0;

    for(int j=0;j<str.length();j++)
    {
         for(int i=j+1;i<=str.length();i++)
    {
        
        sum=sum+(Integer.parseInt(str.substring(j,i)));

    }
    
 }

 System.out.println("Input:"+str);
 System.out.println("Output:"+sum);
}
    
}
