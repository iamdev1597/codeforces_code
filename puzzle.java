import java.util.*;
import java.io.*;
import java.lang.*;
public class puzzle
{
 public static void main(String[] args) throws java.lang.Exception
 {
 Scanner scan=new Scanner(System.in);
 int t=scan.nextInt();
 while(t-->0){
   int n=scan.nextInt();
   int m=scan.nextInt();
   if(n==1){
     System.out.println("YES");
   }else if(n==2&&m==2){
   System.out.println("YES");
   }else{
     System.out.println("NO");
   }
 }
 }
}
