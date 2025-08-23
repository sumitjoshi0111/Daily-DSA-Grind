// here we have to print The Roll no of students who Scored Above 65, Below 60.
import java.util.*;

public class StudentMark
{
    public static void main(String arg[])
    {
        int[] mark={65,69,50,56,66,68,55,59,57,50,62};

        System.out.println("students who scored Above 65:");
        for(int i=0;i<mark.length;i++)
        {
            if(mark[i]>=65)
                System.out.println("Roll no:"+(i+1));
        }

        System.out.println("students who scored Below 60:");
        for(int i=0;i<mark.length;i++)
        {
            if(mark[i]<=60)
                System.out.println("Roll no:"+(i+1));
        }

    }
}