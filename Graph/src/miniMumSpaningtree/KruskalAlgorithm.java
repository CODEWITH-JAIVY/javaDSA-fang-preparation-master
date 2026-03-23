package miniMumSpaningtree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class KrusalkalAlgorithm  {
    int rank[] ;
    int parent []   ;

    record  edge (int vertex , int weight ) {}

    public int kruscalAlgorithm (ArrayList<ArrayList<edge>>graph ) {
        int n = graph.size() ;
        rank = new int[n] ;
        parent = new int[n] ;

        int total  = 0  ;
        ArrayList<ArrayList<edge>>mst  = new ArrayList<>() ;

        for (int i =0 ; i< n ; i++) {
            rank[i] = 0  ;
            parent  [i] = i  ;
        }

        ArrayList<ArrayList<edge>>edgeList = new ArrayList<>() ;
        for( ArrayList<edge> e : graph ) {
            e.size(e.get(0) , e.get(1) -> )
        }
    }

}