import java.util.*;
public class Oddity {
    Scanner sc=new Scanner(System.in);
    void incomp()
    {
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=0;
            n=sc.nextInt();int[]arr=new int[n];arr[0]=0;arr[1]=1;int n1=0;int n2=1;
            for(int j=2;j<n;j++)
            {
                int n3=n1+n2;
                n1=n2;
                n2=n3;
                arr[j]=n3%10;
            }
            int x=n;
            while(arr[1]==0)
            {
                for(int k=0;k<x;k++)
                {
                    if(k%2==0)
                    {
                        arr[k]=0;
                    }
                }
                for(int l=0;l<x;l++)
                {

                }
            }
        }
    }
    public static void main(String[]Args)
    {
        Oddity obj=new Oddity();
        obj.incomp();
    }
}
