import java.io.*;
import java.lang.*;
import java.util.*;
public class road
{
  public static void main(String[] args) throws java.lang.Exception
  {
    Scanner scan=new Scanner(System.in);
    int t=scan.nextInt();
    while(t-->0){
    int a=scan.nextInt();
    int b=scan.nextInt();
    int q=scan.nextInt();
    while(q-->0){
      long l=scan.nextLong();
      long r=scan.nextLong();
      if(r>a&&r>b){
        if(l<a){
        long total=r-a;
        if(total%2==0)
        System.out.print(total-2+" ");
        else
        System.out.print(total-1+" ");
      }if(l>a&&r>a){
        long total=(r-l)-a;
        System.out.print(total-2+" ");
      }
    }else{
      System.out.println(0);
    }
    }
  }
}
}
