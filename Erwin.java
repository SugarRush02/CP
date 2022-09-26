import java.util.*;
public class Erwin {
    Scanner sc=new Scanner(System.in);
    int t;int n=0;
    List<Integer> m = new ArrayList<>();
    void incomp()
    {
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int count=0;
            n=sc.nextInt();
            for(int j=0;j<n;j++)
            {
                int a=sc.nextInt();
                if(a%56==0)
                {
                    count++;
                }
                a=0;
            }
            m.add(count);
            n=0;
        }
        for(int k=0;k<t;k++)
        {
            System.out.println(m.get(k));
        }
    }
    public static void main(String Args[])
    {
        Erwin obj=new Erwin();
        obj.incomp();
    }   
}
