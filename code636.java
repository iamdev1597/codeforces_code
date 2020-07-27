import java.io.*;
import java.util.*;
import java.lang.*;
public class code636
{
  public static void main(String[] args) throws java.lang.Exception
  {
    Scanner scan=new Scanner(System.in);
    int t=scan.nextInt();
    while(t-->0){
      int n=scan.nextInt();
      int a=scan.nextInt();
      int b=scan.nextInt();
      int c=scan.nextInt();
      int d=scan.nextInt();
      int ab=a-b;
      int ab1=a+b;
      int cd=c-d;
      int cd1=c+d;
      int nab=n*ab;
      int nab1=n*ab1;
    if(nab==cd){
      System.out.println("Yes");
    }else if(nab==cd1){
        System.out.println("Yes");
    }else if(nab1==cd){
        System.out.println("Yes");
    }else if(nab1==cd1){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }

    }
  }
}
