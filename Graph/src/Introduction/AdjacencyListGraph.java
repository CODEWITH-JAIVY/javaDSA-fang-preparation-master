package Introduction;

import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class AdjacentMatrixList {
    class edge {
        int vertex ;
        int weight ;
        edge(int vertex , int weight ) {
            this.vertex = vertex ;
            this.weight = weight ;
        }
    }

    int vertexes ;
    private ArrayList<ArrayList<edge>> adlist  ;

    AdjacentMatrixList(int vertexes ) {
        this.vertexes = vertexes ;
         adlist = new ArrayList<>() ;

         for (int i  =0 ; i < vertexes ; i++ ) {
             adlist.add(new ArrayList<>() ) ;
         }
    }
    // =============================================================
    //       // Undirected graph
    // ===============================================================

    private void  add( int u , int v , int weight ) {
        adlist.get(u).add(new edge(v , weight)) ;
        adlist.get(v).add(new edge(u , weight)) ;
    }

    private void printGraph () {
        for( int i  = 0 ; i< vertexes ; i++ ) {
            System.out.println("--> ");
            for( edge e : adlist.get(i)) {
                System.out.print("(" + e.vertex + ", " + e.weight + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
    }
}