import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] words = new String[n];
		
		for(int i=0;i<n;i++) {
			words[i] = scan.next();
		}
		
		//{but,or,and,no,na,no};
		//사전 기준으로 배열을 한다. -> {and,but,na,no,no,or}
		// Arrays.sort(words);
		
		//문자 길이 순으로 우선 배열함, 길이가 같으면 그 범위 내에서 사전순으로 배열
		for(int i=n-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(words[j].length() > words[j+1].length()) {
					String tmp = words[j+1];
					words[j+1] = words[j];
					words[j] = tmp;
				}
				if(words[j].length() == words[j+1].length()){
					Arrays.sort(words,j,j+2);
				}
			}
		}
		
		//같은 문자일 경우 제거를 한다.
// 		for(int i=0;i<n-1;i++) {
// 			if(words[i].equals(words[i+1])) {
// 				words[i] = null;
// 			}
// 		}
		
	//같은 문자일 경우 넘어간다. 결과 출력
		for(int i=0;i<n-1;i++) {
			if(words[i].equals(words[i+1])) continue;
			else {
				System.out.println(words[i]);
			}
		}

	}

}
