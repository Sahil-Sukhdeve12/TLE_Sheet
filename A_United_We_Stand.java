import java.io.*;
import java.util.*;

public class A_United_We_Stand{
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

                Arrays.sort(arr);

                List<Integer>list1=new ArrayList<>();
                List<Integer>list2=new ArrayList<>();

                int idx=0;
                while(idx<n && arr[idx]==arr[0]){
                    list1.add(arr[idx]);
                    idx++;
                }
                while(idx<n){
                    list2.add(arr[idx]);
                    idx++;
                }

                if(list2.size()==0) System.out.println(-1);
                else{
                    System.out.println(list1.size()+" "+list2.size());

                    for(int i:list1) System.out.print(i+" ");
                    System.out.println();
                    for(int i:list2) System.out.print(i+" ");
                    System.out.println();
                }
                
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}