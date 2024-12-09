import java.util.*;
public class minind2 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }
    int min=arr[0][0];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
       if(arr[i][j]<min)
            min=arr[i][j];
      }
    } System.out.println(min);
  }
      
}