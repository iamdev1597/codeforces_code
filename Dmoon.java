import java.util.*;
import java.io.*;
import java.lang.*;
public class Dmoon
{
  static class Reader
   {
    final private int BUFFER_SIZE = 1 << 16;
    Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;
    public Reader()
    {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }
    public Reader(String file_name) throws IOException
    {
        din = new DataInputStream(new FileInputStream(file_name));
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }
    public String nextString() throws IOException
    {
        String str00 = scan.next();
        return str00;
    }
    public String readLine() throws IOException
    {
        byte[] buf = new byte[64];
        int cnt = 0, c;
        while ((c = read()) != -1)
        {
            if (c == '\n')
                break;
            buf[cnt++] = (byte) c;
        }
        return new String(buf, 0, cnt);
    }
    String next() throws IOException
    {
        int c;
        for (c = read(); c <= 32; c = read());
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = read())
        {
            sb.append((char) c);
        }
        return sb.toString();
    }
    public int nextInt() throws IOException
    {
        int ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do
        {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');
        if (neg)
            return -ret;
        return ret;
    }
    public long nextLong() throws IOException
    {
        long ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');
        if (neg)
            return -ret;
        return ret;
    }
    public double nextDouble() throws IOException
    {
        double ret = 0, div = 1;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');
        if (c == '.')
        {
            while ((c = read()) >= '0' && c <= '9')
            {
                ret += (c - '0') / (div *= 10);
            }
        }
        if (neg)
            return -ret;
        return ret;
    }
    private void fillBuffer() throws IOException
    {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1)
            buffer[0] = -1;
    }
    private byte read() throws IOException
    {
        if (bufferPointer == bytesRead)
            fillBuffer();
        return buffer[bufferPointer++];
    }
    public void close() throws IOException
    {
        if (din == null)
            return;
        din.close();
    }
    public int[] nextArray(int n) throws IOException
    {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = nextInt();
        }
        return a;
    }
}
  public static void main(String[] args) throws java.lang.Exception
  {
    Reader r=new Reader();
    int t=r.nextInt();
    while(t-->0){
         int n=r.nextInt();
         int x=r.nextInt();
         int[] arr=new int[n];
         for(int i=0;i<n;i++){
           arr[i]=r.nextInt();
         }
         if(n==1){
           System.out.println(n+x);
         }
         else{
             int nx=n+x;
             int count=0;
             for(int i=0;i<n;i++){
               if(arr[i]>nx){
                 count++;
               }
               if(arr[i]!=nx){
                 count++;
               }
             }
           }

     }
    }


  }
