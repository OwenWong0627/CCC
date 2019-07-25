import java.util.Arrays;
import java.util.Scanner;
public class CCC17S3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] wood = new int[2001];
		int N = sc.nextInt(); // Number of wood
		for (int i=0; i<N; i++) {
			int L = sc.nextInt();
			wood[L]++;
		}
		int[] fence = new int[4001];
		for (int i=1;i<wood.length;i++) { //first wood
			for (int j=1; j<wood.length; j++) { //second wood
				if(i<=j) {
					if(i!=j) {
						fence[i+j] += Math.min(wood[i], wood[j]);
					}else {
						fence[i+j] += wood[i]/2;
					}
				}
			}
		}
		Arrays.sort(fence);
		int max = fence[4000];
		int total = 0;
		for (int H=2; H<4001; H++) {
			if (max==fence[H]) {
				total++;
			}
		}
		System.out.println(max+" "+total);
	}

}
