import java.util.*;
public class CCC09J4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		ArrayList<String> words = new ArrayList<String>();
		words.add("WELCOME");
		words.add("TO");
		words.add("CCC");
		words.add("GOOD");
		words.add("LUCK");
		words.add("TODAY");
		ArrayList<Integer> length = new ArrayList<Integer>();
		length.add(7);
		length.add(2);
		length.add(3);
		length.add(4);
		length.add(4);
		length.add(5);
		while(!words.isEmpty()) {
			int totalL = 0;
			int numOfWords = 0;
			int spaces = 0;
			int numOfDot = 0;
			int extra = 0;
			String output = "";
			for(int i=0; i<words.size(); i++) {
				if((totalL+length.get(i))<=w) {
					totalL=totalL+length.get(i);
				}
				else {
					break;
				}
				if(w>=totalL) {
					numOfWords++;
				}
				else {
					break;
				}
				totalL++;
			}
			totalL--;
			if(numOfWords==1) {
				numOfDot = w-totalL;
				output = output + words.get(0);
				for(int j=0; j<numOfDot; j++) {
					output = output + ".";
				}
			}
			else {
				spaces = numOfWords-1;
				numOfDot = (w-totalL+spaces)/spaces;
				extra = (w-totalL+spaces)%spaces;
				for(int i=0;i<numOfWords;i++) {
					output = output + words.get(i);
					for(int j=0; j<numOfDot; j++) {
						output = output + ".";
					}
					if(extra>0) {
						output = output + ".";
					}
					extra--;
				}
			}
			while(numOfWords!=0) {
				words.remove(0);
				length.remove(0);
				numOfWords--;
			}
			output = output.substring(0, w);
			System.out.println(output);
		}
	}

}
