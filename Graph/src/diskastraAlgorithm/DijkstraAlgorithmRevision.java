package diskastraAlgorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class DijkstraAlorithRevision {

    // edge
   class Edge {
       int to ;
       int weight  ;

       Edge(int to , int weight ) {
           this.to = to ;
           this.weight = weight ;
       }
   }
   // node for the
   static class Node implements Comparable<Node> {
       int vertex  ;
       int dist ;
        Node ( int vertex , int dist ) {
            this.vertex = vertex ;
            this.dist = dist ;
        }

       @Override
       public int compareTo(Node other ) {
           return this.dist - other.dist ;
       }
   }

   // priority queue
    public static void diskastraAlorith(List<List<Integer>>graph  ,int sourse  ) {
       int n = graph.size() ;

        int dist [] = new int[n] ;

        Arrays.fill(dist , Integer.MAX_VALUE);

        dist[sourse] =  0  ;

        PriorityQueue<Node> pq  = new PriorityQueue<>() ;
        pq.add(new Node(sourse , 0)) ;
        while (! pq.isEmpty()) {
            Node curre  = pq.poll() ;
            int u  = curre.vertex;

            for(Edge neighbour : graph.get(u)) {
                int v  = neighbour.to ;
                int weight  = neighbour.weight ;

                if(dist[u] + weight < dist[v]) {
                    dist[u] = dist[u]+weight ;
                    pq.add(new Node(v , dist[u])) ;
                }
            }
            System.out.println("Vertex   Distance from Source");
            for (int i = 0; i < n; i++) {
                System.out.println(i + " \t\t " + dist[i]);
            }
        }
    }


}