
package Algorithms;

import java.util.ArrayList;


public class BFSearch {
    boolean visited;
    String data;
    ArrayList<Vertex> al;
  
    public String getData() {
        return data;
    }

    public BFSearch(String data) {
        this.data = data;
        this.al = new ArrayList<>();
    }

    public void setData(String data) {
        this.data = data;
    }

    
    public ArrayList<Vertex> getEdges() {
        return al;
    }

    public void addEdge(Vertex edge) {
        this.al.add(edge);
    } 
    
}
