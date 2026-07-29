import java.io.*;
import java.util.*;
 
public class Main{
 
    static class FastScanner{
        private final InputStream in=System.in;
        private final byte[] buffer=new byte[1<<16];
 
        private int ptr=0,len=0;
 
        private int read() throws IOException{
            if(ptr>=len){
                len=in.read(buffer);
                ptr=0;
                if(len<=0)return -1;
            }
            return buffer[ptr++];
        }
 
        long nextLong() throws IOException{
            int c;
 
            while((c=read())<=' '){
                if(c==-1)return -1;
            }
 
            long sign=1;
 
            if(c=='-'){
                sign=-1;
                c=read();
            }
 
            long val=0;
 
            while(c>' '){
                val=val*10+(c-'0');
                c=read();
            }
 
            return val*sign;
        }
 
        int nextInt() throws IOException{
            return (int)nextLong();
        }
    }
 
    public static void main(String[] args) throws Exception{
 
        FastScanner fs=new FastScanner();
 
        StringBuilder ans=new StringBuilder();
 
        int tc=fs.nextInt();
 
        while(tc-->0){
 
            int m=fs.nextInt();
 
            long[] x=new long[m];
            long[] y=new long[m];
 
            for(int i=0;i<m;i++)x[i]=fs.nextLong();
 
            for(int i=0;i<m;i++)y[i]=fs.nextLong();
 
            long total=0;
            long add=0;
 
            for(int i=0;i<m;i++){
 
                total+=Math.max(x[i],y[i]);
 
                add=Math.max(add,Math.min(x[i],y[i]));
            }
 
            ans.append(total+add).append('
');
        }
 
        System.out.print(ans);
    }
}