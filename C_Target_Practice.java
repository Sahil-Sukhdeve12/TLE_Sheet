import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class C_Target_Practice{
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
                // int n=in.nextInt();
                char mat[][]=new char[10][10];

                for(int i=0; i<10; i++){
                    String line=in.next();
                    for(int j=0; j<10; j++){
                        mat[i][j]=line.charAt(j);
                    }
                }

                int count=0;

                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (mat[i][j] == 'X') {
                            if (i == 0 || i == 9 || j == 0 || j == 9) {
                                count += 1;
                            } else if (i == 1 || i == 8 || j == 1 || j == 8) {
                                count += 2;
                            } else if (i == 2 || i == 7 || j == 2 || j == 7) {
                                count += 3;
                            } else if (i == 3 || i == 6 || j == 3 || j == 6) {
                                count += 4;
                            } else if (i == 4 || i == 5 || j == 4 || j == 5) {
                                count += 5;
                            }
                        }
                    }
                }
                out.println(count);
                // out.println(String.valueOf(count));

            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}