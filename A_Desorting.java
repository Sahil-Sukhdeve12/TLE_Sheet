import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A_Desorting{
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

                int min_diff=Integer.MAX_VALUE;

                for(int i=1; i<n; i++){
                    min_diff=Math.min(min_diff,arr[i]-arr[i-1]);
                }
                System.out.println((min_diff<0)?0:min_diff/2+1);
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }

    /*To make a
 not sorted, we just have to make ai>ai+1
 for one i
.

In one operation, we can reduce the gap between two adjacent elements i,i+1
 by 2
 by adding 1
 to 1…i
 and subtracting 1
 from i+1…n
.

It is clearly optimal to pick the smallest gap between a pair of adjacent elements to minimize the number of operations we have to do. If we have ai=x,ai+1=y
, we can make x>y
 within ⌊(y−x)2⌋+1
 operations.

Thus, we can just go through a
, find the minimum difference gap, and calculate the minimum operations using the above formula. Note that if a
 is not sorted, we can just output 0
. */

    public static boolean isSorted(int nums[]){
        for(int i=1; i<nums.length; i++){
            if(nums[i]<nums[i-1]) return false;
        }

        return true;
    }
}