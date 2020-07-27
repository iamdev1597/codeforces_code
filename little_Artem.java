import java.util.*;
import java.io.*;
import java.lang.*;
public class little_Artem
{
  public static void main(String[] args) throws java.lang.Exception
  {
    Scanner scan=new Scanner(System.in);
    int t=scan.nextInt();
    while(t-->0){
        int n=scan.nextInt();
        int m=scan.nextInt();
        char[][] matrix=new char[n][m];
        char str='B';
        char str1='W';
        for(int i=0;i<n;i++){
          for(int j=0;i<m;j++){
            if(j%2==0)
             matrix[i][j]=str;
            else
             matrix[i][j]=str1;
          }
        }
        for(int i=0;i<n;i++){
          for(int j=0;i<m;j++){
          System.out.print(matrix[i][j]);
          }
          System.out.println();
        }
    }
  }
}
