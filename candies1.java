import java.io.*;
import java.util.*;
import java.lang.*;
public class candies1
{
  public static void main(String[] args) throws java.lang.Exception
  {
    Scanner scan=new Scanner(System.in);
    int t=scan.nextInt();
    while(t-->0)
    {
       long x=0,k=2;
       int n=scan.nextInt();
       while(true)
       {
          long k1=(long)Math.pow(2,k);
          long x1=k1-1;
          if(n%x1==0){
            long nx=n/x1;
            System.out.println(nx);
            break;
          }
          k++;
       }
    }
  }
}
