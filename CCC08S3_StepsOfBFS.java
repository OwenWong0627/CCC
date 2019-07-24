import java.io.*;
import java.util.*;
//https://dmoj.ca/problem/dmopc13c1p4
//https://dmoj.ca/problem/ccc03s3
//steps for bfs
//1. initialize distance and add starting position to the queue
//Keep on looping until the queue is empty (no new nodes to visit)
//  1. extract the current node from the queue (guaranteed to be closest to the start position among points in the queue)
//  2. loop through each of the neighbours of our current node
//    if the node has not been visited:
//      update the distance for that node (marking it as visited)
//      add the node to the queue

//Queue
//Data structure where elements that enter (push) the queue first will exit (poll/pop) the queue first
//works like a queue in real life

//step 1: Store map into array of ArrayList (Adjacent list)
//store map into 2D array
//step 2: Initialize step array with Integer.MAX_VALUE;
//step 3: Create a queue LinkedList to store the processing order
//step 4: poll value one by one from queue
//step 5: continue looking through the neighbor, if not been visited yet update neighbor step value, also add the neighbor into queue.

public class CCC08S3_StepsOfBFS {
  
 
  public static void main(String[] args) {
    //gets input
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int test=0; test<t; test++){
      int r = sc.nextInt();
      int c = sc.nextInt();
      char[][] maze = new char[r][c];
      for (int R=0;R<r;R++){
        maze[R] = sc.next().toCharArray();
      }
      int[][] distance = new int[r][c];
      
      for(int i=0;i<r;++i){
        for(int j=0;j<c;++j){
          distance[i][j]=-1; 
        }
      }
      
      distance[0][0] = 1;
      
      LinkedList<Integer> queue = new LinkedList<Integer>();
      
      queue.add(0);
      
      int[] move={1, -1};
      
      while(!queue.isEmpty()){
        int currentPoint = queue.poll();
        int currentPointX=currentPoint/c;
        int currentPointY=currentPoint%c;
        
        //if we can move horizonally
        if(maze[currentPointX][currentPointY]=='+'||maze[currentPointX][currentPointY]=='-'){
          for(int i=0;i<2;++i){
            int destX = currentPointX;
            int destY = currentPointY+move[i];
            if(!(destY<0||destY>=c||distance[destX][destY]!=-1||maze[destX][destY]=='*')){
              distance[destX][destY]=distance[currentPointX][currentPointY]+1;
              queue.add(destX*c+destY);
            }
          }
        }
        
        //if we can move vertically
        if(maze[currentPointX][currentPointY]=='+'||maze[currentPointX][currentPointY]=='|'){
          for(int i=0;i<2;++i){
            int destX = currentPointX+move[i];
            int destY = currentPointY;
            if(!(destX<0||destX>=r||distance[destX][destY]!=-1||maze[destX][destY]=='*')){
              distance[destX][destY]=distance[currentPointX][currentPointY]+1;
              queue.add(destX*c+destY);
            }
          }
        }
      }
      System.out.println(distance[r-1][c-1]);
    }
}
}
