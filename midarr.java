import java.util.*;
class midarr{
  public static void main(String args[])
  {
    Scanner v=new Scanner(System.in);
    int n=v.nextInt();
    int ns[]=new int[n];
    int k=0,s=0;
    for(int i=0;i<n;i++){
        s+=i;
        ns[k]=s;
        k++;
    }
    System.out.println((ns[n/2]));
    }
}