import java.util.*;
import java.io.*;
import java.lang.*;
public class level{
      public static void main(String[] args) throws java.lang.Exception
        {
           Scanner scan = new Scanner(System.in);
           int t=scan.nextInt();
           while(t-->0){
               String str="NO";
               int n=scan.nextInt();
               int[][] mat=new int[n][2];
               for(int i=0;i<n;i++){
                 for(int j=0;j<2;j++){
                   mat[i][j]=scan.nextInt();
                 }
               }
               int plays=0;
               int clears=0;
               int plays1=0;
               int clears1=0;

               if(n==1&&mat[0][0]>mat[0][1])
               {
                 str="YES";
               }
               else if(n==2)
               {
                 if((mat[1][0]>mat[0][0])&&(mat[1][1]>mat[0][1])){
                   str="YES";
                 }
               }
               else
               {
                 plays=mat[1][0]-mat[0][0];
                 clears=mat[1][1]-mat[0][1];
                 if((plays<0)||(clears<0))
                 {
                   str="NO";
                 }

                 for(int i=1;i<n;i++)
                 {
                     plays1=mat[i][0]-mat[i-1][0];
                     clears1=mat[i][1]-mat[i-1][1];

                    if((plays1<plays)||(clears1<clears))
                     {
                       str="NO";
                     }
                    if((plays-plays1==1)||(plays1==0))
                     {
                         if((clears-clears1==1)||(clears1==0))
                            {
                               str="YES";
                            }
                     }
                    if((plays1==plays)&&(clears1==clears))
                     {
                       str="YES";
                     }
                 }
               }

            System.out.println(str);
           }
    }
}
