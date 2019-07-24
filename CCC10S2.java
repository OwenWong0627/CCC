import java.util.*;
import java.io.*;

//https://dmoj.ca/problem/ccc10s2

public class CCC10S2{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    String[] letters = new String[k];
    String[] numbers = new String[k];
    for(int i=0; i<k; i++){
      letters[i] = sc.next();
      numbers[i] = sc.next();
    }
    String code = sc.next();
    
    while(!code.isEmpty()){
      for(int i=0; i<k; i++){
        if(code.startsWith(numbers[i])){
          System.out.print(letters[i]);
          code = code.substring(numbers[i].length(),code.length());
        }
      }
    }
  }
}