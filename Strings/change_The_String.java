public class change_The_String {

    public static String modify(String s)
    {
      char ch=s.charAt(0);
        if(Character.isLowerCase(ch)){
           return s.toUpperCase();

        }
        else{
           return s.toLowerCase();
        }
       
    }
    public static void main(String[] args) {
        String str="Sumit";

       System.out.println(modify(str)); 
    }
    
}
