import java.io.*;
import java.util.*;
import java.lang.*;
public class balanced_array
{
  public static void main(String[] args) throws java.lang.Exception
  {
    Scanner scan=new Scanner(System.in);
    int t=scan.nextInt();
    while(t-->0)
    {
      int ev=0,od=0;
      int n=scan.nextInt();
      int[] even=new int[n/2];
      int[] odd=new int[n/2];
      if(n%4==0){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
      for(int i=0;i<n/2;i++){
        even[i]=2*(i+1);
        ev=ev+even[i];
      }
      for(int i=0;i<n/2;i++){
        odd[i]=1+2*i;
        od=od+odd[i];
      }
      if(od<ev){
        i++;
        odd[n-1]=1+2*i;
      }

    }
  }
}
