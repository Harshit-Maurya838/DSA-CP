import java.io.*;
import java.util.*;
 
public class Main {
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int len = 0;
 
        private int read() throws IOException {
            if(ptr >= len){
                len = in.read(buffer);
                ptr = 0;
                if(len <= 0){
                    return -1;
                }
            }
            return buffer[ptr++];
        }
 
        int nextInt() throws IOException {
            int c;
            while((c = read()) <= ' '){
                if (c == -1) return -1;
            }
 
            int sign = 1;
            if(c == '-'){
                sign = -1;
                c = read();
            }
 
            int val = 0;
            while(c > ' '){
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }
    }
 
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();
 
        int t = fs.nextInt();
 
        while(t-- > 0){
            int n = fs.nextInt();
 
            int mn = Integer.MAX_VALUE;
            int mx = Integer.MIN_VALUE;
 
            for(int i = 0; i < n; i++){
                int x = fs.nextInt();
                mn = Math.min(mn, x);
                mx = Math.max(mx, x);
            }
 
            out.append((mx - mn + 1) / 2).append('
');
        }
 
        System.out.print(out);
    }
}