import java.io.*;
import java.lang.*;
import java.util.*;
public class game
{
public static void main(String[] args) throws java.lang.Exception
{
  Scanner scan=new Scanner(System.in);
  int t=scan.nextInt();
  while(t-->0){
  int x=scan.nextInt();
  int n=scan.nextInt();
  int m=scan.nextInt();
  int p=0;
  String s="NO";
  if(m*10>=x){
    s="YES";
  }
  else{
  while(n-->0){
       p=x/2;
      p=p+10;
      x=p;
    }
  while(m-->0){
     p=x-10;
     x=p;
   }

  if(x<=0)
     {
       s="YES";
     }
  else
     {
       s="NO";
     }
   }
   System.out.println(s);
  }
 }
}
