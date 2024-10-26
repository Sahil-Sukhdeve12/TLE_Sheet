import java.io.*;
import java.util.*;

public class B_Sequence_Game{
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
                // int arr[]=new int[n];

                // for(int i=0; i<n; i++) arr[i]=in.nextInt();

                List<Integer>list=new ArrayList<>(n);
                List<Integer>ans=new ArrayList<>();

                for(int i=0; i<n; i++) list.add(in.nextInt());

                ans.add(list.get(0));

                for(int i=1; i<n; i++){
                    if(list.get(i-1)>list.get(i)){
                        ans.add(list.get(i));
                        ans.add(list.get(i));
                    }
                    else ans.add(list.get(i));
                }

                System.out.println(ans.size());
                for(int val:ans){
                    System.out.print(val+" ");
                }
                System.out.println();
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}