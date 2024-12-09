import java.util.*;
class sum{
    public static void main(String args[]){
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int ns[]=new int[n];
        int k=0,s=0;
        for(int i=1;i<=n;i++)
        {
            s+= i;
            ns[k]=s;
            k++;
        }
       System.out.println(Arrays.toString(ns));

    }
}