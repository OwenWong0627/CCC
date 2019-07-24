import java.io.*;
import java.util.*;

public class CCC07J4 {
  public static void main(String[] args) {
  //https://dmoj.ca/problem/ccc07j4
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String t = sc.nextLine();
    s = s.replace(" ", "");
    t = t.replace(" ", "");
    char[] S = s.toCharArray();
    char[] T = t.toCharArray();
    Arrays.sort(S);
    Arrays.sort(T);
    boolean solution = true;
    for (int i=0; i<S.length; i++){
      if(S[i]!=T[i]){
        solution = false;
        break;
      }
    }
    if(solution == true){
      System.out.println("Is an anagram.");
    }else{
      System.out.println("Is not an anagram.");
    }
    
    //      https://codeforces.com/problemset/problem/329/B
    // https://dmoj.ca/problem/ccc06j3
    // https://dmoj.ca/problem/ccc07s3
    // https://dmoj.ca/problem/ccc08j4
  }
}
