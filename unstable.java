import java.io.*;
import java.lang.*;
import java.util.*;
public class unstable
{
  public static void main(String[] args) throws java.lang.Exception
  {
    Scanner scan=new Scanner(System.in);
    int t=scan.nextInt();
    while(t-->0){
    long n=scan.nextLong();
    long m=scan.nextLong();
    if(n==1){
      System.out.println(0);
    }
    else if(n==2){
      System.out.println(m);
    }
    else if(n==m){
      System.out.println(2*n);
    }
    else if(m-n==1){
      if(n%2!=0){
        System.out.println(2*m);
      }else{
        System.out.println(2*n);
      }
    }else{
      System.out.println(2*m);
    }
    }
  }
}
