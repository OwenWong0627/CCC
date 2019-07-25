import java.util.Arrays;
import java.util.Scanner;
 
public class CCC17S4 {
    public static int[] parent;
 
    public static class Edge implements Comparable<Edge> {
        int bv;
        int ev;
        int cost;
        int active;  //0 means active
        //1 means inactive
        public Edge(int bv, int ev, int cost, int active) {
        	    this.bv = bv;
        	    this.ev = ev;
        	    this.cost = cost;
        	    this.active = active;
        }
        @Override
        public int compareTo(Edge o) {
            // TODO Auto-generated method stub
            if (this.cost<o.cost) {
                return -1;
            } else if (this.cost>o.cost) {
                return 1;
            } else {
                if (this.active<o.active) {
                    return -1;
                } else if (this.active>o.active) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
 
    }
 
    public static int find(int v) {
        if (parent[v]==-1) {
            return v;
        } else {
            return parent[v] = find(parent[v]);
        }
    }
 
    public static void union(int pb, int pe) {
        parent[pb] = pe;
    }
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  //city vertice
        int M = sc.nextInt();  //pipe edges
        int D = sc.nextInt();
        Edge[] edge = new Edge[M];
        parent = new int[N];
        Arrays.fill(parent, -1);
        Edge[] mst = new Edge[N-1];
        for (int i=0; i<M; i++) {
            int bv = sc.nextInt()-1;
            int ev = sc.nextInt()-1;
            int cost = sc.nextInt();
            int active = 1;
            if (i<N-1) {
                active = 0;
            } 
            edge[i] = new Edge(bv, ev, cost, active);
        }
        Arrays.sort(edge);
        int j=0;
        int day = 0;
        int max = 0;
        int maxn = 0;
        for (int i=0; i<M; i++) {
            int bv = edge[i].bv;
            int ev = edge[i].ev;
            int pb = find(bv);
            int pe = find(ev);
            if (pb!=pe) {
                union(pb, pe);
                mst[j] = edge[i];
                day = day + mst[j].active;
                max = mst[j].cost;
                maxn = mst[j].active;
                j++;
            }
        }
        if (maxn==1) {
            for (int i=0; i<N; i++) {
                parent[i] = -1;
            }
            for (int i=0; i<M; i++) {
                int cost = edge[i].cost;
                int bv = edge[i].bv;
                int ev = edge[i].ev;
                int pb = find(bv);
                int pe = find(ev);
                if (pb!=pe) {
                    if (cost<max || cost==max && edge[i].active==0) {
                        union(pb, pe);
                    } else if (edge[i].active==0 && cost-D<=0) {
                        day--;
                        break;
                    }
 
                }
            }
        }
        System.out.println(day);
 
    }
}
