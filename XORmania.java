import java.util.*;
public class XORmania {
    public static void main(String[]Args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(); int ans[][]=new int[t][2];
        for(int i=0;i<t;i++)
        {
            ans[i][0]=-1;
            ans[i][1]=-1;
            int n=sc.nextInt();
            if(n%2==0)
            {
            for(int j=n-1,k=1;j>=n/2;j--,k++)
            {
                int sum=j+k;
                int x=j^k;
                if(sum==1)
                {
                    break;
                }
                if(sum==x)
                {
                    ans[i][0]=k;
                    ans[i][1]=j;
                    break;
                }
            }
            }
            else{
            for(int j=n-2,k=2;j>n/2;j--,k++)
            {
                int sum=j+k;
                int x=j^k;
                if(sum==1)
                {
                    break;
                }
                if(sum==x)
                {
                    ans[i][0]=k;
                    ans[i][1]=j;
                    break;
                }
            }
            }
        }
        for(int l=0;l<t;l++)
        {
            System.out.println(ans[l][0]+" "+ans[l][1]);
        }
        sc.close();
    }
}
