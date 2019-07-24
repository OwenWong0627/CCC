import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class CCC18J5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc = new Scanner(System.in);
	   int N = sc.nextInt();
	   ArrayList<Integer>[] map = new ArrayList[N];
	   boolean[] ending = new boolean[N];
	   for (int i=0; i<N; i++) {
		 map[i] = new ArrayList<Integer>();
	     int total = sc.nextInt();
	     //base on total to set the ending page
	     if (total == 0){
	         ending[i] = true;
	     } else {
	         ending[i] = false;
	     }
	     for (int j=0; j<total; j++) {
	        int nextPage = sc.nextInt()-1;
	        map[i].add(nextPage);
	     }
	  }
	    int[] step = new int[N];
	    Arrays.fill(step, Integer.MAX_VALUE);
	    LinkedList<Integer> queue = new LinkedList<Integer>();

	    step[0] = 1;

	    queue.add(0);
	    
	    while(!queue.isEmpty()) {
	        int curPage = queue.poll();
	        for (int i=0; i<map[curPage].size(); i++) {
	             int nextPage = map[curPage].get(i);
	             if (step[nextPage]>step[curPage]+1) {
	                 step[nextPage] = step[curPage]+1;
	                 queue.add(nextPage);
	            }
	        }        
	    }
	    boolean reached = true;
	    int smallest = Integer.MAX_VALUE;
	    for (int i=0;i<N;i++){
	       if (step[i]==Integer.MAX_VALUE) {
	           reached = false;
	       }
	       if (ending[i] == true){
	          if(step[i]<smallest){
	            smallest = step[i];
	          }
	       }
	    }
	    if(reached == false){
	      System.out.println("N");
	    }else{
	      System.out.println("Y");
	    }
	      System.out.println(smallest);
	}

}
