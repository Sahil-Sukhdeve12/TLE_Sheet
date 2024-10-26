import java.io.*;
import java.util.*;

public class A_Forbidden_Integer{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
		private final BufferedWriter bw;

		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}
    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int testCases=in.nextInt();
            while(testCases-- > 0){
                int n=in.nextInt(),k=in.nextInt(),x=in.nextInt();

                
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
/*if (x != 1) {

                    out.println("YES");

                    out.println(n);
                    for (int i = 0; i < n; i++) {
                        out.print(1 + " ");
                    }
                    
                    out.println("");
                } else if (k == 1 || (k == 2 && n % 2 == 1)) {
                    out.println("NO");
                } else {
                    out.println("YES");
                    out.println(n / 2);
                    if (n % 2 == 1) {
                        out.print(3 + " ");
                        for (int i = 1; i < n / 2; i++) {
                            out.print(2 + " ");
                        }
                    } else {
                        for (int i = 0; i < n / 2; i++) {
                            out.print(2 + " ");
                        }
                    }
                    out.println(""); */