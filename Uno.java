import java.util.Scanner;
import java.util.HashSet;
public class Uno { 
	public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();String[]ans=new String[t];
		for(int j=0;j<t;j++){
		    int n = sc.nextInt();
		    HashSet<Integer> a = new HashSet<>();
		    HashSet<Integer> b = new HashSet<>();
		    HashSet<Integer> c = new HashSet<>();
		    for(int i=0;i<n;i++){
		        a.add(sc.nextInt());
		    }
		    for(int i=0;i<n;i++){
		        b.add(sc.nextInt());
		    }
		    for(int i=0;i<n;i++){
		        c.add(sc.nextInt());
		    }
		    int al = a.size();
		    int bl = b.size();
		    int cl = c.size();
		    if((al<bl && al<cl) || (al==bl && al==cl)) ans[j]="A";
		    else if((bl<al && bl<cl) || (bl<al && bl==cl))ans[j]="B";
		    else ans[j]="C";
		}
        for(int k=0;k<t;k++)
        {
            System.out.println(ans[k]);
        }
        sc.close();
	}
}
