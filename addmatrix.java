import java.util.*;
public class addmatrix {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr1[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr1[i][j]=sc.nextInt();
      }
    }
    int r1=sc.nextInt();
    int c1=sc.nextInt();
    int arr2[][]=new int[r1][c1];
    for(int i=0;i<r1;i++)
    {
      for(int j=0;j<c1;j++)
      {
        arr2[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        System.out.print(arr1[i][j]+arr2[i][j]+" ");
      }
      System.out.println();
    }
    
  }
}/*
2
2
3 5
6 8
2
2
7 8
6 2
10 13 
12 10  */