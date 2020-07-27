import java.io.*;
import java.util.*;
import java.lang.*;

public class covidcode{
   public static void main(String[] args) throws java.lang.Exception{
    Scanner scan=new Scanner(System.in);
    int t=scan.nextInt();
    while(t-->0){
        int count=0,sum=0;
      int n=scan.nextInt();
      int k=scan.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
        if(arr[i]==0){
          count++;
        }
        else if(count>k||count==n){
            sum+=1;
            count=0;
          }
        else if(arr[i]==1){
          count=0;
        }
      }

      System.out.println(sum);
    }
   }
}
