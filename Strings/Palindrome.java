import java.util.*;


public class Palindrome {
    public static void main(String[] args) {
        Scanner kk= new Scanner(System.in);
        String str="nitin";

        String s="";

        for(int i=str.length()-1;i>=0;i--)
        {
            s=s+str.charAt(i);
            
        }

        
    
            if(s.equals(str))
            {
             System.out.println("String is Palindrome,,");   
            }
            else{
            System.out.println("String is not palindrome.");
                }

        
        
        

    }
    
    }
