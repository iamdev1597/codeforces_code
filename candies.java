import java.io.*;
import java.util.*;
import java.lang.*;
public class candies
{
public static void main(String[] args) throws java.lang.Exception
{
  Scanner scan =new Scanner(System.in);
  int t=scan.nextInt();
  while(t-->0){
  long n=scan.nextLong();
  if(n%2==0){
  System.out.println(n/2-1);
  }else{
  System.out.println(n/2);
  }
  }
}
}
