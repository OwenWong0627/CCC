import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class CCC18J5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Store the relationship to a data structure
	    
	     //Array of arrayList
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    ArrayList<Integer>[] map = new ArrayList[N];
	    
	// 3     the number of pages    the number of vertice
	// 2 2 3   
	// 2 represent page 0 contains 2 next pages  
	// page 0 has page 1 and 2 as next page
	// 0
	// 0
	  
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
	    
	  
	    //check if every page is reached
	    

	    //Step 2: then you need to create a step array after you create the map
	    
	    // We are using step array to keep track of how many steps from the
	    // beginning pages to any other pages
	    
	    int[] step = new int[N];
	    Arrays.fill(step, Integer.MAX_VALUE);
	    //make sure set every array elements's step value to Integer.MAX_VALUE
	    //Integer.MAX_VALUE represent the you have not visited that page yet.
	    
	    //Step 3. Create a LinkedList to store all the processing order
	    //You can write the code below
	    LinkedList<Integer> queue = new LinkedList<Integer>();
	    
	    //Each element of the linkedlist is to record the processing order
	    //Only use quee as the name of the LinkedList.
	    //We use queue to store the processing order
	    
	    //Wrtite below code
	    //Step 4. Set the first page's step value to 1
	    step[0] = 1;
	    
	    
	    
	    //Step 5. Add the first page to queue
	    
	    //Remember is adding the first page number to the queue
	    queue.add(0);
	    
	    while(!queue.isEmpty()) {
	        //read page number from queue one by one
	        int curPage = queue.poll();
	        for (int i=0; i<map[curPage].size(); i++) {
	             int nextPage = map[curPage].get(i);
	             if (step[nextPage]>step[curPage]+1) {
	                 step[nextPage] = step[curPage]+1;
	                 queue.add(nextPage);
	            }
	        }        
	    }
	    
	    
	    //find out the smallest step value for all the ending page
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
