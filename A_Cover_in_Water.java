import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import javax.security.sasl.RealmChoiceCallback;
import javax.sound.sampled.SourceDataLine;

public class A_Cover_in_Water{
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
                String str=in.nextLine();

                int count=0;
                for(int i=0; i<str.length(); i++){
                    if(str.charAt(i)=='.') count++;
                }


                System.out.println(str.contains("...")?2:count);

            }
            /*
            If there are 3 consecutive empty cells i−1
, i
, i+1
, we can place water in cells i−1
 and i+1
 and then move water from cell i
 to all other cells. If there are no such cells, we have to place water on every empty cell.

So if we find substring ''...'' in the array, the answer is 2
, otherwise the answer is the number of empty cells. 
             */
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}