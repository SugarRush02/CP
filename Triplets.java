import java.util.*;
import java.lang.Math;
public class Triplets {
    Scanner sc=new Scanner(System.in);
    void incomp()
    {
        int t=sc.nextInt();int[]ans=new int[t];
        for(int i=0;i<t;i++)
        {
            int l=0;int m=0;
            l=sc.nextInt();
            double cl=Math.cbrt(l);
            m=sc.nextInt();
            double cm=Math.cbrt(m);
            for(int j=(int)cl;j<=(int)cm;j++)
            {
                int sum=0;
                int cn=j*j*j;
                sum=l+m+cn;
                if(sum%9==0)
                {
                    ans[i]=cn;
                    break;
                }
            }
        }
        for(int k=0;k<t;k++)
        {
            System.out.println(ans[k]);
        }
    }
    public static void main(String[]Args)
    {
        Triplets obj=new Triplets();
        obj.incomp();
    }
}
