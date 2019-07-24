import java.util.Scanner;

public class CCC07S3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] friend = new int[10000];
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int first = sc.nextInt();
			int second = sc.nextInt();
			friend[first] = second;
		}
	}

}
