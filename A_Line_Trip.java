import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A_Line_Trip {
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
                int n=in.nextInt(),x=in.nextInt();
                int arr[]=new int[n];

                for(int i=0; i<n; i++) arr[i]=in.nextInt();

                int min_vol=0;
                int ans=Integer.MIN_VALUE;
                // for(int j=1; j<n; j++){
                //     ans=Math.max(ans,Math.abs(arr[j]-arr[j-1]));
                // }

                // min_vol=Math.max(ans,2*(x-arr[n-1]));
                int last=0;
                for(int j=0; j<n; j++){
                    ans=Math.max(ans,arr[j]-last);
                    last=arr[j];
                }

                min_vol=Math.max(ans,2*(x-last));

                System.out.println(min_vol);


            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}