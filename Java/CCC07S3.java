import java.util.*;

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
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[] distance = new int[10000];
		while(x!=0&&y!=0) {
			for(int i=0; i<10000; i++) {
				distance[i]=-2;
			}
			distance[x] = -1;
			LinkedList<Integer> queue = new LinkedList<Integer>();
			queue.add(x);
			boolean[] visited = new boolean[10000];
			Arrays.fill(visited, Boolean.FALSE);
			while(!queue.isEmpty()) {
				int currentPoint = queue.poll();
				int nextPoint = friend[currentPoint];
				if(visited[nextPoint] == false) {
					distance[nextPoint] = distance[currentPoint]+1;
					queue.add(nextPoint);
				}
				visited[currentPoint] = true;
			}
			
			if(distance[y]!=-2) {
				System.out.println("Yes " + distance[y]);
			}else {
				System.out.println("No");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
	}
}
