import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A_Array_Coloring{
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
                int n=in.nextInt();
                int arr[]=new int[n];

                for(int i=0; i<n; i++) arr[i]=in.nextInt();

                int oddsum=0,evensum=0;

                if(n==2){
                    oddsum+=arr[0];
                    evensum+=arr[1];
                }

                if(n>2){
                for(int i=0; i<n; i++){
                    if(arr[i]%2==0) evensum+=arr[i];
                    else oddsum+=arr[i];
                }
                }

                System.out.println((evensum%2==0 && oddsum%2==0 || evensum%2!=0 && oddsum%2!=0)?"YES":"NO");
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}