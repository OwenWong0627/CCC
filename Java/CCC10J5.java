import java.io.*;
import java.util.*;
public class CCC10J5 {
  
  //array storing min # of hops to get to a certain position
  static int[][] distance;
  
  // (1, 2), (1, -2), (2, 1), (2, -1), (-1, 2), (-1,-2), (-2, 1), (-2, -1)
  
  //representing each possible hop
  //how much you move along the x-axis for the current hop
  static int[] xMoves = {1, 1, 2, 2, -1, -1, -2, -2};
  //how much you move along the y-axis for the current hop
  static int[] yMoves= {2, -2, 1, -1, 2, -2, 1, -1};
  
  public static void main(String[] args) {
    //gets input
    Scanner sc = new Scanner(System.in);
    int startX = sc.nextInt();
    int startY = sc.nextInt();
    int endX=sc.nextInt();
    int endY=sc.nextInt();
    
    //makes input 0-indexed
    startX--;
    startY--;
    endX--;
    endY--;
    
    distance=new int[8][8];
    
    //initializes distance array (-1 means not visited yet)
    for(int i=0;i<8;++i){
      for(int j=0;j<8;++j){
        distance[i][j]=-1; 
      }
    }
    
    //sets distance for initial position
    distance[startX][startY]=0;
    
    //bfs start
    
    //creates queue for bfs
    Queue<Integer> queue=new LinkedList<>();
    
    //adds initial position for bfs to queue
    queue.add(startX*8+startY);
    
    //actually starts bfs
    //keeps on visiting new nodes until there are none left
    while(!queue.isEmpty()){
      //extracts current node for bfs
      int currentPoint = queue.poll();
      int currentPointX=currentPoint/8;
      int currentPointY=currentPoint%8;
      
      //loops through each possible move (neighbours)
      for(int i=0;i<8;++i){
        //r * #cols + c
        //point that you will move to from the current point if you make the current move
        int dest = (currentPointX+xMoves[i])*8+currentPointY+yMoves[i];
        int destX=currentPointX+xMoves[i];
        int destY=currentPointY+yMoves[i];
        
        //System.out.println(dest.x+" "+dest.y);
        
        //checks if point is not on the grid
        if(destX<0||destX>=8||destY<0||destY>=8){
          continue; 
        }
        
        //checks if the point has not already been visited
        if(distance[destX][destY]!=-1){
          continue; 
        }
        
        //updates distance for the point (moves from current point to that point)
        distance[destX][destY]=distance[currentPointX][currentPointY]+1;
        
        //adds point to the queue
        queue.add(dest);
      }
    }
    
    //bfs end
    
    System.out.println(distance[endX][endY]);
    
  }
}
