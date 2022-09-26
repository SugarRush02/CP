import java.util.*;
public class Bookcric {
    Scanner sc=new Scanner(System.in);
    void incomp()
    {
        int t=sc.nextInt();
        int[]n=new int[t];String []winner=new String[t];
        for(int i=0;i<t;i++)
        {
            n[i]=sc.nextInt();
            int []total={0,0};int []count={0,0};
            for(int j=0;j<2;j++)
            {
                for(int k=0;k<n[i];k++)
                {
                    int a=sc.nextInt();
                    if(a==0)
                    {
                        count[j]++;
                    }
                    total[j]+=a;
                    a=0;
                }
            }
            if(total[0]>total[1])
            {
                winner[i]="Piyush";
            }
            else if(total[1]>total[0])
            {
                winner[i]="Gokul";
            }
            else
            {
                if(count[0]<count[1])
                {
                    winner[i]="Piyush";
                }
                else if(count[1]<count[0])
                {
                    winner[i]="Gokul";
                }
                else
                {
                    winner[i]="Draw";
                }
            }
        }
        for(int l=0;l<t;l++)
        {
            System.out.println(winner[l]);
        }
    }
    public static void main(String[]Args)
    {
        Bookcric obj=new Bookcric();
        obj.incomp();
    }
}
