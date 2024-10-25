import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.*;

public class A_How_Much_Does_Daytona_Cost{
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
                int k=in.nextInt();
                int arr[]=new int[n];

                for(int i=0; i<n; i++) arr[i]=in.nextInt();

                //  HashMap<Integer,Integer>map=new HashMap<>();

                // for(int i=0; i<n; i++){
                //     arr[i]=in.nextInt();
                //     map.put(arr[i],map.getOrDefault(arr[i],0)+1);
                // }

                // System.out.println(map);
                
                // int freq[]=new int[n];
                // int idx=0;
                // for(int v:map.values()){
                //     freq[idx++]=v;
                // }

                // int max=0;
                // for(int i:map.values()){
                //     if(i>=max) max=i;
                // }

                // boolean found=false;
                // for(Map.Entry<Integer,Integer>entry:map.entrySet()){
                //     Integer key=entry.getKey(),val=entry.getValue();

                //     if(key==k && val==max){
                //         System.out.println("YES");
                //         found=true;
                //         break;
                //     }
                // }

                // if(!found){
                //     System.out.println("NO");
                // }
                boolean flag=false;

                for(int i=0; i<n; i++){
                    if(arr[i]==k){
                       flag=true;
                       break;
                    }
                    
                }

                if(flag) System.out.println("YES");
                else System.out.println("NO");

                

               
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}