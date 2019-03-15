import java.util.Arrays;
import java.util.Scanner;

public class Treasure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int a[] = new int[num];
		int b[] = new int[num];
		
		for(int i=0;i<num;i++) {
			a[i] = scan.nextInt();
		}
		
		for(int i=0;i<num;i++) {
			b[i] = scan.nextInt();
		}
		
		Arrays.sort(a); //Arrays
		Arrays.sort(b);
	
		//최솟값 = a 정렬 오름차순 + b 정렬 내림차순
		//버블 정렬 사용
//		for(int i=num-1;i>0;i--) {
//			for(int j=0;j<i;j++) {
//				if(a[j] > a[j+1]) {
//					int tmp = a[j+1];
//					a[j+1] = a[j];
//					a[j] = tmp;
//				}
//				
//			}
//		}
//		
//		
//		for(int i=num-2;i>0;i--) {
//			for(int j=0;j<i;j++) {
//				if(b[j] < b[j+1]) {
//					int tmp = b[j+1];
//					b[j+1] = b[j];
//					b[j] = tmp;
//				}
//			}
//		}
//		
		
		for(int i=0;i<num;i++) {
			sum += a[i] * b[num-i-1];
		}
		
		System.out.println(sum);
		
	}

}
