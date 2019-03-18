import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int array[][] = new int[num][2];
		//x와 y를 가지는 배열 5개
		
		for(int i=0;i<num;i++) {
			array[i][0] = scan.nextInt();
			array[i][1] = scan.nextInt();
			//scan.nextInt()하면 문장에서 int형만 찾는가 봉가!?
		}
		
		//노가다 하지 맙시다.
		
		Arrays.sort(array, new Comparator<int []>() {
			//Comparator -> 기본 정렬 기준 외에 다른 기준으로 정렬하고자 할 때
			//Comparator<기본 정렬 기준>
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[0]==o2[0]) return Integer.compare(o1[1], o2[1]);
				//x값이 같으면 y값 비교해서 작은 값 반환
				return Integer.compare(o1[0], o2[0]);
				//같지 않으면 x값만 비교해서 작은 값 반환
			}
			
		});
		
		
		
		for(int i=0;i<num;i++) {
			System.out.println(array[i][0] + " " + array[i][1]);
		}
		
	}
}
