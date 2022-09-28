import java.util.*;
public class Oddout {
    Scanner sc=new Scanner(System.in);
    void incomp()
    {
        int t=sc.nextInt();int[]ans=new int[t];
        for (int i=0;i<t;i++)
        {
            int n=0;
            n=sc.nextInt();int[]arr=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            for(int k=0;k<n;k++)
            {
                int count=1;
                for(int l=0;l<n;l++)
                {
                    if(l==k)
                    {
                        continue;
                    }
                    if(arr[l]==arr[k])
                    {
                        count++;
                    }
                }
                if(count!=2)
                {
                    ans[i]=arr[k];
                    break;
                }
            }
        }
        for(int x=0;x<t;x++)
        {
            System.out.println(ans[x]);
        }
    }
    public static void main(String[]Args)
    {
        Oddout obj=new Oddout();
        obj.incomp();
    }
}
