import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	
	public static int max(int a, int b) {
		return a>b ? a:b;
	}
	
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] wine = new int[n+1];
		int[] winetry = new int[n+1];
		
		for(int i=1;i<n+1;i++) {
			wine[i] = Integer.parseInt(br.readLine());
		}
		
		winetry[1] = wine[1];
		
		if(n>1) {
			winetry[2] = wine[1] + wine[2];
		}
		
		if(n>2) {
			for(int j=3;j<n+1;j++) {
				winetry[j] = max(max(winetry[j-1],winetry[j-2]+wine[j]),winetry[j-3]+wine[j-1]+wine[j]);
			}
		}
		System.out.println(winetry[n]);
	}
	
}

