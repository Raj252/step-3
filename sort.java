import java.util.*;
import java.lang.*;
class Sort
{
      public static void main(String arg[])
      {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();

        }
       Arrays.sort(a);
       int t=n/2;
       for(int i=0;i<n;i++)
       {
      
               System.out.print(a[i]+" ");
       }
      
}
}
