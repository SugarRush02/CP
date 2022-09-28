import java.util.*;
public class Triplet {
    Scanner sc=new Scanner(System.in);
    void incomp()
    {
        int t=sc.nextInt();int[]ans=new int[t];
        for(int i=0;i<t;i++)
        {
            int l=0;int m=0;int sum=0;int rd=0;
            l=sc.nextInt();
            m=sc.nextInt();
            do{
            rd=(int)Math.floor(Math.random()*(1000)+1);
            sum=l+m+rd;
            }
            while(sum%9!=0);
            ans[i]=rd;
        }
        for(int k=0;k<t;k++)
        {
            System.out.println(ans[k]);
        }
    }
    public static void main(String[]Args)
    {
        Triplet obj=new Triplet();
        obj.incomp();
    }
}
