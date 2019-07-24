import java.util.Scanner;

public class CCC10S2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    String[] value = new String[N];
	    String[] key = new String[N];
	    for (int i=0; i<N; i++) {
	    	value[i] = sc.next();
	    	key[i] = sc.next();
	    }
	    String S = sc.next();
	    
	    while(true) {
	    	for(int i=0; i<N; i++) {
	    		if(S.startsWith(key[i])) {
	    			System.out.print(value[i]);
	    			S = S.substring(key[i].length());
	    		}
	    	}
	    	if(S.equals("")) {
	    		break;
	    	}
	    }
	}

}
