import java.util.*;
public class rever{
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
    System.out.println("before reversing");
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }System.out.println("After reversing");
    for(int i=0;i<r;i++)
    {
      for(int j=c-1;j>=0;j--)
      {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
}