import java.util.*;
public class All_Substring
 {
    public static void main(String[] args) {

     String str="gopi";

    for(int j=0;j<str.length();j++)
    {
         for(int i=j+1;i<=str.length();i++)
    {
        
        System.out.print(str.substring(j,i)+" "); 

    }
    System.out.println("");
 }
   
     

        
    
}
 }
