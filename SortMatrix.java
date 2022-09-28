import java.util.*;
public class SortMatrix {
    Scanner sc=new Scanner(System.in);
    void incomp()
    { 
        int t=sc.nextInt();
        if(t<1)
        {
            t=1;
        }
        int n=0;
        int[][][]ans=new int[t][9][9]; 
        for(int l=0;l<t;l++)
        {
            n=sc.nextInt();
            if(n<2)
                    {
                    n=2;}
            int[][]arr=new int[n][n];int[]sum=new int[n];
            for(int i=0;i<n;i++)
            {
                sum[i]=0;
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=sc.nextInt();
                    sum[i]+=arr[i][j];
                }
            }
            for(int k=0;k<sum.length;k++)
            {
                for(int m=k+1;m<sum.length;m++)
                {
                    if(sum[k]>sum[m])
                    {
                        for(int o=0;o<n;o++)
                {
                    int sn=0;
                    sn=arr[k][o];
                    arr[k][o]=arr[m][o];
                    arr[m][o]=sn;
                }
                    }
                }
            }
            for(int p=0;p<n;p++)
        {
           for(int q=0;q<n;q++)
           {
            ans[l][p][q]=arr[p][q];
           }
        }
        }
        for(int x=0;x<t;x++)
        {
            for(int y=0;y<n;y++)
            {
                for(int z=0;z<n;z++)
                {
                    System.out.print(ans[x][y][z]);
                }
                System.out.println("");
            }
        }
    }
    public static void main(String[]Args)
    {
        SortMatrix obj=new SortMatrix();
        obj.incomp();
    }
}
