
package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    boolean visited;
    String data;
    ArrayList<Vertex> al;
  

    public String getData() {
        return data;
    }

    public Vertex(String data) {
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
