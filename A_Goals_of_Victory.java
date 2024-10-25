import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A_Goals_of_Victory{
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
        /*
         each goal increases the efficiency of that team by 1,simulataenously decreases the efficiency
         of other team by 1 -> if we maintain the sum of efficiency for all teams each goal does not 
         change the sum.therefore, the sum must be 0.

         In order to make the sum to be 0
, the efficiency of the missing team must be equal to the sum of efficiency of the other n−1
 teams, multiplied by −1
.
         */
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int testCases=in.nextInt();
            while(testCases-- > 0){
                int n=in.nextInt();
                int arr[]=new int[n-1];

                for(int i=0; i<n-1; i++) arr[i]=in.nextInt();

                int sum=0;
                for(int i=0; i<arr.length; i++){
                    sum+=arr[i];
                }

                System.out.println(sum*-1);
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}