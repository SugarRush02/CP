import java.util.*;
public class Remaind {
    Scanner sc=new Scanner(System.in);
    void incomp()
    {
        int t=sc.nextInt();int[]r=new int[t];
        for(int i=0;i<t;i++)
        {
            int a=0;int b=0;int c=0;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if(c<2 || a<1)
            {
                r[i]=0;
                continue;
            }
            r[i]=(a*b)%c;
        }
        for(int j=0;j<t;j++)
        {
            System.out.println(r[j]);
        }
    }
    public static void main(String[]Args)
    {
        Remaind obj=new Remaind();
        obj.incomp();
    }
}
