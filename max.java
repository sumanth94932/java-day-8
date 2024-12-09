import java.util.*;

class max {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max)
                max=arr[i]       }
 
        System.out.println("max element:"+max);
        }
}

/* 1 3 5 1 3                         
[0, 2, 0, 2, 0, 1]   */