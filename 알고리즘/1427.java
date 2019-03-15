import java.util.Arrays;
import java.util.Scanner;

public class Treasure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String l = scan.nextLine();
		int n = l.length();
		char array[] = new char[n];
		
		
		for(int i=0;i<n;i++) {
			array[i] = l.charAt(i);
		}
		
		Arrays.sort(array);
		
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]);
		}
	}
}

