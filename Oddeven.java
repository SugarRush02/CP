
import java.util.*;
public class Oddeven {
    Scanner sc=new Scanner(System.in);
    void incomp()
    {
        int t=sc.nextInt(); String []oddeve=new String[t];
        int[]n=new int[t];
        for(int i=0;i<t;i++)
        {
            n[i]=sc.nextInt();
            int a=0;
            for(int j=0;j<n[i];j++)
            {
                a=sc.nextInt();
                if(a==0)
                {
                    a=1;
                }  
                else
                {
                    a=0;
                }    
            }
            if(a==0)
            {
                oddeve[i]="Even";
            }
            else
            {
                oddeve[i]="Odd";
            }
        }
        for(int k=0;k<t;k++)
        {
            System.out.println(oddeve[k]);
        }
    }
    public static void main(String[]Args)
    {
        Oddeven obj=new Oddeven();
        obj.incomp();
    }
}
